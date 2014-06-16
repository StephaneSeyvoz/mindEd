package org.ow2.mindEd.adl.textual.ui.refactoring;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.resource.MoveResourceChange;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.refactoring.impl.AbstractProcessorBasedRenameParticipant;
import org.eclipse.xtext.ui.refactoring.ui.IRenameContextFactory;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.ow2.mindEd.adl.textual.fractal.AdlDefinition;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;
import org.ow2.mindEd.adl.textual.fractal.FileC;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindProject;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class FractalFileMoveParticipant extends AbstractProcessorBasedMoveParticipant {

	private String forcedNewName = null;

	@Inject
	private IRenameContextFactory renameContextFactory;

	/**
	 * The new name to be used by the RenameProcessor (Xtext's RenameElementProcessor in our case).
	 * 
	 * Our code inspired by {@link AbstractProcessorBasedRenameParticipant#getNewName} method usually
	 * returns the LTK UI user input argument: the new file name, which we do not want to apply to our model.
	 * 
	 * We refine this behaviour with the computed new ArchitectureDefinition name, according to the
	 * user-provided file name. "forcedNewName" is computed in our
	 * {@link FractalFileRenameParticipant#createRenameElementContexts} method.
	 * The getNewName method is used to configure the RenameProcessor in our parent {@link checkConditions}
	 * method.
	 */
	protected String getNewName() {
		return forcedNewName;
	};
	
	/**
	 * The currently edited ArchitectureDefinition grammar element.
	 */
	private ArchitectureDefinition renamedArchDef;
	
	/**
	 * The file targeted by the "Move" action.
	 */
	private IFile adlFile;
	
	/**
	 * This method has two roles:
	 * 1/ Preparing the IRenameElementContext with the good EObject (our ArchitectureDefinition in
	 * the .adl file)
	 * 2/ Prepare the good forcedNewName for the DefaultRenameStrategy and RenameElementProcessor
	 * 
	 * This method is very similar to the original FractalFileRenameParticipant since we want to
	 * trigger the same kind of ArchitectureDefinition rename changes (only difference is the final
	 * change action on the file: rename vs move and the input data).
	 * 
	 * @param element The original .adl IFile being renamed.
	 */
	@Override
	protected List<? extends IRenameElementContext> createRenameElementContexts(Object element) {

		if (renameContextFactory == null)
			return null;

		adlFile = (IFile) element;
		String path = adlFile.getFullPath().toString();
		URI uri = URI.createPlatformResourceURI(path, true);
		Resource xtextResource = new XtextResourceSet().getResource(uri, true);
		EList<EObject> xtextContents = xtextResource.getContents();

		// We have only one ADLDefinition per file
		if (xtextContents.size() == 1 && xtextContents.get(0) instanceof AdlDefinition) {

			AdlDefinition hostAdlDef = (AdlDefinition) xtextContents.get(0);
			renamedArchDef = hostAdlDef.getArchitectureDefinition();

			// New name computation for our inherited
			// AbstractProcessorBasedRenameParticipant#checkConditions
			// to get the right one (instead of the file name coming from AbstractProcessorBasedRenameParticipant#getNewName()
			String oldFullyQualifiedName = renamedArchDef.getName();

			// Comes from file refactoring UI (LTK)

			IContainer container = getDestination();

			// Protection
			if (!(container instanceof IFolder))
				return null;

			String shortName = oldFullyQualifiedName.substring(oldFullyQualifiedName.lastIndexOf('.') + 1);

			IFolder targetFolder = (IFolder) container;
			String newPackage = "";

			// TODO: Is the IFolder is a valid MindPathEntry in the current project ?
			MindProject adlHostProject = ModelToProjectUtil.INSTANCE.getMindProject(hostAdlDef.eResource().getURI());
			EList<MindPathEntry> mindPath = adlHostProject.getMindpathentries();
			for (MindPathEntry currentPath : mindPath)
				if (currentPath.getEntryKind() == MindPathKind.SOURCE) {
					String currentPathName = currentPath.getName();

					// let's use some defensive programming: it should always be false anyway, BUT... better check.
					if (!currentPathName.startsWith("/" + adlHostProject.getName() + "/"))
						continue;

					String targetFolderPortableFullPath = targetFolder.getFullPath().toPortableString();


					if (targetFolderPortableFullPath.startsWith(currentPathName)) {
						// found the corresponding mind path entry

						// protect from no-package case
						if (targetFolderPortableFullPath.equals(currentPathName))
							forcedNewName = shortName;
						else {
							newPackage = targetFolderPortableFullPath.substring(currentPathName.length() + 1).replace('/', '.');
							forcedNewName = newPackage + '.' + shortName;
						}
					}	
				}

			// We create a IRenameElementContext.Impl object with no "editor" information since it's not coming from an editor.
			// The framework resolves the right text sections from the EObjects informations anyway :)
			// We also skip the parent {@link AbstractProcessorBasedRenameParticipant#createRenameElementContexts} method since
			// it doesn't give us any more useful information in our scenario.
			URI renamedArchDefURI = EcoreUtil2.getPlatformResourceOrNormalizedURI(renamedArchDef);
			IRenameElementContext context = new FractalFileRenameElementContext(renamedArchDefURI, renamedArchDef.eClass());
			List<IRenameElementContext> contexts = com.google.common.collect.Lists.newArrayListWithCapacity(1);
			contexts.add(context);

			return contexts;
		}

		return null;
	}

	/**
	 * In some cases the order of changes is wrong, and MoveResourceChange
	 * happens before our CompositeChange and TextFileChange elements, leading to
	 * inconsistency and the infamous "End position lies outside document range"
	 * message.
	 * 
	 * We override the standard createChange to return nothing, and do the job in the "pre" phase by calling
	 * the right behaviour from the hidden super.createChange.
	 * 
	 * FYI:
	 * {@link org.eclipse.ltk.core.refactoring.participants.ProcessorBasedRefactoring#createChange} lines :348 - :355
	 * to see the order of execution and the construction of the different changes, their order etc.
	 * The "processorChange" is in our case the RenameResourceProcessor, so it has to come after our modifications
	 * 
	 * We couldn't apply the "postCreateChange" solution available in the following links since it is
	 * never called by the ProcessorBasedRefactoring class,
	 * that uses the "RenameResourceProcessor" and never our own RenameProcessor if we create one:
	 * {@link https://bugs.eclipse.org/bugs/show_bug.cgi?id=154238}
	 * and its implementation there:
	 * {@link http://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/plain/org.eclipse.jdt.ui/core%20refactoring/org/eclipse/jdt/internal/corext/refactoring/rename/RenamePackageProcessor.java}
	 * see the postCreateChange method inside, with the 
	 * "Sneak text changes in before the package rename to ensure modified files are still at original location"
	 * comment.
	 * 
	 */
	public Change createPreChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		return super.createChange(pm);
	}

	/**
	 * In some cases the order of changes is wrong, and MoveResourceChange
	 * happens before our CompositeChange and TextFileChange elements, leading to
	 * inconsistency and the infamous "End position lies outside document range"
	 * message.
	 * 
	 * We override the standard createChange to return nothing, and do the job in the "pre" phase by calling
	 * the right behaviour from the hidden super.createChange.
	 * 
	 * FYI:
	 * {@link org.eclipse.ltk.core.refactoring.participants.ProcessorBasedRefactoring#createChange} lines :348 - :355
	 * to see the order of execution and the construction of the different changes, their order etc.
	 * The "processorChange" is in our case the RenameResourceProcessor, so it has to come after our modifications
	 * 
	 * We couldn't apply the "postCreateChange" solution available in the following links since it is
	 * never called by the ProcessorBasedRefactoring class,
	 * that uses the "RenameResourceProcessor" and never our own RenameProcessor if we create one:
	 * {@link https://bugs.eclipse.org/bugs/show_bug.cgi?id=154238}
	 * and its implementation there:
	 * {@link http://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/plain/org.eclipse.jdt.ui/core%20refactoring/org/eclipse/jdt/internal/corext/refactoring/rename/RenamePackageProcessor.java}
	 * see the postCreateChange method inside, with the 
	 * "Sneak text changes in before the package rename to ensure modified files are still at original location"
	 * comment.
	 * 
	 */
	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException ,OperationCanceledException {
		
		CompositeChange sourceChanges = null;
		
		if (renamedArchDef instanceof PrimitiveDefinition) {
			for(FileC containedSource: EcoreUtil2.eAllOfType((PrimitiveDefinition) renamedArchDef, FileC.class)) {
				
				// We only handle simple names for now (getDirectory == null)
				if (containedSource.getDirectory() == null && adlFile.getParent() instanceof IFolder) {
					IFolder originalFolder = (IFolder) adlFile.getParent();
					IFile sourceFile = originalFolder.getFile(containedSource.getName());
					
					// File needs to be here
					if (sourceFile == null || !sourceFile.exists())
						continue;
					
					// Comes from file refactoring UI (LTK)
					IContainer container = getDestination();
					// Protection
					if (!(container instanceof IFolder))
						return null;
					IFolder targetFolder = (IFolder) container;
					
					// The C/C++ source file change
					Change currSourceChange = new MoveResourceChange(sourceFile, targetFolder);
					
					if (sourceChanges == null)
						sourceChanges = new CompositeChange("Component implementation changes from participant: " + getName());
					sourceChanges.add(currSourceChange);
				}
			}	
		}
		
		return sourceChanges;
	};

	/**
	 * 
	 */
	@Override
	protected List<EObject> getRenamedElementsOrProxies(EObject originalTarget) {
		List<EObject> list = new ArrayList<EObject>();
		list.add(originalTarget);
		return list;
	}

}

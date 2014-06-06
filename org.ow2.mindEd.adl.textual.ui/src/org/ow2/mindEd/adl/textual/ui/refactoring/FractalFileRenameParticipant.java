package org.ow2.mindEd.adl.textual.ui.refactoring;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.refactoring.impl.AbstractProcessorBasedRenameParticipant;
import org.eclipse.xtext.ui.refactoring.ui.IRenameContextFactory;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.ow2.mindEd.adl.textual.fractal.AdlDefinition;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;

import com.google.inject.Inject;

/**
 * This class is registered to Eclipse's LTK framework to trigger on file rename.
 * 
 * @see plugin.xml for <extension point="org.eclipse.ltk.core.refactoring.renameParticipants">
 * and the generated @see FractalExecutableExtensionFactory that will give Equinox a well
 * injected object. The renameParticipant is associated to the "adl" file extension.
 * 
 * It extends the Xtext standard behaviour for renaming, and forces a computed name
 * to be used by the DefaultRenameStrategy and RenameElementProcessor.
 * 
 * The {@link AbstractRenameStrategy#setName} method does the modification to our
 * ArchitectureDefinition in the model.
 * 
 * We also force the TextFileChange elements to be created by the framework in the
 * "createPreChange" method for it to happen before the triggering change (RenameResourceChange),
 * using the standard parent "createChange", and hiding it by our our returning null, for it not
 * to happen after the file (resource) renaming. (EObject's URIs coherency, related to the original
 * file). Xtext handles the URIs changes after the RenameResourceChange transparently for us.
 * 
 * We didn't need to define any special Strategy extending DefaultRenameStrategy since it already
 * fulfills its role with applyDeclaration / revertDeclaration / setName, according to the
 * IRenameElementContext we create in our createRenameElementContexts method, with the right
 * ArchitectureDefinition EObject and our forcedNewName.
 * 
 * For the injection to work well, we use the way described here:
 * http://www.eclipse.org/Xtext/documentation.html#equinoxSetup
 * http://koehnlein.blogspot.de/2012/11/xtext-tip-how-do-i-get-guice-injector.html
 */
@SuppressWarnings("restriction")
public class FractalFileRenameParticipant extends
AbstractProcessorBasedRenameParticipant {

	private String forcedNewName = null;

	@Inject
	private IRenameContextFactory renameContextFactory;

	/**
	 * The new name to be used by the RenameProcessor (Xtext's RenameElementProcessor in our case).
	 * 
	 * The {@link AbstractProcessorBasedRenameParticipant#getNewName} parent method usually returns
	 * the LTK UI user input argument: the new file name, which we do not want to apply to our model.
	 * 
	 * We override this behaviour with the computed new ArchitectureDefinition name, according to the
	 * user-provided file name. "forcedNewName" is computed in our
	 * {@link FractalFileRenameParticipant#createRenameElementContexts} method.
	 */
	@Override
	protected String getNewName() {
		return forcedNewName;
	};

	/**
	 * This method has two roles:
	 * 1/ Preparing the IRenameElementContext with the good EObject (our ArchitectureDefinition in
	 * the .adl file)
	 * 2/ Prepare the good forcedNewName for the DefaultRenameStrategy and RenameElementProcessor
	 * 
	 * @param element The original .adl IFile being renamed.
	 */
	@Override
	protected List<? extends IRenameElementContext> createRenameElementContexts(Object element) {

		if (renameContextFactory == null)
			return null;

		IFile adlFile = (IFile) element;
		String path = adlFile.getFullPath().toString();
		URI uri = URI.createPlatformResourceURI(path, true);
		Resource xtextResource = new XtextResourceSet().getResource(uri, true);
		EList<EObject> xtextContents = xtextResource.getContents();

		// We have only one ADLDefinition per file
		if (xtextContents.size() == 1 && xtextContents.get(0) instanceof AdlDefinition) {

			AdlDefinition hostAdlDef = (AdlDefinition) xtextContents.get(0);
			ArchitectureDefinition renamedArchDef = hostAdlDef.getArchitectureDefinition();

			// New name computation for our inherited
			// AbstractProcessorBasedRenameParticipant#checkConditions
			// to get the right one (instead of the file name coming from AbstractProcessorBasedRenameParticipant#getNewName()
			String oldFullyQualifiedName = renamedArchDef.getName();

			// Comes from file refactoring UI (LTK)
			String userFileNewName = super.getNewName();
			String shortNewName = userFileNewName.substring(0, userFileNewName.length() - 4); // Remove ".adl" extension 
			forcedNewName = oldFullyQualifiedName.substring(0, oldFullyQualifiedName.lastIndexOf('.') + 1) + shortNewName;

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
	 * In some cases the order of changes is wrong, and RenameResourceChange
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
	 * In some cases the order of changes is wrong, and RenameResourceChange
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
		return null;
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

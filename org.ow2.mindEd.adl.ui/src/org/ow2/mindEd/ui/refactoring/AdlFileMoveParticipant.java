package org.ow2.mindEd.ui.refactoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextChange;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.ISharableParticipant;
import org.eclipse.ltk.core.refactoring.participants.RefactoringArguments;
import org.eclipse.ltk.core.refactoring.participants.RenameProcessor;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.refactoring.impl.AbstractRenameProcessor;
import org.eclipse.xtext.ui.refactoring.impl.EditorDocumentChange;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.itf.InterfaceDefinition;
import org.ow2.mindEd.itf.ItfFile;

/**
 * This class is intended to allow moving BOTH .adl AND .itf files, and is shared for both types of content, so as not
 * to cause files corruption while moving .adl and .itf files cross-referenced by a same composite.
 *  
 * @author sesa231795
 *
 */
@SuppressWarnings("restriction")
public class AdlFileMoveParticipant extends AbstractProcessorBasedMoveParticipant implements ISharableParticipant {

	private static final Logger LOG = Logger.getLogger(AdlFileMoveParticipant.class);

	private Map<RenameProcessor, IFile>	processorAndFilePairs;
	private Map<IFile, String> 			fileAndNewNamePairs;

	protected String getNewName(RenameProcessor processor) {
		IFile targetFile = processorAndFilePairs.get(processor);
		return fileAndNewNamePairs.get(targetFile);
	};

	protected void setNewName(RenameProcessor processor) {
		((AbstractRenameProcessor) processor).setNewName(getNewName(processor));
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context)
			throws OperationCanceledException {
		SubMonitor progress = SubMonitor.convert(pm).setWorkRemaining(100);
		try {
			for (RenameProcessor wrappedProcessor : wrappedProcessors) {
				List<Object> targetElements = Arrays.asList(wrappedProcessor.getElements());
				if (!disabledTargets.containsAll(targetElements)) {
					setNewName(wrappedProcessor);
					status.merge(wrappedProcessor.checkInitialConditions(progress.newChild(20)));
					if(!status.getRefactoringStatus().hasFatalError())
						status.merge(wrappedProcessor.checkFinalConditions(progress.newChild(80), context));
				}
			}
		} catch (Exception ce) {
			status.add(IStatus.ERROR, "Error checking conditions in refactoring participant: {0}. See log for details", ce, LOG);
		}
		return status.getRefactoringStatus();
	}

	/**
	 * Enhanced version of @see {@link AbstractProcessorBasedMoveParticipant#initialize(Object)}
	 * to handle multiple files and according processors.
	 */
	@Override
	protected boolean initialize(Object currentElement) {

		if (!(currentElement instanceof IFile))
			return super.initialize(currentElement);

		try {
			if (wrappedProcessors == null)
				wrappedProcessors = new ArrayList<RenameProcessor>();
			if (processorAndFilePairs == null)
				processorAndFilePairs = new HashMap<RenameProcessor, IFile>();

			List<RenameProcessor> renameProcessors = getRenameProcessors(currentElement);
			wrappedProcessors.addAll(renameProcessors);

			for (RenameProcessor currProcessor : renameProcessors)
				processorAndFilePairs.put(currProcessor, (IFile) currentElement);

			if(wrappedProcessors != null) {
				syncUtil.totalSync(preferences.isSaveAllBeforeRefactoring());
				return true;
			}	
		} catch (Exception exc) {
			status.add(RefactoringStatus.ERROR, "Error initializing refactoring participant.", exc, LOG);
		}
		return false;

	}

	public ArchitectureDefinition getArchitectureDefinitionFromFile(IFile file) {
		ArchitectureDefinition archDef = null;

		String path = file.getFullPath().toString();
		URI uri = URI.createPlatformResourceURI(path, true);
		Resource xtextResource = new XtextResourceSet().getResource(uri, true);
		EList<EObject> xtextContents = xtextResource.getContents();

		// We have only one ADLDefinition per file
		if (xtextContents.size() == 1 && xtextContents.get(0) instanceof AdlDefinition) {
			AdlDefinition hostAdlDef = (AdlDefinition) xtextContents.get(0);
			archDef = hostAdlDef.getArchitectureDefinition();
		}

		return archDef;
	}

	public InterfaceDefinition getInterfaceDefinitionFromFile(IFile file) {
		InterfaceDefinition itfDef = null;

		String path = file.getFullPath().toString();
		URI uri = URI.createPlatformResourceURI(path, true);
		Resource xtextResource = new XtextResourceSet().getResource(uri, true);
		EList<EObject> xtextContents = xtextResource.getContents();

		// We have only one ItfFile per file
		if (xtextContents.size() == 1 && xtextContents.get(0) instanceof ItfFile) {
			ItfFile hostItfFile = (ItfFile) xtextContents.get(0);
			itfDef = hostItfFile.getInterface();
		}

		return itfDef;
	}

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

		String forcedNewName = null;
		String oldFullyQualifiedName = null;
		MindProject targetMindProject = null;

		// Used for mutual model work
		EObject currentEObject = null;

		if (!(element instanceof IFile))
			return null;
		IFile file = (IFile) element;
		
		// Comes from file refactoring UI (LTK)
		IContainer container = getDestination();

		// Protection
		if (!(container instanceof IFolder))
			return null;
		IFolder targetFolder = (IFolder) container;

		if (file.getFileExtension().equals("adl")) {
			ArchitectureDefinition archDef = getArchitectureDefinitionFromFile(file);
			currentEObject = archDef;

			// New name computation for our inherited
			// AbstractProcessorBasedRenameParticipant#checkConditions
			// to get the right one (instead of the file name coming from AbstractProcessorBasedRenameParticipant#getNewName()
			oldFullyQualifiedName = archDef.getName();


		} else if (file.getFileExtension().equals("itf")) {
			InterfaceDefinition itfDef = getInterfaceDefinitionFromFile(file);
			currentEObject = itfDef;

			// Same as above
			oldFullyQualifiedName = itfDef.getName();
		} else
			// This file doesn't concern us
			return null;
		
		targetMindProject = ModelToProjectUtil.INSTANCE.getMindProject(targetFolder.getProject());

		// Target folder is not a Mind Project
		if (targetMindProject == null)
			return null;

		String shortName = oldFullyQualifiedName.substring(oldFullyQualifiedName.lastIndexOf('.') + 1);

		String newPackage = "";

		EList<MindPathEntry> mindPath = targetMindProject.getMindpathentries();
		for (MindPathEntry currentPath : mindPath)
			if (currentPath.getEntryKind() == MindPathKind.SOURCE) {
				String currentPathName = currentPath.getName();

				// let's use some defensive programming: it should always be false anyway, BUT... better check.
				if (!currentPathName.startsWith("/" + targetMindProject.getName() + "/"))
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

		// Target folder wasn't in the Path of the target project: Do nothing
		if (forcedNewName == null)
			return null;
		
		if (fileAndNewNamePairs == null)
			fileAndNewNamePairs = new HashMap<IFile, String>();
			
		fileAndNewNamePairs.put(file, forcedNewName);

		// We create a IRenameElementContext.Impl object with no "editor" information since it's not coming from an editor.
		// The framework resolves the right text sections from the EObjects informations anyway :)
		// We also skip the parent {@link AbstractProcessorBasedRenameParticipant#createRenameElementContexts} method since
		// it doesn't give us any more useful information in our scenario.
		URI renamedArchDefURI = EcoreUtil2.getPlatformResourceOrNormalizedURI(currentEObject);
		IRenameElementContext context = new AdlFileRenameElementContext(renamedArchDefURI, currentEObject.eClass());
		List<IRenameElementContext> contexts = com.google.common.collect.Lists.newArrayListWithCapacity(1);
		contexts.add(context);

		return contexts;

	}

	/**
	 * Initialize is run on the first element (before addElement), the all following elements
	 * are added here. And for each of them we want to create the according processors.
	 */
	public void addElement(Object element, RefactoringArguments arguments) {

		if (element instanceof IFile)
			initialize(element);
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

		/*
		 * This change is composite and comes as an aggregation of the different processors results.
		 * As we have one processor per moved file and its according definition, we need to deal with
		 * cross-references and mutualize their TextEdit-s.
		 * 
		 * For example, if we have a "Composite" that "contains" 2 other components A and B, cross-referencing
		 * them, and A.adl and B.adl are targeted by a group "move" action:
		 * - This participant creates 2 processors, one for A definition, one for B definition 
		 * - Each processor will take care of the current definition / file and the cross-references
		 * - Each processor owns its own IRefactoringUpdateAcceptor (default implem : RefactoringUpdateAcceptor)
		 * that it calls to createCompositeChange (when our participant asks its parent class to createChange)
		 * - The RefactoringUpdateAcceptor#createCompositeChange method uses a document2textEdits map and should
		 * regroup each TextEdit per document in a MultiTextEdit to avoid file corruption (here, Composite.adl) ;
		 * however since we have 2 acceptors that have no knowledge of each other, we still obtain separate
		 * MultiTextEdit-s that can concern the same file (here, A's processor and acceptor impact Composite.adl,
		 * and B's processor and acceptor fill impact Composite.adl as well).
		 * 
		 * The TextEdit-s are created in RefactoringUpdateAcceptor#createCompositeChange with a call to
		 * Change change = document.createChange(name, multiTextEdit);
		 * where document is of type IRefactoringDocument which subtypes are defined in the
		 * DefaultRefactoringDocumentProvider inner classes, and the created Changes can be of the following types:
		 * - EditorDocumentChange
		 * - TextFileChange
		 * We use those elements to retrieve the concerned documents and regroup the Edits per file under mutual
		 * TextEdits.
		 * 
		 * The flatten + merge of the whole changes are done here.
		 * 
		 * Note: The same logic applies for our interfaces, that can be cross-referenced and moved as well,
		 * at the same time together, or moved together with ADLs (same file corruption issue fixed by 
		 * this shared MoveParticipant). 
		 */
		Change standardUnfilteredChange = super.createChange(pm);

		// Our logic
		CompositeChange flattenedAndMergedChange = new CompositeChange("Changes from participant: " + getName());
		flattenChanges(flattenedAndMergedChange, standardUnfilteredChange);
		mergeSameDocumentEdits(flattenedAndMergedChange, pm);

		return flattenedAndMergedChange;
	}

	private void mergeSameDocumentEdits(CompositeChange newChange, IProgressMonitor pm) {

		Map<IFile, Change> file2changeMap = new HashMap<IFile, Change>();
		List<Change> changes2remove = new ArrayList<Change>();

		Change[] children = newChange.getChildren();
		for (Change currChild : children) {

			IFile currChildFile = null;

			if (currChild instanceof TextFileChange) {

				TextFileChange textFileChange = (TextFileChange) currChild;
				currChildFile = textFileChange.getFile();

			} else if (currChild instanceof EditorDocumentChange) {

				EditorDocumentChange editorDocumentChange = (EditorDocumentChange) currChild;
				XtextEditor currEditor = (XtextEditor) editorDocumentChange.getEditor();
				IResource currResource = currEditor.getResource();
				if (currResource instanceof IFile) // what else ?
					currChildFile = (IFile) currResource;
			}

			if (currChildFile != null) {

				// IResources implement equals so maps work well here
				// see {@link IResource#equals(Object other)} documentation

				if (file2changeMap.containsKey(currChildFile)) {
					// A previous key exists ? do the merge !
					Change previousChange = file2changeMap.get(currChildFile);
					if (previousChange instanceof TextChange && currChild instanceof TextChange) {
						TextEdit previousTextEdit = ((TextChange) previousChange).getEdit();
						TextEdit currTextEdit = ((TextChange) currChild).getEdit();

						// both should always be according to {@link RefactoringUpdateAcceptor#createCompositeChange(String name, IProgressMonitor monitor)}
						if (previousTextEdit instanceof MultiTextEdit && currTextEdit instanceof MultiTextEdit) {
							TextEdit[] childrenOfCurrentEdit = ((MultiTextEdit) currTextEdit).removeChildren();
							previousTextEdit.addChildren(childrenOfCurrentEdit);

							// remove the Change from the list since it's been merged in the previous one
							changes2remove.add(currChild);
						}
					}
				} else
					// Unknown ? Add !
					file2changeMap.put(currChildFile, currChild);
			}

		}

		// Cleanup
		for (Change currChange2Remove : changes2remove)
			newChange.remove(currChange2Remove);

	}

	/**
	 * Flatten all sub-changes tree from CompositeChange-s into our newChange given as an argument.
	 * @param newChange
	 * @param change
	 */
	private void flattenChanges(CompositeChange newChange,
			Change change) {

		if (change instanceof CompositeChange) {

			Change[] childrenChanges = ((CompositeChange) change).getChildren();
			for (Change currChange : childrenChanges)
				flattenChanges(newChange, currChange);

		} else {
			CompositeChange parentChange = (CompositeChange) change.getParent();
			parentChange.remove(change);
			newChange.add(change);
		}


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

		//		if (renamedArchDef instanceof PrimitiveDefinition) {
		//			for(FileC containedSource: EcoreUtil2.eAllOfType((PrimitiveDefinition) renamedArchDef, FileC.class)) {
		//				
		//				// We only handle simple names for now (getDirectory == null)
		//				if (containedSource.getDirectory() == null && adlFile.getParent() instanceof IFolder) {
		//					IFolder originalFolder = (IFolder) adlFile.getParent();
		//					IFile sourceFile = originalFolder.getFile(containedSource.getName());
		//					
		//					// File needs to be here
		//					if (sourceFile == null || !sourceFile.exists())
		//						continue;
		//					
		//					// Comes from file refactoring UI (LTK)
		//					IContainer container = getDestination();
		//					// Protection
		//					if (!(container instanceof IFolder))
		//						return null;
		//					IFolder targetFolder = (IFolder) container;
		//					
		//					// The C/C++ source file change
		//					Change currSourceChange = new MoveResourceChange(sourceFile, targetFolder);
		//					
		//					if (sourceChanges == null)
		//						sourceChanges = new CompositeChange("Component implementation changes from participant: " + getName());
		//					sourceChanges.add(currSourceChange);
		//				}
		//			}	
		//		}

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

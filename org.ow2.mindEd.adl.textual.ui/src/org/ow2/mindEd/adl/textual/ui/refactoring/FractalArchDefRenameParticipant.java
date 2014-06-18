package org.ow2.mindEd.adl.textual.ui.refactoring;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.resource.MoveResourceChange;
import org.eclipse.ltk.core.refactoring.resource.RenameResourceChange;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.refactoring.impl.AbstractProcessorBasedRenameParticipant;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.eclipse.xtext.ui.util.ResourceUtil;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindProject;

/**
 * This Participant is used when a "Rename Element" right-click action is used in the ADL Xtext Editor.
 * The renameParticipant binding can be found in the @see plugin.xml descriptor.
 * Triggering conditions could be greatly improved for more precise filtering.
 * 
 * @author Stephane Seyvoz
 *
 */
@SuppressWarnings("restriction")
public class FractalArchDefRenameParticipant extends
AbstractProcessorBasedRenameParticipant {

	private ArchitectureDefinition renamedArchDef = null;

	/**
	 * Do we really want to enable this Participant or not ? (is it targeting an ArchitectureDefinition ?)
	 */
	@Override
	protected boolean initialize(Object originalTargetElement) {

		if (originalTargetElement instanceof IRenameElementContext) {

			IRenameElementContext context = (IRenameElementContext) originalTargetElement;

			URI targetElementURI = context.getTargetElementURI();

			if (targetElementURI == null)
				return false;

			Resource xtextResource = new XtextResourceSet().getResource(targetElementURI, true);
			EObject targetElementEObject = xtextResource.getResourceSet().getEObject(targetElementURI, true);

			if (targetElementEObject instanceof ArchitectureDefinition) {
				renamedArchDef = (ArchitectureDefinition) targetElementEObject;
				// check if everything is synchronized and RenameElementProcessor is OK, and enable
				return super.initialize(originalTargetElement);
			}

			// don't enable this participant
			return false;
		}

		// don't enable this participant
		return false;
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {

		// Only use if package is renamed
		IFolder newFolder = null;

		// At this point, the modification was already applied and then reverted,
		// so our renamedArchDef has already been restored to its original name.
		IFile file = ResourceUtil.getFile(renamedArchDef.eResource());

		String oldFullyQualifiedName = renamedArchDef.getName();
		String newFullyQualifiedName = getNewName();

		int countDotsInOld = 0;
		for (int i = 0; i < oldFullyQualifiedName.length() ; i++) {
			if (oldFullyQualifiedName.charAt(i) == '.')
				countDotsInOld++;
		}

		int lastIndexOfDotInOld = oldFullyQualifiedName.lastIndexOf('.');
		int lastIndexOfDotInNew = newFullyQualifiedName.lastIndexOf('.');

		// Prepare to detect package changes and trigger MoveResourceChange and / or RenameResourceChange when needed !
		String oldPackageName 	= oldFullyQualifiedName.substring(0, lastIndexOfDotInOld);
		String newPackageName 	= newFullyQualifiedName.substring(0, lastIndexOfDotInNew);

		String oldSimpleName 	= oldFullyQualifiedName.substring(lastIndexOfDotInOld + 1);
		String newSimpleName 	= newFullyQualifiedName.substring(lastIndexOfDotInNew + 1);

		// Prepare Changes
		CompositeChange compositeChange = new CompositeChange("Refined Changes from participant: " + getName());

		// Create Model elements changes (from RenameElementProcessor) before touching the file itself
		//Change superChanges = super.createChange(pm);
		//compositeChange.add(superChanges);

		if (!oldPackageName.equals(newPackageName)) {

			URI oldURI = renamedArchDef.eResource().getURI();
			String[] oldURIsegments = oldURI.segments();

			StringBuilder newURIbuilder = new StringBuilder();

			// We want to keep URI "/resource/Project/<src_path>/" without it followed by the original package and definition
			int segmentsToKeepCount = oldURI.segmentCount() - (countDotsInOld + 1);

			// Start from 1 to skip the "resource" first segment since the "createPlatformResourceURI" method will add it for us
			for (int j = 1 ; j < segmentsToKeepCount ; j++) {
				newURIbuilder.append(oldURIsegments[j]);
				newURIbuilder.append("/");
			}

			// We want a target folder (not a file)
			String newRelativePathFromNewFQN = newPackageName.replace('.', '/');
			newURIbuilder.append(newRelativePathFromNewFQN);

			IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
			newFolder = workspace.getRoot().getFolder(new Path(newURIbuilder.toString()));
			if (newFolder != null) {
				if (!newFolder.exists())
					newFolder.create(true, false, pm);

				compositeChange.add(new MoveResourceChange(file, newFolder));
			}
		}

		// Simple rename
		if (!oldSimpleName.equals(newSimpleName)) {
			String oldFileName = oldSimpleName + "." + file.getFileExtension();
			String newFileName = newSimpleName + "." + file.getFileExtension();
			
			IFile fileToRename = null;
			
			if (newFolder != null)
				fileToRename = newFolder.getFile(oldFileName);
			else
				fileToRename = file;
			
			if (fileToRename != null)
				compositeChange.add(new RenameResourceChange(fileToRename.getFullPath(), newFileName));
		}

		return compositeChange;
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

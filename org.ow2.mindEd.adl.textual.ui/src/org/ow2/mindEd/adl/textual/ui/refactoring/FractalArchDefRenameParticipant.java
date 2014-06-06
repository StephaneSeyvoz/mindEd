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
import org.eclipse.ltk.core.refactoring.resource.RenameResourceChange;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.refactoring.impl.AbstractProcessorBasedRenameParticipant;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.eclipse.xtext.ui.util.ResourceUtil;
import org.ow2.mindEd.adl.textual.fractal.AdlDefinition;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;

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
	 * Do we really want to enable this Participant or not ? (is it targetting an ArchitectureDefinition ?)
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
		
		IFile file = ResourceUtil.getFile(renamedArchDef.eResource());
		
		String newFullyQualifiedName = getNewName();
		
		int lastIndexOf = newFullyQualifiedName.lastIndexOf('.');
		
		// TODO: Use this to detect package changes and trigger a MoveResourceChange instead of a RenameResourceChange when needed !
		String packageName = newFullyQualifiedName.substring(0, lastIndexOf);
		
		String newShortName = newFullyQualifiedName.substring(lastIndexOf + 1);
		String fileName = newShortName + "." + file.getFileExtension();
		
		return new RenameResourceChange(file.getFullPath(), fileName);
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

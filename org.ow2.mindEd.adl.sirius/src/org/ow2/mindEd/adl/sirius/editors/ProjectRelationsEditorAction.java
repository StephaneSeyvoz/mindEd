package org.ow2.mindEd.adl.sirius.editors;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * This class implements the "org.eclipse.ui.popupMenus" extension point to provide the 
 * "Show Mind definitions relations" action, realized in the ProjectRelationsEditor class.
 * @author sesa231795
 *
 */
public class ProjectRelationsEditorAction implements IObjectActionDelegate {

	private ISelection selection;
	private ProjectRelationsEditor editor;
	
	@Override
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator it = ((IStructuredSelection) selection).iterator() ; it.hasNext(); ) {
				
				Object element = it.next();
				IProject project = null;
				
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element)
							.getAdapter(IProject.class);
				}
				
				if (project != null) {
					editor = new ProjectRelationsEditor();
					editor.open(project);
				}
			}
		}

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart workbenchPart) {
		// do nothing
	}

}

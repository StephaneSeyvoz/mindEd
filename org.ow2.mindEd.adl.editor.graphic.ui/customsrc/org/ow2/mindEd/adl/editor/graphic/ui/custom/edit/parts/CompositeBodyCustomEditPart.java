package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.CompositeBodyEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindBodyEditPart;

public class CompositeBodyCustomEditPart extends CompositeBodyEditPart {

	@Override
	public void setLayoutConstraint(EditPart child, IFigure childFigure,
			Object constraint) {
		if ((genericEditPart.setLayoutConstraint(child,childFigure,constraint)) == false)
		super.setLayoutConstraint(child, childFigure, constraint);
	}

	public CompositeBodyCustomEditPart(View view) {
		super(view);
	}
	
	
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (genericEditPart.removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}
	
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(genericEditPart.addChildVisual(childEditPart, index))
			return;
		super.addChildVisual(childEditPart, index);
	}
	
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		IFigure fig = ((MindBodyEditPart)genericEditPart).getContentPaneFor(editPart);
		if (fig != null)
			return fig;
		else
			return super.getContentPaneFor(editPart);
	}

}
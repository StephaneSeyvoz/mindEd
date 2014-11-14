package org.ow2.mindEd.adl.sirius.style.custom.gmf;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.Square;
import org.eclipse.sirius.diagram.ui.edit.api.part.IStyleEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.SquareEditPart;
import org.eclipse.sirius.ui.tools.api.color.VisualBindingManager;

/**
 * See https://www.eclipse.org/sirius/doc/developer/extensions-provide_custom_style.html
 * For more info.
 * @author Stephane Seyvoz
 *
 */
public class SubRequiredInterfaceDefinitionStyleEditPart extends SquareEditPart implements IStyleEditPart {

	/**
     * the primary shape.
     */
    protected ImageFigure primaryShape;

	public SubRequiredInterfaceDefinitionStyleEditPart(View view) {
		super(view);
	}

	/**
     * @not-generated
     * @see org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart#refreshBackgroundColor()
     */
	@Override
    protected void refreshBackgroundColor() {
        if (getMetamodelType().isInstance(resolveSemanticElement())) {
            Square square = (Square) this.resolveSemanticElement();
            if (square.getColor() != null) {
                this.getPrimaryShape().setBackgroundColor(VisualBindingManager.getDefault().getColorFromRGBValues(square.getColor()));
            }
        }
    }

    /**
     * @not-generated
     * @see org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart#refreshForegroundColor()
     */
	@Override
    protected void refreshForegroundColor() {
        if (getMetamodelType().isInstance(resolveSemanticElement())) {
            Square square = (Square) this.resolveSemanticElement();
            if (square.getBorderColor() != null) {
                this.getPrimaryShape().setForegroundColor(VisualBindingManager.getDefault().getColorFromName("light_green"));
            }
        }
    }
	
}

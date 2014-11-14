package org.ow2.mindEd.adl.sirius.style.custom.gmf;

import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.CustomStyle;

public class ArchDiagEditPartProvider extends AbstractEditPartProvider {

	@Override
	protected Class getNodeEditPartClass(View view) {
		if (view.getElement() instanceof CustomStyle) {
			CustomStyle customStyle = (CustomStyle) view.getElement();
			if (customStyle.getId().equals(ArchDiagConstants.SUB_REQUIRED_INTERFACEDEFINITION_STYLE_ID)) {
				return SubRequiredInterfaceDefinitionStyleEditPart.class;
			}
		}
		return super.getNodeEditPartClass(view);
	}

}

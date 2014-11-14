package org.ow2.mindEd.adl.sirius.style.custom.gmf;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;

@SuppressWarnings("restriction")
public class ArchDiagEditPartProvider extends AbstractEditPartProvider {

	@Override
	protected Class getNodeEditPartClass(View view) {
		
		//System.out.println("[SSZ Dirty Debug - ArchDiagEditPartProvider] view.getElement() class: " + view.getElement().getClass().getName());
		
		EObject viewElement = view.getElement();
		
		if (viewElement instanceof DNodeSpec) {
			
			DNodeSpec nodeSpec = (DNodeSpec) viewElement;
			if ("sub_RequiredInterfaceDefinition".equals(nodeSpec.getActualMapping().getName()))
				/*
				 * SSZ TODO: Change to return our own customized EditPart.class
				 * it most probably should extend AbstractBorderedDiagramElementEditPart
				 * or a class implementing IAbstractDiagramNodeEditPart for
				 * createBorderItemLocator to be implemented and provide our specific positioning
				 */
				return SubRequiredInterfaceDefinitionEditPart.class;
			
			// Just use it for breakpoint
			return super.getNodeEditPartClass(view);
		} else if (viewElement instanceof DNodeContainerSpec) {
			
			DNodeContainerSpec nodeSpec = (DNodeContainerSpec) viewElement;
			if ("SubComponentDefinition".equals(nodeSpec.getActualMapping().getName()))
				/*
				 * SSZ TODO: Change to return our own customized EditPart.class
				 * it most probably should extend AbstractBorderedDiagramElementEditPart
				 * or a class implementing IAbstractDiagramNodeEditPart for
				 * createBorderItemLocator to be implemented and provide our specific positioning
				 */
				return SubComponentDefinitionEditPart.class;
			
			// Just use it for breakpoint
			return super.getNodeEditPartClass(view);
			
		}
		return super.getNodeEditPartClass(view);
	}
	
	/** 
	 * TODO SSZ: Investigate this part for Edge style overriding !
	 * 
	 * Gets a connection's editpart class. 
	 * This method should be overridden by a provider if it wants to provide this service. 
	 * @param view the view to be <i>controlled</code> by the created editpart
	 * @return <code>Class</code>
	 */
	protected Class getEdgeEditPartClass(View view ) {
		return super.getEdgeEditPartClass(view);
	}

}

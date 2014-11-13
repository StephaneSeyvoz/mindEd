package org.ow2.mindEd.adl.sirius.style;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.business.api.query.DDiagramElementQuery;
import org.eclipse.sirius.diagram.ui.tools.api.figure.locator.DBorderItemLocator;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.BorderItemLocatorProvider;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.IBorderItemOffsets;

/**
 * An alternative to DefaultBorderItemLocatorProvider that did not take care of interface positioning.
 * @author Stephane Seyvoz
 *
 */
public class MindBorderItemLocatorProvider implements BorderItemLocatorProvider {

	/** The shared instance. */
    private static MindBorderItemLocatorProvider instance = new MindBorderItemLocatorProvider();

    /**
     * Avoid instantiation from external.
     */
    private MindBorderItemLocatorProvider() {
        // empty.
    }

    /**
     * Return the shared instance.
     * 
     * @return the shared instance.
     */
    public static MindBorderItemLocatorProvider getInstance() {
        return instance;
    }

    /**
     * Return the border item locator to use for the specified figure.
     * 
     * @param figure
     *            the figure.
     * @param diagramElementOwner
     *            the view point element that owns the border item.
     * @param diagramElementBorderItem
     *            the view point element on border.
     * @return the border item locator to use for the specified figure.
     */
    public IBorderItemLocator getBorderItemLocator(final IFigure figure, final DDiagramElement vpElementOwner, final DDiagramElement diagramElementBorderItem) {
        
    	BorderItemLocator locator;
    	
    	String mappingName = diagramElementBorderItem.getMapping().getName();
    	
    	if (mappingName.equals("sub_ProvidedInterfaceDefinition")
				|| mappingName.equals("Inherited_sub_ProvidedInterfaceDefinition")
				|| mappingName.equals("CompositeProvidedInterfaceDefinition")
				|| mappingName.equals("InheritedCompositeProvidedInterfaceDefinition"))
			locator = new BorderItemLocator(figure, PositionConstants.WEST);	
    	else if (mappingName.equals("sub_RequiredInterfaceDefinition")
				|| mappingName.equals("Inherited_sub_RequiredInterfaceDefinition")
				|| mappingName.equals("CompositeRequiredInterfaceDefinition")
				|| mappingName.equals("InheritedCompositeRequiredInterfaceDefinition"))
    		locator = new BorderItemLocator(figure, PositionConstants.EAST);
    	else 
    		locator = new DBorderItemLocator(figure, PositionConstants.NSEW); // framework default
    	
    	if (new DDiagramElementQuery(diagramElementBorderItem).isIndirectlyCollapsed()) {
            locator.setBorderItemOffset(IBorderItemOffsets.COLLAPSE_FILTER_OFFSET);
        } else {
            locator.setBorderItemOffset(IBorderItemOffsets.DEFAULT_OFFSET);
        }
        return locator;
    }
	
}

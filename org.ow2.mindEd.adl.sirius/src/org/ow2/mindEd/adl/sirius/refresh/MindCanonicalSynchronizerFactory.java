/**
 * 
 */
package org.ow2.mindEd.adl.sirius.refresh;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizer;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizerFactory;
import org.ow2.mindEd.adl.sirius.refresh.diagram.MindDDiagramCanonicalSynchronizer;

/**
 * This class just allows to start overriding the whole chain specific methods only for Edge routing style customization purposes,
 * such as configuring edges in order to enable "Avoid Obstructions" and "Closest Distance" in our custom DEdgeViewFactory in the end. 
 * 
 * This class serves the "org.eclipse.sirius.diagram.canonicalSynchronizerFactoryOverride" extension point.
 * 
 * Explanation:
 * Even if the CanonicalSynchronizerFactory interface is not supposed to be implemented by clients,
 * since the original org.eclipse.sirius.diagram.ui.internal.refresh.factory.CanonicalSynchronizerFactoryImpl
 * implementation creates  org.eclipse.sirius.diagram.ui.internal.refresh.diagram.DDiagramCanonicalSynchronizer
 * that is hardcoded to create (via its super-type AbstractCanonicalSynchronizer) :
 * protected IViewProvider viewpointViewProvider = new SiriusViewProvider(); (AbstractCanonicalSynchronizer.java:83)
 * provided to the ConnectionsFactory (DDiagramCanonicalSynchronizer constructor) that itself cannot be replaced by an
 * extension point, in the end, the ConnectionsFactory#createEdge method always calls viewpointViewProvider.createEdge
 * at line 132, forced to be the SiriusViewProvider, even if we extended the org.eclipse.gmf.runtime.diagram.core.viewProviders
 * extension point with our own to replace SiriusViewProvider: it only works for Nodes, not Edges, limiting our possibility
 * to customize the SiriusViewProvider#getEdgeViewClass method to return a customized DEdgeViewFactory with a RoutingStyle
 * enabling "Avoid Obstructions" or "ClosestDistance" by default.
 *
 * Note: This extension point is only available since Sirius 2.0.0, see:
 * https://www.eclipse.org/sirius/doc/Release%20Notes.html
 * 
 * @author Stephane Seyvoz
 *
 */
public class MindCanonicalSynchronizerFactory implements
		CanonicalSynchronizerFactory {
	
	/**
     * Provides a {@link MindDDiagramCanonicalSynchronizer} to synchronize a {@link Diagram}.
     * 
     * {@inheritDoc}
     */
    public CanonicalSynchronizer createCanonicalSynchronizer(Diagram gmfDiagram) {
        CanonicalSynchronizer canonicalSynchronizer = new MindDDiagramCanonicalSynchronizer(gmfDiagram);
        return canonicalSynchronizer;
    }

}

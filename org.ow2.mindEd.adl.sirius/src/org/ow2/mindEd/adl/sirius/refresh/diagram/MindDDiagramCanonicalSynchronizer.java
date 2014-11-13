package org.ow2.mindEd.adl.sirius.refresh.diagram;

import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.sirius.diagram.ui.internal.refresh.diagram.ConnectionsFactory;
import org.eclipse.sirius.diagram.ui.internal.refresh.diagram.DDiagramCanonicalSynchronizer;
import org.ow2.mindEd.adl.sirius.providers.MindSiriusViewProvider;

/**
 * Synchronizer allowing to synchronize a DSemanticDiagram with its
 * corresponding GMFDiagram.
 * 
 * @author Stephane Seyvoz
 */
@SuppressWarnings("restriction")
public class MindDDiagramCanonicalSynchronizer extends
		DDiagramCanonicalSynchronizer {
	
	/**
     * Customized Sirius GMF notation model View factory.
     * The original hardcoded SiriusViewProvider did not allow to replace the
     * default edge styles.
     */
    protected IViewProvider viewpointViewProvider = new MindSiriusViewProvider();
	
	public MindDDiagramCanonicalSynchronizer(Diagram gmfDiagram) {
		super(gmfDiagram);
		
		// force to override if the super class did not use ours ?
		//this.connectionsFactory = new ConnectionsFactory(gmfDiagram, viewpointViewProvider);
	}

}

package org.ow2.mindEd.adl.sirius.style;

import java.util.Collection;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RoutingStyle;

public class EnableAvoidObstructionsEdgesRoutingStyleCommand extends RecordingCommand {

	private final Collection<Edge> edges;

	/**
	 * Constructor.
	 * 
	 * @param domain
	 *            the editing domain.
	 * @param edge
	 *            the edge to update.
	 */
	public EnableAvoidObstructionsEdgesRoutingStyleCommand(TransactionalEditingDomain domain, Collection<Edge> edges) {
		super(domain, "Enabling \"Avoid obstructions\" routing style for Edges");
		this.edges = edges;
	}

	/**
	 * Applies GMF's "Avoid Obstruction" routing style setting to the Edge.
	 */
	@Override
	protected void doExecute() {
		if (edges == null || edges.isEmpty()) {
			return;
		}

		RoutingStyle currRStyle;
		for (Edge currEdge : edges) {
			// Logic inspired by Sirius DEdgeViewFactory, see SiriusViewProvider as well
			currRStyle = (RoutingStyle) currEdge.getStyle(NotationPackage.eINSTANCE.getRoutingStyle());
			if (currRStyle != null)
				currRStyle.setAvoidObstructions(true);
		}
	}

}

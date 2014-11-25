package org.ow2.mindEd.adl.sirius.style;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;

/**
 * Note: This solution should be a TEMPORARY FIX, and be removed if Sirius officially supports the setting one day.
 * @author Stephane Seyvoz
 *
 */
public class AvoidObstructionsEdgesStyleFixTrigger implements ModelChangeTrigger {
	
	public static final NotificationFilter IS_EDGE = new NotificationFilter.Custom() {

		public boolean matches(Notification input) {
			
			/*
			 * Current target type is Edge.
			 * Determined with a breakpoint in DEdgeViewFactory#decorateView, where only EdgeImpl objects were met.
			 * More knowledge about Sirius behavior would be nice to be certain.
			 * 
			 * Note: This not only covers Edge / EdgeImpl objects but Connector / ConnectorImpl sub-types as well, just in case.
			 */
			return input.getNotifier() instanceof Edge; 
		}
	};

	@Override
	public Option<Command> localChangesAboutToCommit(
			Collection<Notification> notifications) {
		
		// Handle the "IS_EDGE"-filtered objects
		for (Notification currNotification : notifications) {
			
			// Logic inspired by Sirius DEdgeViewFactory, see SiriusViewProvider as well
			Edge edge = (Edge) currNotification.getNotifier();
			
			// Get existing style, enable GMF "Avoid obstructions"
			RoutingStyle rstyle = (RoutingStyle) edge.getStyle(NotationPackage.eINSTANCE.getRoutingStyle());
			if (rstyle != null)
				rstyle.setAvoidObstructions(true);
		}
		
		// We do not need to execute any RecordingCommand (transaction on the model)
		return Options.newNone();
	}

	public static final int PRIORITY = 0;
	
	@Override
	public int priority() {
		return PRIORITY;
	}
	
}

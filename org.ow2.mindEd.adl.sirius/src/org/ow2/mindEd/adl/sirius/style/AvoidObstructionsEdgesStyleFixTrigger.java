package org.ow2.mindEd.adl.sirius.style;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;

import com.google.common.collect.Lists;

/**
 * Note: This solution should be a TEMPORARY FIX, and be removed if Sirius officially supports the setting one day.
 * @author Stephane Seyvoz
 *
 */
public class AvoidObstructionsEdgesStyleFixTrigger implements ModelChangeTrigger {

	/**
	 * Changes have to happen in a transactional editing domain.
	 */
	private TransactionalEditingDomain domain;

	public AvoidObstructionsEdgesStyleFixTrigger(TransactionalEditingDomain transactionalEditingDomain) {
		this.domain = transactionalEditingDomain;
	}

	/**
	 * A notification filter allowing to trigger for ADD / ADD_MANY events on Edges.
	 */
	public static final NotificationFilter ADDED_EDGE_S = new NotificationFilter.Custom() {

		@SuppressWarnings("rawtypes")
		public boolean matches(Notification input) {

			// Note: Checking for Edge not only covers EdgeImpl objects but Connector / ConnectorImpl sub-types as well, just in case.

			switch (input.getEventType()) {
			case Notification.ADD_MANY:
				List newValues = (List) input.getNewValue();
				if (newValues.get(0) instanceof Edge) // all others will be type-coherent anyway
					return true;
				else
					return false;
			case Notification.ADD:
				return input.getNewValue() instanceof Edge;
			default:
				return false;
			}
		}
	};

	@Override
	public Option<Command> localChangesAboutToCommit(
			Collection<Notification> notifications) {

		final Collection<Edge> edges = Lists.newArrayList();

		for (Notification currNotification : notifications) {
			Object newValue = currNotification.getNewValue();
			if (newValue instanceof Edge)
				edges.add((Edge) newValue);
		}

		Command command = new EnableAvoidObstructionsEdgesRoutingStyleCommand(domain, edges);

		return Options.newSome(command);
	}

	public static final int PRIORITY = 0;

	@Override
	public int priority() {
		return PRIORITY;
	}

}

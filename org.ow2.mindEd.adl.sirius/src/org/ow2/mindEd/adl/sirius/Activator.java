package org.ow2.mindEd.adl.sirius;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.ow2.mindEd.adl.sirius.style.AvoidObstructionsEdgesStyleFixTrigger;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "org.ow2.mindEd.adl.sirius";

	// The shared instance
	private static Activator plugin;

	private static Set<Viewpoint> viewpoints; 

	// Used to track sessions
	private SessionManagerListener sessionEventNotifier;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		viewpoints = new HashSet<Viewpoint>();
		viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/Adl.odesign"));

		/* Used to track sessions
		 * In our specific, case we'll "hack" edges creation to trigger GMF's "Avoid Obstructions" setting, thanks to the
		 * Sirius SessionEventBroker.
		 * 
		 * See:
		 * - https://www.eclipse.org/forums/index.php?t=msg&th=861646&goto=1479379&#msg_1479379
		 * - http://git.eclipse.org/c/sirius/org.eclipse.sirius.git/plain/plugins/org.eclipse.sirius/src/org/eclipse/sirius/business/api/session/SessionEventBroker.java
		 * - http://git.eclipse.org/c/ecoretools/org.eclipse.ecoretools.git/tree/org.eclipse.emf.ecoretools.design/src/org/eclipse/emf/ecoretools/design/service/EcoreToolsDesignPlugin.java
		 * (line 127)
		 * 
		 * Note: This solution should be a TEMPORARY FIX, and be removed if Sirius officially supports it one day.
		 */
		sessionEventNotifier = new SessionManagerListener.Stub() {

			@Override
			public void notifyAddSession(Session newSession) {

				// Only works at project .aird file initialization
				newSession.getEventBroker().addLocalTrigger(AvoidObstructionsEdgesStyleFixTrigger.IS_EDGE, new AvoidObstructionsEdgesStyleFixTrigger());
			}
			
			@Override
			public void notify(final Session updatedSession, final int notification) {
			
				// For later session events
				
				// TODO: Not sure about the notification kinds we should care about, investigate
				if (notification == SessionListener.OPENING 							// Session opening
						|| notification == SessionListener.SYNC							// Save representation
						|| notification == SessionListener.REPRESENTATION_CHANGE		// NOT SURE IF NEEDED
						|| notification == SessionListener.SELECTED_VIEWS_CHANGE_KIND	// NOT SURE IF NEEDED
						|| notification == SessionListener.SEMANTIC_CHANGE)				// Sync on semantic change (text edition...)
					updatedSession.getEventBroker().addLocalTrigger(AvoidObstructionsEdgesStyleFixTrigger.IS_EDGE, new AvoidObstructionsEdgesStyleFixTrigger());
	        }
			
			// Note: Other listener methods are available to be implemented if needed.
		};

		SessionManager.INSTANCE.addSessionsListener(sessionEventNotifier);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		if (viewpoints != null) {
			for (final Viewpoint viewpoint: viewpoints) {
				ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
			}
			viewpoints.clear();
			viewpoints = null; 
		}

		if (sessionEventNotifier != null) {
			SessionManager.INSTANCE.removeSessionsListener(sessionEventNotifier);
		}

		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
}

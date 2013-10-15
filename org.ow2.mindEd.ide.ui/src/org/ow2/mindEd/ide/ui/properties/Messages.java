package org.ow2.mindEd.ide.ui.properties;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.ow2.mindEd.ide.ui.properties.messages"; //$NON-NLS-1$
	public static String ApplicationWizardPage_AppName;
	public static String ApplicationWizardPage_FilterMessage;
	public static String ApplicationWizardPage_InvalidAppName;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}

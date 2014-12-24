package org.ow2.mindEd.adl.sirius.style;

import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.BorderItemLocatorProvider;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.SimpleStyleConfiguration;

public class MindStyleConfiguration extends SimpleStyleConfiguration {

	@Override
	public BorderItemLocatorProvider getBorderItemLocatorProvider() {
		return MindBorderItemLocatorProvider.getInstance();
	}

}

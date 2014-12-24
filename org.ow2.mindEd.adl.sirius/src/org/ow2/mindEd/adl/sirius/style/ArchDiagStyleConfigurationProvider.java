package org.ow2.mindEd.adl.sirius.style;

import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.IStyleConfigurationProvider;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.StyleConfiguration;
import org.eclipse.sirius.viewpoint.Style;

public class ArchDiagStyleConfigurationProvider implements IStyleConfigurationProvider {

	/**
	 * Enabled for our SubComponentDefinition elements, that are represented as Containers.
	 */
	@Override
	public boolean provides(DiagramElementMapping mapping, Style style) {

		if (mapping instanceof ContainerMapping) {
			ContainerMapping containerMapping = (ContainerMapping) mapping;
			if (containerMapping.getName() != null && containerMapping.getName().equals("SubComponentDefinition"))
				return true;
		}

		return false;
	}

	@Override
	public StyleConfiguration createStyleConfiguration(
			DiagramElementMapping mapping, Style style) {

		if (mapping instanceof ContainerMapping) {
			ContainerMapping containerMapping = (ContainerMapping) mapping;
			if (containerMapping.getName() != null && containerMapping.getName().equals("SubComponentDefinition")) {
				return new MindStyleConfiguration();
			}
		}

		return null;
	}

}

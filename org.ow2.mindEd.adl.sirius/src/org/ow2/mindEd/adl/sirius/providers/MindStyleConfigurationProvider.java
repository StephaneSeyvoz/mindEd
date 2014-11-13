/**
 * 
 */
package org.ow2.mindEd.adl.sirius.providers;

import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.IStyleConfigurationProvider;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.StyleConfiguration;
import org.eclipse.sirius.viewpoint.Style;
import org.ow2.mindEd.adl.sirius.style.MindStyleConfiguration;

/**
 * A provider of style configuration.
 * @author Stephane Seyvoz
 *
 */
public class MindStyleConfigurationProvider implements
IStyleConfigurationProvider {

	/**
	 * Create a style configuration for the specified style and mapping.
	 * 
	 * @param mapping
	 *            the mapping.
	 * @param style
	 *            the style.
	 * @return the new style configuration.
	 */
	@Override
	public StyleConfiguration createStyleConfiguration(
			DiagramElementMapping mapping, Style style) {

		if (mapping.getName().equals("CompositeDefinition")
				|| mapping.getName().equals("ExtendedCompositeDefinition")
				|| mapping.getName().equals("SubComponentDefinition")
				|| mapping.getName().equals("InheritedSubComponentDefinition"))
			return new MindStyleConfiguration();

		// error case, we should never be there if "provides" is implemented well - maybe use SimpleStyleConfiguration in this case ?
		return null;
	}

	/**
	 * Return <code>true</code> if this provider provides a configuration for
	 * the specified {@link DiagramElementMapping} and {@link Style}.
	 * 
	 * @param mapping
	 *            the mapping.
	 * @param style
	 *            the style.
	 * @return <code>true</code> if this provider provides a configuration for
	 *         the specified {@link DiagramElementMapping} and {@link Style}.
	 */
	@Override
	public boolean provides(DiagramElementMapping mapping, Style style) {

		if (mapping.getName().equals("CompositeDefinition")
				|| mapping.getName().equals("ExtendedCompositeDefinition")
				|| mapping.getName().equals("SubComponentDefinition")
				|| mapping.getName().equals("InheritedSubComponentDefinition"))
			return true;

		return false;
	}

}

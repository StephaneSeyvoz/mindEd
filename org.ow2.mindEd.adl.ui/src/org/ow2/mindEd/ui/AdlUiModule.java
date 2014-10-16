/*
 * generated by Xtext
 */
package org.ow2.mindEd.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.refactoring.IRenameStrategy;
import org.ow2.mindEd.ui.highlighting.AntlrTokenToAttributeIdMapper;
import org.ow2.mindEd.ui.highlighting.LexicalHighlightingConfiguration;
import org.ow2.mindEd.ui.navigation.AdlHyperlink;
import org.ow2.mindEd.ui.refactoring.AdlRenameStrategy;
import org.ow2.mindEd.ui.resource.AdlResourceUIServiceProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
@SuppressWarnings("restriction")
public class AdlUiModule extends org.ow2.mindEd.ui.AbstractAdlUiModule {
	public AdlUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	/**
	 * Hyperlinks
	 * @return
	 */
	public Class<? extends IHyperlinkHelper> bindIHyperlinkHelper() {
		return AdlHyperlink.class;
	}
	
	/**
	 * register mapping tokens to IDs
	 * @return MIND ADL tokens mapping
	 */

	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindTokenToAttributeIdMapper() {
		return AntlrTokenToAttributeIdMapper.class;
	}
	
	/**
	 * register syntax coloring
	 * @return class which define MIND ADL syntax coloring
	 */
	public Class<? extends IHighlightingConfiguration> bindILexicalHighlightingConfiguration() {
		return LexicalHighlightingConfiguration.class;
	}
	
	public Class<? extends org.eclipse.xtext.ui.resource.IResourceUIServiceProvider> bindResourceUIServiceProvider() {
		return AdlResourceUIServiceProvider.class;
	}
	
	public Class<? extends IRenameStrategy> bindIRenameStrategy() {
		return AdlRenameStrategy.class;
	}
}

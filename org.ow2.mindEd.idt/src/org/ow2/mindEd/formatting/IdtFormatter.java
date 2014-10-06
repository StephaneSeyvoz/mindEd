package org.ow2.mindEd.formatting;

import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.ow2.mindEd.services.IdtGrammarAccess;
import org.ow2.mindEd.services.ItfGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 * 
 * 
 * @author Damien Fournier
 */

public class IdtFormatter extends ItfFormatter {

	protected IdtGrammarAccess g = null;

	@Override
	protected void configureFormatting(FormattingConfig c) {

		ItfGrammarAccess f = ((ItfGrammarAccess) super.getGrammarAccess());

		IdtGrammarAccess g = (IdtGrammarAccess) getGrammarAccess();

		// SSZ: quick fix
		//c.setIndentationSpace("    ");
		formatInclude(f, c);
		formatDefine(f, c);
		formatTypeDefinition(f, c);
		formatExpression(f, c);

		// Formatting after 'ifndef' and 'endif'
		c.setLinewrap().before(
				g.getConstantDefinitionBeginAccess().getIfndefKeyword_0());
		c.setLinewrap().before(
				g.getConstantDefinitionEndAccess().getEndifKeyword());

	}

	/**
	 * Format Define Definition
	 */

	@Override
	protected void formatDefine(ItfGrammarAccess f, FormattingConfig c) {

		c.setLinewrap().before(
				f.getConstantDefinitionAccess().getDefineKeyword_0());
	}

}

/*
 * generated by Xtext
 */
package org.ow2.mindEd.adl.textual.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.ow2.mindEd.adl.textual.services.FractalGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 * 
 * CTRL+ALT+F
 */
public class FractalFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		FractalGrammarAccess f = (FractalGrammarAccess) getGrammarAccess();

		// formatting for Comments
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());

		// top level rule
		formatAdlDefinition(c, f);
		
		// components rules
		// Note: the rules define indentation in a personal way
		// You could also use http://www.eclipse.org/forums/index.php/t/239148/
		// Note 2: setting a space before "binds" or any element DOESN'T work
		formatCompositeDefinition(c, f);
		formatPrimitiveDefinition(c, f);
		formatTypeDefinition(c, f);

		// type elements rules
		formatProvidedInterfaceDefinition(c, f);
		formatRequiredInterfaceDefinition(c, f);

		// composite elements rules
		formatBindingDefinition(c, f);
		formatSubComponentDefinition(c, f);

		// primitive elements rules
		formatImplementationDefinition(c, f);
		formatAttributeDefinition(c, f);
		formatDataDefinition(c, f);
	}

	/**
	 * import a.b.c; -> line wrap after and no space before ;
	 * line wrap before architecture definition ... toto ... { ... }
	 */
	private void formatAdlDefinition(FormattingConfig c, FractalGrammarAccess f) {
		c.setLinewrap(0, 1, 2).after(f.getImportDefinitionAccess().getSemicolonKeyword_3());
		c.setLinewrap(0, 1, 2).before(f.getArchitectureDefinitionRule());
		c.setNoSpace().before(f.getImportDefinitionAccess().getSemicolonKeyword_3());
	}

	/**
	 * composite xyz { INSERT LINE WRAP AFTER
	 * 	...
	 * INSERT LINE WRAP BEFORE }
	 */
	private void formatCompositeDefinition(FormattingConfig c, FractalGrammarAccess f) {
		c.setLinewrap(0, 1, 2).after(f.getCompositeDefinitionAccess().getLeftCurlyBracketKeyword_5());
		c.setLinewrap(0, 1, 2).before(f.getCompositeDefinitionAccess().getRightCurlyBracketKeyword_7());

		// Set indentation for inner elements
		c.setIndentation(f.getCompositeDefinitionAccess().getLeftCurlyBracketKeyword_5(), f.getCompositeDefinitionAccess().getRightCurlyBracketKeyword_7());
	}

	/**
	 * primitive xyz { INSERT LINE WRAP AFTER
	 * 	...
	 * INSERT LINE WRAP BEFORE }
	 */
	private void formatPrimitiveDefinition(FormattingConfig c, FractalGrammarAccess f) {
		c.setLinewrap(0, 1, 2).after(f.getPrimitiveDefinitionAccess().getLeftCurlyBracketKeyword_5());
		c.setLinewrap(0, 1, 2).before(f.getPrimitiveDefinitionAccess().getRightCurlyBracketKeyword_7());

		// Set indentation for inner elements
		c.setIndentation(f.getPrimitiveDefinitionAccess().getLeftCurlyBracketKeyword_5(), f.getPrimitiveDefinitionAccess().getRightCurlyBracketKeyword_7());
	}

	/**
	 * type xyz { INSERT LINE WRAP AFTER
	 * 	...
	 * INSERT LINE WRAP BEFORE }
	 */
	private void formatTypeDefinition(FormattingConfig c, FractalGrammarAccess f) {
		c.setLinewrap(0, 1, 2).after(f.getTypeDefinitionAccess().getLeftCurlyBracketKeyword_3());
		c.setLinewrap(0, 1, 2).before(f.getTypeDefinitionAccess().getRightCurlyBracketKeyword_5());

		// Set indentation for inner elements
		c.setIndentation(f.getTypeDefinitionAccess().getLeftCurlyBracketKeyword_3(), f.getTypeDefinitionAccess().getRightCurlyBracketKeyword_5());
	}

	/**
	 * binds a.b to c.d; NO SPACE AROUND DOTS + LINE WRAP AFTER ;
	 */
	private void formatBindingDefinition(FormattingConfig c,
			FractalGrammarAccess f) {
		c.setNoSpace().around(f.getBindingDefinitionAccess().getFullStopKeyword_3());
		c.setNoSpace().around(f.getBindingDefinitionAccess().getFullStopKeyword_8());
		c.setLinewrap(0, 1, 2).after(f.getBindingDefinitionAccess().getSemicolonKeyword_11());
		c.setNoSpace().before(f.getBindingDefinitionAccess().getSemicolonKeyword_11());
	}

	/**
	 * contains ... as ...;
	 */
	private void formatSubComponentDefinition(FormattingConfig c,
			FractalGrammarAccess f) {
		c.setLinewrap(0, 1, 2).after(f.getSubComponentDefinitionAccess().getSemicolonKeyword_9());
		c.setNoSpace().before(f.getSubComponentDefinitionAccess().getSemicolonKeyword_9());
	}

	/**
	 * provides ... as ...;
	 * 
	 * @param c
	 * @param f
	 */
	private void formatProvidedInterfaceDefinition(FormattingConfig c,
			FractalGrammarAccess f) {
		c.setLinewrap(0, 1, 2).after(f.getProvidedInterfaceDefinitionAccess().getSemicolonKeyword_6());
		c.setNoSpace().before(f.getProvidedInterfaceDefinitionAccess().getSemicolonKeyword_6());
	}

	/**
	 * requires ... as ...;
	 * 
	 * @param c
	 * @param f
	 */
	private void formatRequiredInterfaceDefinition(FormattingConfig c,
			FractalGrammarAccess f) {
		c.setLinewrap(0, 1, 2).after(f.getRequiredInterfaceDefinitionAccess().getSemicolonKeyword_7());
		c.setNoSpace().before(f.getRequiredInterfaceDefinitionAccess().getSemicolonKeyword_7());
	}

	/**
	 * data ...; INSERT LINE WRAP AFTER
	 * 
	 * @param c
	 * @param f
	 */
	private void formatDataDefinition(FormattingConfig c, FractalGrammarAccess f) {
		c.setLinewrap(0, 1, 2).after(f.getDataDefinitionAccess().getSemicolonKeyword_3());
		c.setNoSpace().before(f.getDataDefinitionAccess().getSemicolonKeyword_3());
	}

	/**
	 * attribute ... ... ... = ...; INSERT LINE WRAP AFTER
	 * 
	 * @param c
	 * @param f
	 */	private void formatAttributeDefinition(FormattingConfig c,
			 FractalGrammarAccess f) {
		 c.setLinewrap(0, 1, 2).after(f.getAttributeDefinitionAccess().getSemicolonKeyword_7());
		 c.setNoSpace().before(f.getAttributeDefinitionAccess().getSemicolonKeyword_7());
	 }

	 /**
	  * source ...; INSERT LINE WRAP AFTER
	  * 
	  * @param c
	  * @param f
	  */
	 private void formatImplementationDefinition(FormattingConfig c,
			 FractalGrammarAccess f) {
		 c.setLinewrap(0, 1, 2).after(f.getImplementationDefinitionAccess().getSemicolonKeyword_3());
		 c.setNoSpace().before(f.getImplementationDefinitionAccess().getSemicolonKeyword_3());
	 }
}

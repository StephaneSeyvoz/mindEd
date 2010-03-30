package org.ow2.fractal.mind.idl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

/**
 * 
 * @author Nicolas LINGOIS
 * @contributor Rémi MELISSON
 * 
 */
public class SemanticHighlightingConfiguration implements
		IHighlightingConfiguration {

	public final static String ANNOTATIONS_ID = "Annotations";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(ANNOTATIONS_ID, "annotation style",
				annotationTextStyle());
	}

	public TextStyle annotationTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setStyle(SWT.ITALIC);
		textStyle.setColor(new RGB(0, 0, 200));
		return textStyle;
	}
}
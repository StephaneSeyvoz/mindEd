package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentNameWrappingLabel;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.ComponentBorder;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.IFractalShape;

public class LabelReferenceDefinitionNameCustomFigure extends AbstractComponentNameWrappingLabel
	implements IFractalShape{

	protected static Dimension PREFERRED_SIZE = new Dimension(5000,20);
	protected static Dimension MAXIMUM_SIZE = new Dimension(5000,20);
	protected static Color BACKGROUND_COLOR = WHITE;
	protected static Color BORDER_COLOR = GREY;
	protected static Color FOREGROUND_COLOR = WHITE;
	
	public LabelReferenceDefinitionNameCustomFigure() {
		super();
		//set size
		setPreferredSize(PREFERRED_SIZE);
		setMaximumSize(MAXIMUM_SIZE);
		//set color
		setBackgroundColor(BACKGROUND_COLOR);
		setForegroundColor(FOREGROUND_COLOR);
		
		setText("?");
		
		createBorder();
	}
	
	private void createBorder() {
		ComponentBorder border = new ComponentBorder();
		border.setColor(BORDER_COLOR);
		setBorder(border);
	}
}

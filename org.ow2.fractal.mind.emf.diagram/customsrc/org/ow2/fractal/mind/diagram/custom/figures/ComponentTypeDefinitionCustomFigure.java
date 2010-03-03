package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

/**
 * Custom figure to define static attributes used in the generated figure
 * by specifying custom attributes in the .gmfgraph model
 * @author Olivier Marot
 *
 */
public class ComponentTypeDefinitionCustomFigure extends
		AbstractComponentShape {

	//Couleur de la bordure
	protected static Color borderColor = GRAY;
	
	//Couleur du body
	protected static Color bodyAreaColor = LIGHT_GRAY;
	
	//Taille maximum du label
	protected static Dimension nameLabelMaxSize = new Dimension (5000,50);;
	
	//Taille par d�faut
	protected static Dimension componentPreferredSize = new Dimension (200,200);
	
}

package org.ow2.mindEd.adl.sirius.editors;

/**
 * All the real "load" job on editor opening is implemented in the AbstractGraphicalAdlEditor parent class.
 * @author Stephane Seyvoz
 *
 */
public class ArchitectureDiagramEditor extends AbstractGraphicalAdlEditor {

	protected final static String representationDescriptionName = "ArchitectureDiagram";
	protected final static String representationSuffix = " Architecture Diagram";
	
	public ArchitectureDiagramEditor() {
		super(representationDescriptionName, representationSuffix);
	}

}

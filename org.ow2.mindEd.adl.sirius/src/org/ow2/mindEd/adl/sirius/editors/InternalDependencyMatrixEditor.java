package org.ow2.mindEd.adl.sirius.editors;

/**
 * All the real "load" job on editor opening is implemented in the AbstractGraphicalAdlEditor parent class.
 * @author Stephane Seyvoz
 *
 */
public class InternalDependencyMatrixEditor extends AbstractGraphicalAdlEditor {

	protected final static String representationDescriptionName = "InternalDependenciesMatrix";
	protected final static String representationSuffix = " Internal Dependencies Matrix";
	
	public InternalDependencyMatrixEditor() {
		super(representationDescriptionName, representationSuffix);
	}

}

package org.ow2.mindEd.itf.editor.textual.validation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.validation.Check;
import org.ow2.mindEd.adl.util.FractalUtil;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ItfFileImpl;

public class FractalItfJavaValidator extends AbstractFractalItfValidator {

	public final static String WRONG_NAME = "org.ow2.mindEd.itf.editor.textual.validation.wrong_name";
	public final static String NOT_IN_SRC_PATH = "org.ow2.mindEd.adl.editor.textual.validation.not_in_src_path";
	
	@Check
	public void checkItfSimpleName(InterfaceDefinition interfaceDefinition) {

		String simpleName = interfaceDefinition.getName();
		
		String expectedName = FractalItfJavaValidator.getExpectedInterfaceName(interfaceDefinition); 
		
		if (expectedName == null) {
			warning("definition not in source path",
					FractalIDLPackage.Literals.INTERFACE_DEFINITION__NAME,
					FractalIDLPackage.INTERFACE_DEFINITION,
					FractalItfJavaValidator.NOT_IN_SRC_PATH);
			return;
		} else if (! simpleName.equals(expectedName)) {
			warning("interface should be named : " + expectedName,
					FractalIDLPackage.Literals.INTERFACE_DEFINITION__NAME,
					FractalIDLPackage.INTERFACE_DEFINITION,
					FractalItfJavaValidator.WRONG_NAME);
		}

	}	
	
	// Utils
	public static String getExpectedInterfaceName(InterfaceDefinition interfaceDefinition){
		
		ItfFileImpl itfFile = (ItfFileImpl) interfaceDefinition.eContainer();
		URI uri = itfFile.eDirectResource().getURI();
		
		String expectedName = ModelToProjectUtil.INSTANCE.getCurrentFQN(uri);
		return expectedName;
	}	

}

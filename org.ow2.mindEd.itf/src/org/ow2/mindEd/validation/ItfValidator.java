package org.ow2.mindEd.validation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.validation.Check;
import org.ow2.mindEd.itf.InterfaceDefinition;
import org.ow2.mindEd.itf.ItfPackage;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.itf.impl.ItfFileImpl;

public class ItfValidator extends AbstractItfValidator {

	public final static String WRONG_NAME = "org.ow2.mindEd.itf.editor.textual.validation.wrong_name";
	public final static String NOT_IN_SRC_PATH = "org.ow2.mindEd.adl.editor.textual.validation.not_in_src_path";
	
	@Check
	public void checkItfSimpleName(InterfaceDefinition interfaceDefinition) {

		String simpleName = interfaceDefinition.getName();
		
		String expectedName = ItfValidator.getExpectedInterfaceName(interfaceDefinition); 
		
		if (expectedName == null) {
			warning("definition not in source path",
					ItfPackage.Literals.INTERFACE_DEFINITION__NAME,
					ItfPackage.INTERFACE_DEFINITION,
					ItfValidator.NOT_IN_SRC_PATH);
			return;
		} else if (! simpleName.equals(expectedName)) {
			warning("interface should be named : " + expectedName,
					ItfPackage.Literals.INTERFACE_DEFINITION__NAME,
					ItfPackage.INTERFACE_DEFINITION,
					ItfValidator.WRONG_NAME);
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

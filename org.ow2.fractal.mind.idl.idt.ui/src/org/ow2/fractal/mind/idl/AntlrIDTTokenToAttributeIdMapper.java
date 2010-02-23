package org.ow2.fractal.mind.idl;

/**
 * 
 * Token definition for IDT File
 * 
 * @author Damien Fournier
 *
 */

public class AntlrIDTTokenToAttributeIdMapper extends
		AntlrTokenToAttributeIdMapper {
	
	// Simply add '#ifndef' and '#endif' keywords to
	// the previous primitive keywords list
	
	static {
		primitiveKeywords.add("'#ifndef'");
		primitiveKeywords.add("'#endif'");
	}

}

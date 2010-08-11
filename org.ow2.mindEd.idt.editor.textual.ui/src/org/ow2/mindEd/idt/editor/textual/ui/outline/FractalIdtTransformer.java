/*
* generated by Xtext
*/
package org.ow2.mindEd.idt.editor.textual.ui.outline;

import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionBegin;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionEnd;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile;
import org.ow2.mindEd.itf.editor.textual.ui.outline.FractalItfTransformer;

/**
 * customization of the default outline structure
 * 
 */
public class FractalIdtTransformer extends FractalItfTransformer {
	
	
	public ContentOutlineNode createNode(IdtFile obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		node.setLabel("Type Definition");
		return node;
	}
	
	public ContentOutlineNode createNode(ConstantDefinitionBegin obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		node.setLabel("ifndef " + obj.getId());
		return node;
	}
	
	public ContentOutlineNode createNode(ConstantDefinitionEnd obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		node.setLabel("endif " + obj.getId());
		return node;
	}
	
}

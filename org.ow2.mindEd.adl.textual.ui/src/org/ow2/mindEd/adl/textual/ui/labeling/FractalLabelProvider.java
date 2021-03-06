/*
 * generated by Xtext
 */
package org.ow2.mindEd.adl.textual.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.ow2.mindEd.adl.textual.fractal.AdlDefinition;
import org.ow2.mindEd.adl.textual.fractal.Annotation;
import org.ow2.mindEd.adl.textual.fractal.AnnotationsList;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;
import org.ow2.mindEd.adl.textual.fractal.AttributeDefinition;
import org.ow2.mindEd.adl.textual.fractal.BindingDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeSuperType;
import org.ow2.mindEd.adl.textual.fractal.CompositeSuperTypeDefinition;
import org.ow2.mindEd.adl.textual.fractal.DataDefinition;
import org.ow2.mindEd.adl.textual.fractal.FileC;
import org.ow2.mindEd.adl.textual.fractal.FormalArgument;
import org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList;
import org.ow2.mindEd.adl.textual.fractal.ImplementationDefinition;
import org.ow2.mindEd.adl.textual.fractal.ImportDefinition;
import org.ow2.mindEd.adl.textual.fractal.InlineCodeC;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperType;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperTypeDefinition;
import org.ow2.mindEd.adl.textual.fractal.ProvidedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition;
import org.ow2.mindEd.adl.textual.fractal.TemplateReference;
import org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier;
import org.ow2.mindEd.adl.textual.fractal.TypeDefinition;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
public class FractalLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public FractalLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	/*
	//Labels and icons can be computed like this:

	String text(MyModel ele) {
	  return "my "+ele.getName();
	}

    String image(MyModel ele) {
      return "MyModel.gif";
    }
	 */

	// SSZ
	// Here we use a "dirty" way to reuse the "skin" (outline, content proposal, etc...) from
	// the old Adl editor (with GMF...), copying the whole "icons" resource folder, adapting the
	// build.properties file to include "icons" in both src and bin release, and we apply
	// HERE the gif pictures to the visual elements directly with xtext (the IItemLabelProvider
	// behaviour is the same though, making this "quick hack" not that bad).
	// THIS FILE AND THE ICONS SHOULD BE DELETED ONCE THE GMF GRAPHICAL EDITOR IS REINTEGRATED WITH
	// OUR NEW XTEXT-GENERATED EMF MODEL !

	// The new package is org.ow2.mindEd.adl.textual.fractal
	// And the old one was org.ow2.mindEd.adl
	// Some notions names have changed in the meantime
	// See complete folder of icons (with old names)
	
	// All following methods prefixed by a "// !" are concerned by a difference in the 2 models 

	String image(AdlDefinition adlDef) {
		return "full/obj16/AdlDefinition.gif";
	}

	String image(ArchitectureDefinition adlDef) {
		return "full/obj16/ArchitectureDefinition.gif";
	}

	String text(AnnotationsList annoList) {
		return "Annotations";
	}
	
	String image(AnnotationsList annoList) {
		return "full/obj16/AnnotationsList.gif";
	}

	String image(Annotation anno) {
		return "full/obj16/Annotation.gif";
	}

	// Bindings do not have a name and won't be shown otherwise
	String text(BindingDefinition bindingDef) {
		return bindingDef.getSourceParent().getName() + "." + bindingDef.getSourceInterface().getName()
				+ "->" + bindingDef.getTargetParent().getName() + "." + bindingDef.getTargetInterface().getName();
	}

	// Note: works because we explicitly define a text element
	String image(BindingDefinition bindingDef) {
		return "full/obj16/BindingDefinition.gif";
	}

	// !
	String image(PrimitiveDefinition primitiveDef) {
		return "full/obj16/PrimitiveComponentDefinition.gif";
	}

	// !
	String image(CompositeDefinition compositeDef) {
		return "full/obj16/CompositeComponentDefinition.gif";
	}

	// !
	String image(TypeDefinition compositeDef) {
		return "full/obj16/TypeBody.gif";
	}

	String image(FileC fileCDef) {
		return "full/obj16/FileC.gif";
	}

	// !
	String image(InlineCodeC inlineCDef) {
		return "full/obj16/InlineCodeC.gif";
	}

	// Unused
	//	// ! imported from Xtext IDL
	//	String image(InterfaceDefinition itfDef){
	//		return "full/obj16/InterfaceDefinition.gif";
	//	}

	//	// ! imported from Xtext IDL
	//	String image(ProvidedInterfaceDefinition itfDef){
	//		return "full/obj16/InterfaceDefinition.gif";
	//	}
	//
	//	// ! imported from Xtext IDL
	//	String image(RequiredInterfaceDefinition itfDef){
	//		return "full/obj16/InterfaceDefinition.gif";
	//	}

	// !
	// Super type of Provided/RequiredInterfaceDefinition: works for both
	String image(RequiredInterfaceDefinition itfDef) {
		return "full/obj16/RequiredInterfaceDefinition.gif";
	}
	
	String image(ProvidedInterfaceDefinition itfDef) {
		return "full/obj16/ProvidedInterfaceDefinition.gif";
	}

	String image(DataDefinition dataDef){
		return "full/obj16/DataDefinition.gif";
	}

	String image(SubComponentDefinition subCompDef) {
		return "full/obj16/SubComponentDefinition.gif";
	}

	String image(ImportDefinition importDef) {
		return "full/obj16/ImportDefinition.gif";
	}

	String image(ImplementationDefinition implDef) {
		return "full/obj16/ImplementationDefinition.gif";
	}

	String image(AttributeDefinition attrDef) {
		return "full/obj16/AttributeDefinition.gif";
	}

	String text(FormalArgumentsList formalArgsList) {
		return "Arguments";
	}
	
	String image(FormalArgumentsList formalArgsList) {
		return "full/obj16/FormalArgumentsList.gif";
	}

	String image(FormalArgument formalArg) {
		return "full/obj16/FormalArgument.gif";
	}

	// !
	String text(CompositeSuperType compositeSuperType){
		CompositeSuperTypeDefinition cstDef = compositeSuperType.getTargetArchDef();
		if (cstDef instanceof CompositeDefinition)
			return ((CompositeDefinition) cstDef).getName();
		else if (cstDef instanceof TypeDefinition)
			return ((TypeDefinition) cstDef).getName();
		else // error case
			return "";
	}
	
	// !
	String image(CompositeSuperType compositeSuperType){
		return "full/obj16/CompositeReferenceDefinition.gif";
	}

	String text(PrimitiveSuperType primitiveSuperType){
		PrimitiveSuperTypeDefinition pstDef = primitiveSuperType.getTargetArchDef();
		if (pstDef instanceof PrimitiveDefinition)
			return ((PrimitiveDefinition) pstDef).getName();
		else if (pstDef instanceof TypeDefinition)
			return ((TypeDefinition) pstDef).getName();
		else // error case
			return "";
	}
	
	// !
	String image(PrimitiveSuperType primitiveSuperType){
		return "full/obj16/PrimitiveReferenceDefinition.gif";
	}
	
	String image(TemplateSpecifier templateSpeficier){
		return "full/obj16/TemplateSpecifier.gif";
	}
	
	// ! NOT SURE IF SIMILAR !
	String image(TemplateReference templateSpeficier){
		return "full/obj16/TemplateReferenceDefinition.gif";
	}

}

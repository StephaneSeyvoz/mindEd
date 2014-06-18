/*
 * generated by Xtext
 */
package org.ow2.mindEd.adl.textual.scoping;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.MultimapBasedScope;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;
import org.ow2.mindEd.adl.textual.fractal.BindingDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeElement;
import org.ow2.mindEd.adl.textual.fractal.CompositeSuperType;
import org.ow2.mindEd.adl.textual.fractal.CompositeSuperTypeDefinition;
import org.ow2.mindEd.adl.textual.fractal.FileC;
import org.ow2.mindEd.adl.textual.fractal.FractalFactory;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveElement;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperType;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperTypeDefinition;
import org.ow2.mindEd.adl.textual.fractal.ProvidedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition;
import org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier;
import org.ow2.mindEd.adl.textual.fractal.TypeDefinition;
import org.ow2.mindEd.adl.textual.fractal.TypeReference;
import org.ow2.mindEd.adl.textual.fractal.impl.RequiredInterfaceDefinitionImpl;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class FractalScopeProvider extends AbstractDeclarativeScopeProvider {


	// VERY useful debug method
//	@Override
//	public IScope getScope(EObject context, EReference reference){
//		System.out.println(
//				"scope_" + reference.getEContainingClass().getName()
//				+ "_" + reference.getName()
//				+ "(" + context.eClass().getName() + ", ..)"
//				);
//		return super.getScope(context, reference);
//	}

	/**
	 * Override to fix a refactoring issue, that led to a ValueConverterException with message
	 * "Missconfigured language: New reference text has invalid syntax" in
	 * {@link RefactoringCrossReferenceSerializer}, method getCrossRefText.
	 * This happened for referenced sub-components as "sourceParent" of a BindingDefinition,
	 * the scope being too wide with qualified names instead of simple ID at this point. 
	 *  
	 * TODO: handle super types
	 *  
	 * @param bindingDef
	 * @param ref
	 * @return
	 */
	public IScope scope_BindingDefinition_sourceParent(final BindingDefinition bindingDef, final EReference ref) {

		EObject currentContainer = bindingDef.eContainer();
		while (!(currentContainer instanceof CompositeDefinition))
			currentContainer = currentContainer.eContainer();

		CompositeDefinition compositeDef = (CompositeDefinition) currentContainer;
		List<SubComponentDefinition> subCompDefs = EcoreUtil2.eAllOfType(compositeDef, SubComponentDefinition.class);

		EList<SubComponentDefinition> superTypesSubCompDefs = getAllSubComponentDefinitionsFromArchDefSuperTypes(compositeDef);
		subCompDefs.addAll(superTypesSubCompDefs);
		
		return Scopes.scopeFor(subCompDefs);
	}

	/**
	 * Override to fix a refactoring issue, that led to a ValueConverterException with message
	 * "Missconfigured language: New reference text has invalid syntax" in
	 * {@link RefactoringCrossReferenceSerializer}, method getCrossRefText.
	 * This happened for referenced sub-components as "targetParent" of a BindingDefinition,
	 * the scope being too wide with qualified names instead of simple ID at this point. 
	 *  
	 * TODO: handle super types
	 *  
	 * @param bindingDef
	 * @param ref
	 * @return
	 */
	public IScope scope_BindingDefinition_targetParent(final BindingDefinition bindingDef, final EReference ref) {

		EObject currentContainer = bindingDef.eContainer();
		while (!(currentContainer instanceof CompositeDefinition))
			currentContainer = currentContainer.eContainer();

		CompositeDefinition compositeDef = (CompositeDefinition) currentContainer;
		List<SubComponentDefinition> subCompDefs = EcoreUtil2.eAllOfType(compositeDef, SubComponentDefinition.class);

		EList<SubComponentDefinition> superTypesSubCompDefs = getAllSubComponentDefinitionsFromArchDefSuperTypes(compositeDef);
		subCompDefs.addAll(superTypesSubCompDefs);
		
		return Scopes.scopeFor(subCompDefs);
	}

	// Heaviest methods ever: will need further optimization, not sure how to improve templated ELists behavior.
	public IScope scope_BindingDefinition_sourceInterface(final BindingDefinition bindingDef, final EReference ref) {

		ArchitectureDefinition sourceComponentArchDef = null;
		TypeReference currArchDefOrTemplate = null;

		// If the source parent is a subcomponent
		if (!bindingDef.isIsSrcParentThis()) {
			// else it's a common "standard" component
			currArchDefOrTemplate = bindingDef.getSourceParent().getType();

			// handle anonymous component definitions
			// see http://mind.ow2.org/mindc/mindc-user-guide.html#adl-anonym for more info
			if (bindingDef.getSourceParent().getBody() != null)
				sourceComponentArchDef = bindingDef.getSourceParent().getBody();
			else {
				if (currArchDefOrTemplate instanceof ArchitectureDefinition)
					sourceComponentArchDef = (ArchitectureDefinition) currArchDefOrTemplate;
				else if (currArchDefOrTemplate instanceof TemplateSpecifier)
					sourceComponentArchDef = ((TemplateSpecifier) currArchDefOrTemplate).getTypeReference();
				else // error case
					return IScope.NULLSCOPE;
			}
		} else {
			// if the source parent is "this"
			EObject container = bindingDef.eContainer();
			// Find the parent host definition
			while (!(container instanceof CompositeDefinition))
				container = container.eContainer();
			sourceComponentArchDef = (ArchitectureDefinition) container;
		}

		if (sourceComponentArchDef instanceof TypeDefinition) {
			// Get all the elements
			EList<HostedInterfaceDefinition> elements = ((TypeDefinition) sourceComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsSrcParentThis()) {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((TypeDefinition) sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			} else {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((TypeDefinition) sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			}
		} else if (sourceComponentArchDef instanceof CompositeDefinition) {
			// Get all the elements
			EList<CompositeElement> elements = ((CompositeDefinition) sourceComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsSrcParentThis()) {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((CompositeDefinition) sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			} else {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((CompositeDefinition) sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			}
		} else if (sourceComponentArchDef instanceof PrimitiveDefinition) {
			// Get all the elements
			EList<PrimitiveElement> elements = ((PrimitiveDefinition) sourceComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsSrcParentThis()) {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((PrimitiveDefinition) sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			} else {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((PrimitiveDefinition) sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			}
		} else {
			// error case
			return IScope.NULLSCOPE;
		}
	}

	public IScope scope_BindingDefinition_targetInterface(final BindingDefinition bindingDef, final EReference ref) {

		ArchitectureDefinition targetComponentArchDef = null;
		TypeReference currArchDefOrTemplate = null;

		// If the source parent isn't a sub-component but "this"
		if (!bindingDef.isIsTgtParentThis()) {
			currArchDefOrTemplate = bindingDef.getTargetParent().getType();

			// handle anonymous component definitions
			// see http://mind.ow2.org/mindc/mindc-user-guide.html#adl-anonym for more info
			if (bindingDef.getTargetParent().getBody() != null)
				targetComponentArchDef = bindingDef.getTargetParent().getBody();
			else {
				// component definition is a standard one
				if (currArchDefOrTemplate instanceof ArchitectureDefinition)
					targetComponentArchDef = (ArchitectureDefinition) currArchDefOrTemplate;
				else if (currArchDefOrTemplate instanceof TemplateSpecifier)
					targetComponentArchDef = ((TemplateSpecifier) currArchDefOrTemplate).getTypeReference();
				else // error case
					return IScope.NULLSCOPE;
			}
		} else {
			EObject container = bindingDef.eContainer();
			// Find the parent host definition
			while (!(container instanceof CompositeDefinition))
				container = container.eContainer();
			targetComponentArchDef = (ArchitectureDefinition) container;
		}

		if (targetComponentArchDef instanceof TypeDefinition) {
			// Get all the elements
			EList<HostedInterfaceDefinition> elements = ((TypeDefinition) targetComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsTgtParentThis()) {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((TypeDefinition) targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			} else {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((TypeDefinition) targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			}
		} else if (targetComponentArchDef instanceof CompositeDefinition) {
			// Get all the elements
			EList<CompositeElement> elements = ((CompositeDefinition) targetComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsTgtParentThis()) {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((CompositeDefinition) targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			} else {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((CompositeDefinition) targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			}
		} else if (targetComponentArchDef instanceof PrimitiveDefinition) {
			// Get all the elements
			EList<PrimitiveElement> elements = ((PrimitiveDefinition) targetComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsTgtParentThis()) {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((PrimitiveDefinition) targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			} else {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((PrimitiveDefinition) targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			}
		} else {
			// error case
			return IScope.NULLSCOPE;
		}
	}

	private EList<SubComponentDefinition> getAllSubComponentDefinitionsFromArchDefSuperTypes(CompositeDefinition archDef){
		EList<CompositeSuperType> superTypes = archDef.getSuperTypes();

		EList<SubComponentDefinition> subCompDefList = new BasicEList<SubComponentDefinition>();

		for (CompositeSuperType currSuperArchDefType : superTypes) {
			CompositeSuperTypeDefinition currSuperArchDefTypeDefinition = currSuperArchDefType.getTargetArchDef();

			if (currSuperArchDefTypeDefinition instanceof CompositeDefinition) {
				CompositeDefinition currSuperCompositeDefinition = (CompositeDefinition) currSuperArchDefTypeDefinition;
				subCompDefList.addAll(EcoreUtil2.eAllOfType(currSuperCompositeDefinition, SubComponentDefinition.class));
				// we need a recursion in all supertypes
				subCompDefList.addAll(getAllSubComponentDefinitionsFromArchDefSuperTypes(currSuperCompositeDefinition));
			}
		}

		return subCompDefList;
	}

	private EList<RequiredInterfaceDefinition> listAllRequiredInterfacesFromArchDefSuperTypes(TypeDefinition archDef){
		EList<TypeDefinition> superTypes = archDef.getSuperTypes();

		EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();

		for (TypeDefinition currSuperArchDef : superTypes) {
			reqItfList.addAll(getAllArchDefRequiredInterfaces(currSuperArchDef));
			// we need a recursion in all supertypes
			reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes(currSuperArchDef));
		}

		return reqItfList;
	}

	private EList<RequiredInterfaceDefinition> listAllRequiredInterfacesFromArchDefSuperTypes(CompositeDefinition archDef){
		EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();

		// are we handling standard inheritance or anonymous definition inheritance ?
		if (!(archDef.eContainer() instanceof SubComponentDefinition)) {
			EList<CompositeSuperType> superTypes = archDef.getSuperTypes();

			for (CompositeSuperType currSuperArchDef : superTypes) {
				CompositeSuperTypeDefinition superType = currSuperArchDef.getTargetArchDef();
				if (superType instanceof CompositeDefinition)
					reqItfList.addAll(getAllArchDefRequiredInterfaces((CompositeDefinition) superType));
				else if (superType instanceof TypeDefinition)
					reqItfList.addAll(getAllArchDefRequiredInterfaces((TypeDefinition) superType));

				// we need a recursion in all supertypes
				if (superType instanceof CompositeDefinition)
					reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((CompositeDefinition) superType));
				else if (superType instanceof TypeDefinition)
					reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((TypeDefinition) superType));
			}
		} else {
			SubComponentDefinition hostSubCompDef = (SubComponentDefinition) archDef.eContainer();

			TypeReference superType = hostSubCompDef.getType();
			if (superType instanceof CompositeDefinition)
				reqItfList.addAll(getAllArchDefRequiredInterfaces((CompositeDefinition) superType));
			else if (superType instanceof TypeDefinition)
				reqItfList.addAll(getAllArchDefRequiredInterfaces((TypeDefinition) superType));

			// we need a recursion in all supertypes
			if (superType instanceof CompositeDefinition)
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((CompositeDefinition) superType));
			else if (superType instanceof TypeDefinition)
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((TypeDefinition) superType));
		}


		return reqItfList;
	}

	private EList<RequiredInterfaceDefinition> listAllRequiredInterfacesFromArchDefSuperTypes(PrimitiveDefinition archDef){
		EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();

		// are we handling standard inheritance or anonymous definition inheritance ?
		if (!(archDef.eContainer() instanceof SubComponentDefinition)) {
			EList<PrimitiveSuperType> superTypes = archDef.getSuperTypes();

			for (PrimitiveSuperType currSuperArchDef : superTypes) {
				PrimitiveSuperTypeDefinition superType = currSuperArchDef.getTargetArchDef();
				if (superType instanceof PrimitiveDefinition)
					reqItfList.addAll(getAllArchDefRequiredInterfaces((PrimitiveDefinition) superType));
				else if (superType instanceof TypeDefinition)
					reqItfList.addAll(getAllArchDefRequiredInterfaces((TypeDefinition) superType));

				// we need a recursion in all supertypes
				if (superType instanceof PrimitiveDefinition)
					reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((PrimitiveDefinition) superType));
				else if (superType instanceof TypeDefinition)
					reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((TypeDefinition) superType));
			}
		} else {
			SubComponentDefinition hostSubCompDef = (SubComponentDefinition) archDef.eContainer();

			TypeReference superType = hostSubCompDef.getType();

			if (superType instanceof PrimitiveDefinition)
				reqItfList.addAll(getAllArchDefRequiredInterfaces((PrimitiveDefinition) superType));
			else if (superType instanceof TypeDefinition)
				reqItfList.addAll(getAllArchDefRequiredInterfaces((TypeDefinition) superType));

			// we need a recursion in all supertypes
			if (superType instanceof PrimitiveDefinition)
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((PrimitiveDefinition) superType));
			else if (superType instanceof TypeDefinition)
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes((TypeDefinition) superType));
		}
		return reqItfList;
	}

	private EList<RequiredInterfaceDefinition> getAllArchDefRequiredInterfaces(ArchitectureDefinition archDef) {
		EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();

		if (archDef instanceof TypeDefinition) {
			// Get all the elements
			EList<HostedInterfaceDefinition> elements = ((TypeDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			for (EObject currentEObject : elements) {
				if (currentEObject instanceof RequiredInterfaceDefinition) {
					reqItfList.add((RequiredInterfaceDefinition) currentEObject);
				}
			}
		} else if (archDef instanceof CompositeDefinition) {
			// Get all the elements
			EList<CompositeElement> elements = ((CompositeDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			for (EObject currentEObject : elements) {
				if (currentEObject instanceof RequiredInterfaceDefinition) {
					reqItfList.add((RequiredInterfaceDefinition) currentEObject);
				}
			}
		} else if (archDef instanceof PrimitiveDefinition) {
			// Get all the elements
			EList<PrimitiveElement> elements = ((PrimitiveDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			for (EObject currentEObject : elements) {
				if (currentEObject instanceof RequiredInterfaceDefinition) {
					reqItfList.add((RequiredInterfaceDefinition) currentEObject);
				}
			}
		}
		return reqItfList;
	}

	private EList<ProvidedInterfaceDefinition> listAllProvidedInterfacesFromArchDefSuperTypes(TypeDefinition archDef){
		EList<TypeDefinition> superTypes = archDef.getSuperTypes();

		EList<ProvidedInterfaceDefinition> prvdItfList = new BasicEList<ProvidedInterfaceDefinition>();

		for (TypeDefinition currSuperArchDef : superTypes) {
			prvdItfList.addAll(getAllArchDefProvidedInterfaces(currSuperArchDef));
			// we need a recursion in all supertypes
			prvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes(currSuperArchDef));
		}

		return prvdItfList;
	}

	private EList<ProvidedInterfaceDefinition> listAllProvidedInterfacesFromArchDefSuperTypes(CompositeDefinition archDef){
		EList<ProvidedInterfaceDefinition> prvdItfList = new BasicEList<ProvidedInterfaceDefinition>();

		// are we handling standard inheritance or anonymous definition inheritance ?
		if (!(archDef.eContainer() instanceof SubComponentDefinition)) {
			EList<CompositeSuperType> superTypes = archDef.getSuperTypes();

			for (CompositeSuperType currSuperArchDef : superTypes) {
				CompositeSuperTypeDefinition superType = currSuperArchDef.getTargetArchDef();
				if (superType instanceof CompositeDefinition)
					prvdItfList.addAll(getAllArchDefProvidedInterfaces((CompositeDefinition) superType));
				else if (superType instanceof TypeDefinition)
					prvdItfList.addAll(getAllArchDefProvidedInterfaces((TypeDefinition) superType));

				// we need a recursion in all supertypes
				if (superType instanceof CompositeDefinition)
					prvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((CompositeDefinition) superType));
				else if (superType instanceof TypeDefinition)
					prvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((TypeDefinition) superType));
			}
		} else {
			SubComponentDefinition hostSubCompDef = (SubComponentDefinition) archDef.eContainer();

			TypeReference superType = hostSubCompDef.getType();
			if (superType instanceof CompositeDefinition)
				prvdItfList.addAll(getAllArchDefProvidedInterfaces((CompositeDefinition) superType));
			else if (superType instanceof TypeDefinition)
				prvdItfList.addAll(getAllArchDefProvidedInterfaces((TypeDefinition) superType));

			// we need a recursion in all supertypes
			if (superType instanceof CompositeDefinition)
				prvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((CompositeDefinition) superType));
			else if (superType instanceof TypeDefinition)
				prvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((TypeDefinition) superType));
		}

		return prvdItfList;
	}

	private EList<ProvidedInterfaceDefinition> listAllProvidedInterfacesFromArchDefSuperTypes(PrimitiveDefinition archDef){
		EList<ProvidedInterfaceDefinition> prvdItfList = new BasicEList<ProvidedInterfaceDefinition>();

		// are we handling standard inheritance or anonymous definition inheritance ?
		if (!(archDef.eContainer() instanceof SubComponentDefinition)) {
			EList<PrimitiveSuperType> superTypes = archDef.getSuperTypes();

			for (PrimitiveSuperType currSuperArchDef : superTypes) {
				PrimitiveSuperTypeDefinition superType = currSuperArchDef.getTargetArchDef();
				if (superType instanceof PrimitiveDefinition)
					prvdItfList.addAll(getAllArchDefProvidedInterfaces((PrimitiveDefinition) superType));
				else if (superType instanceof TypeDefinition)
					prvdItfList.addAll(getAllArchDefProvidedInterfaces((TypeDefinition) superType));

				// we need a recursion in all supertypes
				if (superType instanceof PrimitiveDefinition)
					prvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((PrimitiveDefinition) superType));
				else if (superType instanceof TypeDefinition)
					prvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((TypeDefinition) superType));
			}
		} else {
			SubComponentDefinition hostSubCompDef = (SubComponentDefinition) archDef.eContainer();

			TypeReference superType = hostSubCompDef.getType();
			if (superType instanceof PrimitiveDefinition)
				prvdItfList.addAll(getAllArchDefProvidedInterfaces((PrimitiveDefinition) superType));
			else if (superType instanceof TypeDefinition)
				prvdItfList.addAll(getAllArchDefProvidedInterfaces((TypeDefinition) superType));

			// we need a recursion in all supertypes
			if (superType instanceof PrimitiveDefinition)
				prvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((PrimitiveDefinition) superType));
			else if (superType instanceof TypeDefinition)
				prvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes((TypeDefinition) superType));
		}

		return prvdItfList;
	}

	private EList<ProvidedInterfaceDefinition> getAllArchDefProvidedInterfaces(ArchitectureDefinition archDef) {
		EList<ProvidedInterfaceDefinition> reqItfList = new BasicEList<ProvidedInterfaceDefinition>();

		if (archDef instanceof TypeDefinition) {
			// Get all the elements
			EList<HostedInterfaceDefinition> elements = ((TypeDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			for (EObject currentEObject : elements) {
				if (currentEObject instanceof ProvidedInterfaceDefinition) {
					reqItfList.add((ProvidedInterfaceDefinition) currentEObject);
				}
			}
		} else if (archDef instanceof CompositeDefinition) {
			// Get all the elements
			EList<CompositeElement> elements = ((CompositeDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			for (EObject currentEObject : elements) {
				if (currentEObject instanceof ProvidedInterfaceDefinition) {
					reqItfList.add((ProvidedInterfaceDefinition) currentEObject);
				}
			}
		} else if (archDef instanceof PrimitiveDefinition) {
			// Get all the elements
			EList<PrimitiveElement> elements = ((PrimitiveDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			for (EObject currentEObject : elements) {
				if (currentEObject instanceof ProvidedInterfaceDefinition) {
					reqItfList.add((ProvidedInterfaceDefinition) currentEObject);
				}
			}
		}
		return reqItfList;
	}

	//	public IScope getScope(SubComponentDefinition subCompDef, EReference ref){
	//		return null;
	//		
	//	}


}

/**
 */
package org.ow2.mindEd.adl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ow2.mindEd.adl.AdlFactory;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.CompositeDefinition;

/**
 * This is the item provider adapter for a {@link org.ow2.mindEd.adl.CompositeDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeDefinitionItemProvider extends ArchitectureDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDefinitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AdlPackage.Literals.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS);
			childrenFeatures.add(AdlPackage.Literals.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST);
			childrenFeatures.add(AdlPackage.Literals.COMPOSITE_DEFINITION__SUPER_TYPES);
			childrenFeatures.add(AdlPackage.Literals.COMPOSITE_DEFINITION__ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CompositeDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositeDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeDefinition_type") :
			getString("_UI_CompositeDefinition_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CompositeDefinition.class)) {
			case AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS:
			case AdlPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
			case AdlPackage.COMPOSITE_DEFINITION__SUPER_TYPES:
			case AdlPackage.COMPOSITE_DEFINITION__ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS,
				 AdlFactory.eINSTANCE.createTemplateSpecifier()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST,
				 AdlFactory.eINSTANCE.createFormalArgumentsList()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.COMPOSITE_DEFINITION__SUPER_TYPES,
				 AdlFactory.eINSTANCE.createCompositeSuperType()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.COMPOSITE_DEFINITION__ELEMENTS,
				 AdlFactory.eINSTANCE.createHostedInterfaceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.COMPOSITE_DEFINITION__ELEMENTS,
				 AdlFactory.eINSTANCE.createProvidedInterfaceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.COMPOSITE_DEFINITION__ELEMENTS,
				 AdlFactory.eINSTANCE.createRequiredInterfaceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.COMPOSITE_DEFINITION__ELEMENTS,
				 AdlFactory.eINSTANCE.createOutputFlowInterfaceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.COMPOSITE_DEFINITION__ELEMENTS,
				 AdlFactory.eINSTANCE.createInputFlowInterfaceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.COMPOSITE_DEFINITION__ELEMENTS,
				 AdlFactory.eINSTANCE.createCompositeElement()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.COMPOSITE_DEFINITION__ELEMENTS,
				 AdlFactory.eINSTANCE.createSubComponentDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.COMPOSITE_DEFINITION__ELEMENTS,
				 AdlFactory.eINSTANCE.createBindingDefinition()));
	}

}

/**
 */
package org.ow2.mindEd.adl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ow2.mindEd.adl.AdlFactory;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.SubComponentDefinition;

/**
 * This is the item provider adapter for a {@link org.ow2.mindEd.adl.SubComponentDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubComponentDefinitionItemProvider extends CompositeElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubComponentDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubComponentDefinition_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubComponentDefinition_type_feature", "_UI_SubComponentDefinition_type"),
				 AdlPackage.Literals.SUB_COMPONENT_DEFINITION__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubComponentDefinition_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubComponentDefinition_name_feature", "_UI_SubComponentDefinition_type"),
				 AdlPackage.Literals.SUB_COMPONENT_DEFINITION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(AdlPackage.Literals.SUB_COMPONENT_DEFINITION__TEMPLATES_LIST);
			childrenFeatures.add(AdlPackage.Literals.SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST);
			childrenFeatures.add(AdlPackage.Literals.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST);
			childrenFeatures.add(AdlPackage.Literals.SUB_COMPONENT_DEFINITION__BODY);
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
	 * This returns SubComponentDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SubComponentDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SubComponentDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SubComponentDefinition_type") :
			getString("_UI_SubComponentDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(SubComponentDefinition.class)) {
			case AdlPackage.SUB_COMPONENT_DEFINITION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AdlPackage.SUB_COMPONENT_DEFINITION__TEMPLATES_LIST:
			case AdlPackage.SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST:
			case AdlPackage.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST:
			case AdlPackage.SUB_COMPONENT_DEFINITION__BODY:
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
				(AdlPackage.Literals.SUB_COMPONENT_DEFINITION__TEMPLATES_LIST,
				 AdlFactory.eINSTANCE.createTemplateReference()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST,
				 AdlFactory.eINSTANCE.createArgumentDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST,
				 AdlFactory.eINSTANCE.createAnnotationsList()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.SUB_COMPONENT_DEFINITION__BODY,
				 AdlFactory.eINSTANCE.createArchitectureDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.SUB_COMPONENT_DEFINITION__BODY,
				 AdlFactory.eINSTANCE.createCompositeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.SUB_COMPONENT_DEFINITION__BODY,
				 AdlFactory.eINSTANCE.createPrimitiveDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AdlPackage.Literals.SUB_COMPONENT_DEFINITION__BODY,
				 AdlFactory.eINSTANCE.createTypeDefinition()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AdlPackage.Literals.ELEMENT__ANNOTATIONS_LIST ||
			childFeature == AdlPackage.Literals.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

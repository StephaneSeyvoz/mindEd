/**
 */
package org.ow2.mindEd.adl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.BindingDefinition;

/**
 * This is the item provider adapter for a {@link org.ow2.mindEd.adl.BindingDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BindingDefinitionItemProvider extends CompositeElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addSourceParentPropertyDescriptor(object);
			addIsSrcParentThisPropertyDescriptor(object);
			addSourceInterfacePropertyDescriptor(object);
			addSourceIndexPropertyDescriptor(object);
			addTargetParentPropertyDescriptor(object);
			addIsTgtParentThisPropertyDescriptor(object);
			addTargetInterfacePropertyDescriptor(object);
			addTargetIndexPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_sourceParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_sourceParent_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__SOURCE_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Src Parent This feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSrcParentThisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_isSrcParentThis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_isSrcParentThis_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__IS_SRC_PARENT_THIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_sourceInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_sourceInterface_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__SOURCE_INTERFACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_sourceIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_sourceIndex_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__SOURCE_INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_targetParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_targetParent_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__TARGET_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Tgt Parent This feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTgtParentThisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_isTgtParentThis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_isTgtParentThis_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__IS_TGT_PARENT_THIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_targetInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_targetInterface_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__TARGET_INTERFACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_targetIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_targetIndex_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__TARGET_INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns BindingDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BindingDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BindingDefinition bindingDefinition = (BindingDefinition)object;
		return getString("_UI_BindingDefinition_type") + " " + bindingDefinition.isIsSrcParentThis();
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

		switch (notification.getFeatureID(BindingDefinition.class)) {
			case AdlPackage.BINDING_DEFINITION__IS_SRC_PARENT_THIS:
			case AdlPackage.BINDING_DEFINITION__SOURCE_INDEX:
			case AdlPackage.BINDING_DEFINITION__IS_TGT_PARENT_THIS:
			case AdlPackage.BINDING_DEFINITION__TARGET_INDEX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}

/**
 */
package org.ow2.mindEd.itf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ow2.mindEd.itf.Declarator;
import org.ow2.mindEd.itf.ItfFactory;
import org.ow2.mindEd.itf.ItfPackage;

/**
 * This is the item provider adapter for a {@link org.ow2.mindEd.itf.Declarator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclaratorItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaratorItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ItfPackage.Literals.DECLARATOR__POINTER);
			childrenFeatures.add(ItfPackage.Literals.DECLARATOR__DC);
			childrenFeatures.add(ItfPackage.Literals.DECLARATOR__DEC);
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
	 * This returns Declarator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Declarator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Declarator_type");
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

		switch (notification.getFeatureID(Declarator.class)) {
			case ItfPackage.DECLARATOR__POINTER:
			case ItfPackage.DECLARATOR__DC:
			case ItfPackage.DECLARATOR__DEC:
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
				(ItfPackage.Literals.DECLARATOR__POINTER,
				 ItfFactory.eINSTANCE.createQualifiedPointerSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createItfFile()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createTypedefSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createQualifiedTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createStructOrUnionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createStructOrUnionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createStructorUnionReference()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createStructMember()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createEnumSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createEnumDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createEnumReference()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createEnumMemberList()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createEnumMember()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createDeclarators()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createDeclarator()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createQualifiedPointerSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createDirectNamedDeclarator()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createDirectAnonymousDeclarator()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createArraySpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createConstantDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createInterfaceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createMethodDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createIncludeDirective()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createAnnotationsList()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createAnnotationValuePair()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createArrayAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createPrimaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createLogicalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createLogicalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createXorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createMulExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DC,
				 ItfFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ItfPackage.Literals.DECLARATOR__DEC,
				 ItfFactory.eINSTANCE.createDeclarator()));
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
			childFeature == ItfPackage.Literals.DECLARATOR__POINTER ||
			childFeature == ItfPackage.Literals.DECLARATOR__DC ||
			childFeature == ItfPackage.Literals.DECLARATOR__DEC;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ItfEditPlugin.INSTANCE;
	}

}

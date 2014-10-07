package org.ow2.mindEd.adl.custom.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.ow2.mindEd.adl.custom.descriptor.ListPropertyDescriptor;
import org.ow2.mindEd.adl.provider.HostedInterfaceDefinitionItemProvider;
import org.ow2.mindEd.itf.ItfPackage;

public class InterfaceDefinitionCustomItemProvider extends
		HostedInterfaceDefinitionItemProvider {

	public InterfaceDefinitionCustomItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	protected void addSignaturePropertyDescriptor(Object object) {
		// Add a ListPropertyDescriptor to get a combobox with a selection of Signature
		itemPropertyDescriptors.add
			(new ListPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceDefinition_signature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceDefinition_signature_feature", "_UI_InterfaceDefinition_type"),
				 ItfPackage.Literals.INTERFACE_DEFINITION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

}

/*
 * generated by Xtext
 */
package org.ow2.mindEd.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.ow2.mindEd.ui.internal.ItfActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ItfExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ItfActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ItfActivator.getInstance().getInjector(ItfActivator.ORG_OW2_MINDED_ITF);
	}
	
}
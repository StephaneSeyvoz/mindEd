
/*
 * generated by Xtext
 */
 
package org.ow2.mindEd.idt.editor.textual.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class FractalIdtExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.ow2.mindEd.idt.editor.textual.ui.internal.FractalIdtActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.ow2.mindEd.idt.editor.textual.ui.internal.FractalIdtActivator.getInstance().getInjector("org.ow2.mindEd.idt.editor.textual.FractalIdt");
	}
	
}

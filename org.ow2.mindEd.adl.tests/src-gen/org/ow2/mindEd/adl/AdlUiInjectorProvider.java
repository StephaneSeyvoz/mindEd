/*
* generated by Xtext
*/
package org.ow2.mindEd.adl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AdlUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.ow2.mindEd.adl.ui.internal.AdlActivator.getInstance().getInjector("org.ow2.mindEd.adl.Adl");
	}
	
}

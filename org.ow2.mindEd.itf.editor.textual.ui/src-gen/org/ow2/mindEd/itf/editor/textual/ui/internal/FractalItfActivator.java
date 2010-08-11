
/*
 * generated by Xtext
 */
package org.ow2.mindEd.itf.editor.textual.ui.internal;

import org.apache.log4j.Logger;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

import java.util.Map;
import java.util.HashMap;

/**
 * Generated
 */
public class FractalItfActivator extends AbstractUIPlugin {

	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static FractalItfActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {
			
			injectors.put("org.ow2.mindEd.itf.editor.textual.FractalItf", Guice.createInjector(
				Modules.override(Modules.override(getRuntimeModule("org.ow2.mindEd.itf.editor.textual.FractalItf")).with(getUiModule("org.ow2.mindEd.itf.editor.textual.FractalItf"))).with(getSharedStateModule())
			));
			
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}
	
	public static FractalItfActivator getInstance() {
		return INSTANCE;
	}
	
	protected Module getRuntimeModule(String grammar) {
		
		if ("org.ow2.mindEd.itf.editor.textual.FractalItf".equals(grammar)) {
		  return new org.ow2.mindEd.itf.editor.textual.FractalItfRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	protected Module getUiModule(String grammar) {
		
		if ("org.ow2.mindEd.itf.editor.textual.FractalItf".equals(grammar)) {
		  return new org.ow2.mindEd.itf.editor.textual.ui.FractalItfUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}
	
}

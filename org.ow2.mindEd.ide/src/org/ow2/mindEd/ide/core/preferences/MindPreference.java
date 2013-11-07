package org.ow2.mindEd.ide.core.preferences;


import java.util.List;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.ow2.mindEd.ide.core.MindActivator;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.impl.CDTUtil;
import org.ow2.mindEd.ide.core.impl.MindProjectImpl;
import org.ow2.mindEd.ide.model.MindProject;

public class MindPreference implements IPreferenceChangeListener {

	private ScopedPreferenceStore corepreferenceStore;
	private IEclipsePreferences _preference;

	public String getMindCLocation() {
		return getPreferences().get(PreferenceConstants.P_MINDC_LOCATION, null);
	}

	public String getMindCMainClass() {
		return getPreferences().get(PreferenceConstants.P_MINDC_MAIN_CLASS, null);
	}

	public void setMindCLocation(String location) {
		getPreferences().put(PreferenceConstants.P_MINDC_LOCATION, location);
	}

	public void setMindCMainClass(String classMain) {
		getPreferences().put(PreferenceConstants.P_MINDC_MAIN_CLASS, classMain);
	}

	public IEclipsePreferences getPreferences() {
		if (_preference == null) {
			_preference = ConfigurationScope.INSTANCE.getNode(MindActivator.ID);
		}
		return _preference;
	}

	public IPreferenceStore getPreferenceStore() {
		// Create the preference store lazily.
		if (corepreferenceStore == null) {
			corepreferenceStore = new ScopedPreferenceStore(ConfigurationScope.INSTANCE, MindActivator.ID);

		}
		return corepreferenceStore;
	}

	public void initListener() {
		getPreferences().addPreferenceChangeListener(this);
	}

	@Override
	public void preferenceChange(PreferenceChangeEvent event) {
		if (event.getKey().equals(PreferenceConstants.P_MINDC_LOCATION)) {
			Object newValue = event.getNewValue();
			if (newValue == null)
				newValue = ""; // fix null pointer in cdt env
			CDTUtil.changeMINDCLocation((String) newValue);
		}
	}

	public void dispose() {
		getPreferences().removePreferenceChangeListener(this);
	}
}

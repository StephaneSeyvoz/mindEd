package org.ow2.mindEd.ide.ui.preferences;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.ow2.mindEd.ide.core.MindActivator;
import org.ow2.mindEd.ide.core.preferences.PreferenceConstants;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. It allows setting the MIND_ROOT variable.
 */

public class MindcPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public MindcPreferencePage() {
		super(GRID);
		setPreferenceStore(getPreferenceStore());
		setDescription("MindEd preferences, compiler location and behavior customization");
	}
	
	@Override
	public IPreferenceStore getPreferenceStore() {
        return MindActivator.getPref().getPreferenceStore();
    }
	/**
	 * Creates the field editors.
	 */
	@Override
	public void createFieldEditors() {
		addField(new DirectoryFieldEditor(PreferenceConstants.P_MINDC_LOCATION, 
				"&Mindc location:", getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.P_MINDC_MAIN_CLASS, 
				"&Mindc main class:", getFieldEditorParent()));
		
		// Windows-specific property to allow compatibility with GNU Make (enables quote characters writing
		// in the Makefile "MIND_SRC" variable value) ; same with the "sourcePath" variable in the Properties file (new behavior)
		if (System.getProperty("os.name").startsWith("Windows")){
			addField(new BooleanFieldEditor(PreferenceConstants.P_GNU_MAKEFILE_COMPATIBILITY,
					"&GNU Make compatibility (Windows-only setting)", getFieldEditorParent()));
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}
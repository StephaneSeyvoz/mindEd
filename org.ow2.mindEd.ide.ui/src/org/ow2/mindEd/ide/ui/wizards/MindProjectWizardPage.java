package org.ow2.mindEd.ide.ui.wizards;

import java.net.URI;
import java.net.URLClassLoader;

import org.eclipse.cdt.internal.ui.wizards.ICDTCommonProjectWizard;
import org.eclipse.cdt.managedbuilder.core.IInputType;
import org.eclipse.cdt.managedbuilder.core.ITool;
import org.eclipse.cdt.managedbuilder.core.IToolChain;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.ui.CUIPlugin;
import org.eclipse.cdt.ui.newui.CDTPrefUtil;
import org.eclipse.cdt.ui.newui.PageLayout;
import org.eclipse.cdt.ui.newui.UIMessages;
import org.eclipse.cdt.ui.wizards.IWizardWithMemory;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.accessibility.AccessibleAdapter;
import org.eclipse.swt.accessibility.AccessibleEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.ow2.mindEd.ide.core.MindActivator;
import org.ow2.mindEd.ide.core.MindIdeBuilder;
import org.ow2.mindEd.ide.core.preferences.PreferenceConstants;

/**
 * It's the default page for Fractal MIND Project Wizard.
 * It adds a validator that checks if the name and location are valid for a CDT project.
 * 
 */

public class MindProjectWizardPage extends WizardNewProjectCreationPage  {

	// widgets
	protected Table table;
	private Label mindconf_label;
	private Button mindcLoc_button;
	private Button runtime_checkbox;
	private Composite tcs_choice;
	private Button show_sup;
	private Label toolchains_label;

	private boolean userRuntimeChoice = true;

	IToolChain user_tc_choice = null;

	/**
	 * Creates a new project creation wizard page.
	 *
	 * @param pageName the name of this page
	 */
	public MindProjectWizardPage(String pageName) {
		super(pageName);
		setPageComplete(false);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		createGroup((Composite)getControl());

		setPageComplete(validatePage());
		setErrorMessage(null);
		setMessage(null);
	}

	protected static boolean isMindcToolchainConfigured() {
		// First check if the compiler path (for runtime) has been configured
		if (MindActivator.getPref().getMindCLocation() == null) {
			// Now the preference panel
			//PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(getShell(), "org.ow2.mindEd.ide.ui.preferences.MindcPreferencePage", null, null);
			//dialog.open();
			return false;
		} else return true;
	}

	protected static boolean isMindToolchainValid() {
		boolean launcherClassAvailable = false;

		// check the configured path really points to our compiler
		// inspired from MindIdeBuilder#mindc method
		try {
			URLClassLoader loader = MindIdeBuilder.getMindCClassLoader();
			loader.loadClass("org.ow2.mind.Launcher");
			launcherClassAvailable = true;
		} catch (CoreException e1) {
			launcherClassAvailable = false;
		} catch (ClassNotFoundException e2) {
			launcherClassAvailable = false;
		}

		return launcherClassAvailable;
	}

	//---------------------------------------------------------
	// Strongly inspired by MBSWizardHandler handleSelection()
	//---------------------------------------------------------
	public void createToolchainsTable(Composite parent) {

		if (table == null) {
			table = new Table(parent, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER);
			table.getAccessible().addAccessibleListener(
					new AccessibleAdapter() {
						@Override
						public void getName(AccessibleEvent e) {
							if (e.result == null)
								// TODO: SSZ: check if it's the good thing... not so sure
								e.result = ManagedBuildManager.getRealToolChains()[0].getUniqueRealName();
						}
					});

			// update from the same preference as the show_sup checkbox initialization value
			updateToolchainsTable(!CDTPrefUtil.getBool(CDTPrefUtil.KEY_NOSUPP));

			// Used to know the currently selected toolchain
			table.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					handleToolChainSelection(e.item);
					setPageComplete(validatePage());
				}
			});

		}
		parent.layout();
	}

	protected void handleToolChainSelection(Widget widget) {

		// no toolchain selected = null
		if (widget == null) {
			user_tc_choice = null;
			return;
		}


		if (!(widget instanceof TableItem)) { // should never happen
			user_tc_choice = null;
			return;
		}

		TableItem ti = (TableItem) widget;

		if (ti.getData() == null) { // should never happen
			user_tc_choice = null;
			return;
		}

		if (!(ti.getData() instanceof IToolChain)) { // should never happen
			user_tc_choice = null;
			return;
		}

		// Set the toolchain choice !
		user_tc_choice = (IToolChain) ti.getData();
	}

	private void createGroup(Composite parent) {
		Composite c = new Composite(parent, SWT.NONE);
		c.setLayoutData(new GridData(GridData.FILL_BOTH));

		// Used to be 2 columns with CDT
		c.setLayout(new GridLayout(1, true));

		// Separate parts of the window
		Label separatorLabel0 = new Label(c, SWT.SEPARATOR | SWT.HORIZONTAL | SWT.SHADOW_OUT);
		GridData sl0gd = new GridData(GridData.HORIZONTAL_ALIGN_CENTER);
		// reserve some space to enhance readability
		sl0gd.verticalSpan = 4;
		separatorLabel0.setLayoutData(sl0gd);

		// mind-specific settings label
		mindconf_label = new Label(c, SWT.NONE);
		mindconf_label.setFont(parent.getFont());
		mindconf_label.setLayoutData(new GridData(GridData.BEGINNING));
		mindconf_label.setText(Messages.MindProjectWizardPage_MindConfig);

		// runtime checkbox
		runtime_checkbox = new Button(c, SWT.CHECK);
		runtime_checkbox.setText(Messages.MindProjectWizardPage_MindRuntime); 
		runtime_checkbox.setFont(parent.getFont());
		GridData gd0 = new GridData(GridData.FILL_HORIZONTAL);
		runtime_checkbox.setLayoutData(gd0);
		// default as true
		runtime_checkbox.setSelection(userRuntimeChoice);
		runtime_checkbox.addSelectionListener(new SelectionAdapter() {
			// update configuration on box event
			@Override
			public void widgetSelected(SelectionEvent e) {
				userRuntimeChoice = runtime_checkbox.getSelection();
			}} );

		// Configure compiler path preference if not already configured
		if (!isMindcToolchainConfigured() || !isMindToolchainValid()) {
			mindcLoc_button = new Button(c, SWT.NONE);
			mindcLoc_button.setText(Messages.MindProjectWizardPage_MindcLocation);
			mindcLoc_button.setFont(parent.getFont());
			mindcLoc_button.addSelectionListener(new SelectionAdapter() {
				// update configuration on box event
				@Override
				public void widgetSelected(SelectionEvent e) {
					// Now the preference panel
					PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(getShell(), "org.ow2.mindEd.ide.ui.preferences.MindcPreferencePage", new String[] {}, null);
					dialog.open();

					// User clicked ok and toolchain is valid: remove the config button from the wizard
					if (dialog.getReturnCode() == Window.OK && isMindToolchainValid()) {
						mindcLoc_button.setVisible(false);
						getShell().pack();
					}

					setPageComplete(validatePage());
				}} );
		}

		// Separate parts of the window
		Label separatorLabel1 = new Label(c, SWT.SEPARATOR | SWT.HORIZONTAL | SWT.SHADOW_OUT);
		GridData sl1gd = new GridData(GridData.HORIZONTAL_ALIGN_CENTER);
		// reserve some space to enhance readability
		sl1gd.verticalSpan = 4;
		separatorLabel1.setLayoutData(sl1gd);

		// toolchains choice label
		toolchains_label = new Label(c, SWT.NONE);
		toolchains_label.setFont(parent.getFont());
		toolchains_label.setLayoutData(new GridData(GridData.BEGINNING));
		toolchains_label.setText(Messages.MindProjectWizardPage_Toolchains);

		// toolchains choice grid
		tcs_choice = new Composite(c, SWT.NONE);
		tcs_choice.setLayoutData(new GridData(GridData.FILL_BOTH));
		tcs_choice.setLayout(new PageLayout());

		createToolchainsTable(tcs_choice);

		// Check button for "Show project types and toolchains only if they are supported on the platform"
		// lower part of the window
		show_sup = new Button(c, SWT.CHECK);
		show_sup.setText(Messages.MindProjectWizardPage_CMainWizardPage_1); // "Show project types and toolchains only if they are supported on the platform" string
		GridData gd1 = new GridData(GridData.FILL_HORIZONTAL);
		show_sup.setLayoutData(gd1);

		// adapter will update the right part of the window according to checkbox
		show_sup.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateToolchainsTable(show_sup.getSelection());
			}} );

		// restore settings from preferences
		show_sup.setSelection(!CDTPrefUtil.getBool(CDTPrefUtil.KEY_NOSUPP));

		// pack the window
		getShell().pack();
	}

	protected class MindWizardLocationPreferenceChangeListener implements IPageChangedListener {

		public void pageChanged(PageChangedEvent arg0) {
			System.out.println(arg0.toString());
		}

	}

	protected void updateToolchainsTable(boolean supportedOnly) {

		// reset table
		table.removeAll();

		IToolChain[] tcs = ManagedBuildManager.getRealToolChains();

		for (IToolChain tc: tcs) {
			if (isValid(tc, supportedOnly, getWizard())) {

				// TableItem attached to the table (parent in constructor)
				TableItem ti = new TableItem(table, SWT.NONE);
				String name = tc.getUniqueRealName();

				// TODO: check what it was useful for
				//String id = tc.getId();

				//TODO: add version
				ti.setText(name);
				ti.setData(tc);
			}
		}

		table.setVisible(true);

		setPageComplete(validatePage());

	}

	/**
	 * Returns whether this page's controls currently all contain valid
	 * values.
	 *
	 * @return <code>true</code> if all controls are valid, and
	 *   <code>false</code> if at least one is invalid
	 */
	@Override
	protected boolean validatePage() {
		setMessage(null);
		if (!super.validatePage())
			return false;

		if (getProjectName().indexOf('#') >= 0) {
			setErrorMessage(Messages.MindProjectWizardPage_CDTMainWizardPage_0);
			return false;
		}

		boolean bad = true; // should we treat existing project as error

		IProject handle = getProjectHandle();
		if (handle.exists()) {
			if (getWizard() instanceof IWizardWithMemory) {
				IWizardWithMemory w = (IWizardWithMemory)getWizard();
				if (w.getLastProjectName() != null && w.getLastProjectName().equals(getProjectName()))
					bad = false;
			}
			if (bad) {
				setErrorMessage(Messages.MindProjectWizardPage_CMainWizardPage_10); // "A project with that name already exists in the workspace."
				return false;
			}
		}

		if (bad) { // skip this check if project already created
			try {
				IFileStore fs;
				URI p = getProjectLocation();
				if (p == null) {
					fs = EFS.getStore(ResourcesPlugin.getWorkspace().getRoot().getLocationURI());
					fs = fs.getChild(getProjectName());
				} else
					fs = EFS.getStore(p);
				IFileInfo f = fs.fetchInfo();
				if (f.exists()) {
					if (f.isDirectory()) {
						if (f.getAttribute(EFS.ATTRIBUTE_READ_ONLY)) {
							setErrorMessage(Messages.MindProjectWizardPage_CMainWizardPage_DirReadOnlyError);
							return false;
						}
						else
							setMessage(Messages.MindProjectWizardPage_CMainWizardPage_7, IMessageProvider.WARNING); // "Directory with specified name already exists."
					} else {
						setErrorMessage(Messages.MindProjectWizardPage_CMainWizardPage_6); // "File with specified name already exists."
						return false;
					}
				}
			} catch (CoreException e) {
				CUIPlugin.log(e.getStatus());
			}
		}

		if (!useDefaults()) {
			IStatus locationStatus = ResourcesPlugin.getWorkspace().validateProjectLocationURI(handle,
					getLocationURI());
			if (!locationStatus.isOK()) {
				setErrorMessage(locationStatus.getMessage());
				return false;
			}
		}
		
		if (!isMindcToolchainConfigured() || !isMindToolchainValid()) { 
			setErrorMessage(Messages.MindProjectWizardPage_MindToolChain_InvalidOrNotConfigured);
			return false;
		}

		if (user_tc_choice == null) {
			setErrorMessage(Messages.MindProjectWizardPage_CNoToolChainSelected);
			return false;
		}

		setErrorMessage(null);
		return true;
	}

	public URI getProjectLocation() {
		return useDefaults() ? null : getLocationURI();
	}

	//
	// Methods inspired by CDT's AbstractCWizard
	// from plugin org.eclipse.cdt.managedbuilder.ui
	// and we didn't want to implement a full new CDT wizard to be found
	// as a CDT extension
	// 
	/**
	 * Checks whether toolchain can be displayed 
	 * @param tc
	 * @return
	 */
	protected boolean isValid(IToolChain tc, boolean supportedOnly, IWizard w) {
		// Check for langiuage compatibility first in any case
		if (!isLanguageCompatible(tc, w))
			return false;

		// Do not do further check if all toolchains are permitted	
		if (!supportedOnly) 
			return true;

		// Filter off unsupported and system toolchains
		if (tc == null || !tc.isSupported() || tc.isAbstract() || tc.isSystemObject()) 
			return false;

		// Check for platform compatibility
		return ManagedBuildManager.isPlatformOk(tc);
	}

	/**
	 * Checks toolchain for Language ID, Content type ID 
	 * and Extensions, if they are required by wizard.
	 * 
	 * @param tc - toolchain to check
	 * @param w - wizard which provides selection criteria
	 * @return
	 */
	@SuppressWarnings("restriction")
	protected boolean isLanguageCompatible(IToolChain tc, IWizard w) {
		if (w == null) 
			return true;
		if (!(w instanceof ICDTCommonProjectWizard))
			return true;

		ITool[] tools = tc.getTools(); 
		ICDTCommonProjectWizard wz = (ICDTCommonProjectWizard)w;
		String[] langIDs = wz.getLanguageIDs(); 
		String[] ctypeIDs = wz.getContentTypeIDs();
		String[] exts = wz.getExtensions();

		// nothing requied ?   
		if (empty(langIDs) && empty(ctypeIDs) && empty(exts))
			return true;

		for (int i=0; i<tools.length; i++) {
			IInputType[] its = tools[i].getInputTypes();

			// no input types - check only extensions
			if (empty(its)) {  
				if (!empty(exts)) {
					String[] s = tools[i].getAllInputExtensions();
					if (contains(exts, s))
						return true; // extension fits
				}
				continue;
			}
			// normal tool with existing input type(s)
			for (int j = 0; j<its.length; j++) {
				// Check language IDs
				if (!empty(langIDs)) {
					String lang = its[j].getLanguageId(tools[i]);
					if (contains(langIDs, new String[] {lang})) {
						return true; // Language ID fits
					}
				}
				// Check content types
				if (!empty(ctypeIDs)) {
					String[] ct1 = its[j].getSourceContentTypeIds();
					String[] ct2 = its[j].getHeaderContentTypeIds();
					if (contains(ctypeIDs, ct1) ||
							contains(ctypeIDs, ct2)) 
					{
						return true; // content type fits
					}
				}					
				// Check extensions
				if (!empty(exts)) {
					String[] ex1 =its[j].getHeaderExtensions(tools[i]);
					String[] ex2 =its[j].getSourceExtensions(tools[i]);
					if (contains(exts, ex1) ||
							contains(exts, ex2)) {
						return true; // extension fits fits
					}
				}
			}
		}
		return false; // no one value fits to required
	}

	private boolean empty(Object[] s) {
		return (s == null || s.length == 0);
	}

	private boolean contains(String[] s1, String[] s2) {
		for (int i=0; i<s1.length; i++) 
			for (int j=0; j<s2.length; j++) 
				if (s1[i].equals(s2[j])) 
					return true;
		return false;
	}

	public boolean getUserRuntimeChoice() {
		return userRuntimeChoice;
	}
}


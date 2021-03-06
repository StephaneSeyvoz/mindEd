package org.ow2.mindEd.ide.ui.wizards;

import org.eclipse.osgi.util.NLS;
/**
 * Messages for wizard page.
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.ow2.mindEd.ide.ui.wizards.messages"; //$NON-NLS-1$
	public static String ComponentNewWizard__opening_file;
	public static String error_cannot_find_or_create_source_folder;
	public static String error_container_does_not_exists;
	public static String ComponentNewWizard_create_adl;
	public static String error_cannot_find_or_create_package;
	public static String ComponentNewWizard_exception_error;
	public static String ComponentNewWizard_window_title;
	public static String ComponentNewWizardPage_20;
	public static String ComponentNewWizardPage_component_field_label;
	public static String ComponentNewWizardPage_description;
	public static String ComponentNewWizardPage_error_msg_choose_a_source_folder;
	public static String ComponentNewWizardPage_error_msg_choose_one_source_folder;
	public static String ComponentNewWizardPage_error_msg_component_name_must_be_specified;
	public static String ComponentNewWizardPage_error_msg_component_name_must_be_valid;
	public static String ComponentNewWizardPage_error_msg_source_folder_must_be_specified;
	public static String ComponentNewWizardPage_error_msg_source_folder_must_be_writable;
	public static String ComponentNewWizardPage_error_msg_source_folder_must_exist;
	public static String ComponentNewWizardPage_error_msg_source_folder_must_valid;	
	public static String ComponentNewWizardPage_kind_field_label;
	public static String ComponentNewWizardPage_warning_LowerCaseTypeNameDiscouraged_Convention;
	public static String ComponentNewWizardPage_package_field_browser;
	public static String ComponentNewWizardPage_package_field_label;
	public static String ComponentNewWizardPage_package_field_package_title;
	public static String ComponentNewWizardPage_src_field_browser;
	public static String ComponentNewWizardPage_src_field_label;
	public static String ComponentNewWizardPage_src_field_title;
	public static String ComponentNewWizardPage_title;
	/**
	 * @since 1.0
	 */
	public static String MindInterfaceWizard_create_itf;
	/**
	 * @since 1.0
	 */
	public static String MindInterfaceWizard_windows_title;
	/**
	 * @since 1.0
	 */
	public static String MindInterfaceWizardPage_description;
	/**
	 * @since 1.0
	 */
	public static String MindInterfaceWizard_opening_file;
	/**
	 * @since 1.0
	 */
	public static String MindInterfaceWizardPage_package_field_label;
	/**
	 * @since 1.0
	 */
	public static String MindInterfaceWizardPage_package_field_package_title;
	/**
	 * @since 1.0
	 */
	public static String MindInterfaceWizardPage_package_field_browser;
	/**
	 * @since 1.0
	 */
	public static String MindInterfaceWizardPage_interface_field_label;
	/**
	 * @since 1.0
	 */
	public static String MindInterfaceWizardPage_error_msg_component_name_must_be_specified;
	/**
	 * @since 1.0
	 */
	public static String MindInterfaceWizardPage_error_msg_component_name_must_be_valid;
	/**
	 * @since 1.0
	 */
	public static String MindInterfaceWizardPage_20;
	public static String MindPackageWizard_task;
	public static String MindPackageWizard_window_title;
	public static String MindPackageWizardPage_description;
	public static String MindPackageWizardPage_error_package_must_be_specified;
	public static String MindPackageWizardPage_error_package_must_be_valid_contains_dot_dot;
	public static String MindPackageWizardPage_error_package_must_be_valid_contains_space;
	public static String MindPackageWizardPage_error_package_must_be_valid_ends_with_dot;
	public static String MindPackageWizardPage_error_package_must_be_valid_starts_with_dot;
	public static String MindPackageWizardPage_title;
	public static String MindProjectWizard_creation_problems;
	public static String MindProjectWizard_description;
	public static String MindProjectWizard_internal_error;
	public static String MindProjectWizard_operation_label;
	public static String MindProjectWizard_title;
	public static String MindProjectWizard_window_title;
	
	/**
	 * All the following messages are related to New Project Wizard, 
	 */
	public static String MindProjectWizardPage_Toolchains;
	public static String MindProjectWizardPage_MindRuntime;
	public static String MindProjectWizardPage_MindLanguage;
	public static String MindProjectWizardPage_MindC;
	public static String MindProjectWizardPage_MindCPP;
	
	/**
	 * And those have been imported from CDT (with prefix)
	 * care about licence issues ?
	 */
	public static String MindProjectWizardPage_CDTMainWizardPage_0;
	public static String MindProjectWizardPage_CDTMainWizardPage_1;

	public static String MindProjectWizardPage_CMainWizardPage_0;
	public static String MindProjectWizardPage_CMainWizardPage_1;
	public static String MindProjectWizardPage_CMainWizardPage_3;
	public static String MindProjectWizardPage_CMainWizardPage_5;
	public static String MindProjectWizardPage_CMainWizardPage_6;
	public static String MindProjectWizardPage_CMainWizardPage_7;
	public static String MindProjectWizardPage_CMainWizardPage_10;
	public static String MindProjectWizardPage_CMainWizardPage_DirReadOnlyError;

	public static String MindProjectWizardPage_CDTMainWizardPage_DefaultProjectType;
	public static String MindProjectWizardPage_CDTMainWizardPage_DefaultProjectCategory;

	public static String MindProjectWizardPage_CNoToolChainSelected;
	public static String MindProjectWizardPage_MindToolChain_InvalidOrNotConfigured;
	public static String MindProjectWizardPage_LanguageNotSelected;
	public static String MindProjectWizardPage_MindConfig;
	public static String MindProjectWizardPage_MindcLocation;
	public static String MindInterfaceWizardPage_warning_LowerCaseTypeNameDiscouraged_Convention;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}

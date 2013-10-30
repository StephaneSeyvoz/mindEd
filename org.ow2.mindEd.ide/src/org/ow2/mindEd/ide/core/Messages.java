package org.ow2.mindEd.ide.core;

import org.eclipse.osgi.util.NLS;
/**
 * Messages for wizard page.
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.ow2.mindEd.ide.core.ide"; //$NON-NLS-1$
	public static String CDTUtil_ASFlags;
	public static String CDTUtil_ASFlagsComment;
	public static String CDTUtil_AssemblerCommand;
	public static String CDTUtil_CFlags;
	public static String CDTUtil_CFlagsComment;
	public static String CDTUtil_ChangeMindcLocation_MINDROOTvar_Job;
	public static String CDTUtil_ChangeMINDROOT_Trace;
	public static String CDTUtil_ChangeRuntimeFolders_ErrorNoLocation_Log;
	public static String CDTUtil_ChangeRuntimeFolders_ErrorNoRuntimeSubFolder_Log;
	public static String CDTUtil_ChangeRuntimeFolders_Job;
	public static String CDTUtil_ChangeRuntimeFolders_Trace;
	public static String CDTUtil_CompilerCommand;
	public static String CDTUtil_CompilerCommandComment;
	public static String CDTUtil_CPPFlags;
	public static String CDTUtil_CPPFlagsComment;
	public static String CDTUtil_CreateCSourceFolderFor_Job;
	public static String CDTUtil_CreateCSourceFolderFor_Trace;
	public static String CDTUtil_CreatingCSourceFolder_Trace;
	public static String CDTUtil_DoneChangingMINDROOT_Trace;
	public static String CDTUtil_DoneChangingRuntimeFolders_Trace;
	public static String CDTUtil_DoneCreatingCSourceFolder_Trace;
	public static String CDTUtil_DoneRemovingCSourceFolder_Trace;
	public static String CDTUtil_ErrorParserId;
	public static String CDTUtil_ExtraOptions;
	public static String CDTUtil_ExtraOptionsComment;
	public static String CDTUtil_FoundAssembler;
	public static String CDTUtil_FoundCompiler;
	public static String CDTUtil_FoundLinker;
	public static String CDTUtil_IncludePath;
	public static String CDTUtil_IncludePathComment;
	public static String CDTUtil_initMindProjectMethod;
	public static String CDTUtil_LDFlags;
	public static String CDTUtil_LDFlagsComment;
	public static String CDTUtil_LinkerCommand;
	public static String CDTUtil_OutputDirComment;
	public static String CDTUtil_OutputDirectory;
	public static String CDTUtil_PropertiesHeader0;
	public static String CDTUtil_PropertiesHeader1;
	public static String CDTUtil_PropertiesSuffix;
	public static String CDTUtil_RemoveCSourceFolder_Job;
	public static String CDTUtil_RemoveCSourceFolder_Trace;
	public static String CDTUtil_RemovingCSourceFolder_Trace;
	public static String CDTUtil_SourcePath;
	public static String CDTUtil_SourcePathComment;
	public static String error_cannot_find_or_create_source_folder;
	public static String error_container_does_not_exists;
	public static String error_cannot_find_or_create_package;
	public static String MindPackageWizard_task;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}

package org.ow2.mindEd.ide.core.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.PropertiesConfigurationLayout;
import org.eclipse.cdt.core.CCProjectNature;
import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.core.envvar.IEnvironmentVariable;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.COutputEntry;
import org.eclipse.cdt.core.settings.model.CSourceEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICOutputEntry;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.ICSettingEntry;
import org.eclipse.cdt.core.settings.model.ICSourceEntry;
import org.eclipse.cdt.core.settings.model.WriteAccessException;
import org.eclipse.cdt.core.settings.model.extension.CConfigurationData;
import org.eclipse.cdt.internal.core.envvar.EnvironmentVariableManager;
import org.eclipse.cdt.internal.core.envvar.UserDefinedEnvironmentSupplier;
import org.eclipse.cdt.managedbuilder.core.IBuilder;
import org.eclipse.cdt.managedbuilder.core.IConfiguration;
import org.eclipse.cdt.managedbuilder.core.IManagedBuildInfo;
import org.eclipse.cdt.managedbuilder.core.ITool;
import org.eclipse.cdt.managedbuilder.core.IToolChain;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;
import org.eclipse.cdt.managedbuilder.internal.core.Tool;
import org.eclipse.cdt.newmake.core.IMakeBuilderInfo;
import org.eclipse.cdt.utils.envvar.StorableEnvironment;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.ow2.mindEd.ide.core.FamilyJobCST;
import org.ow2.mindEd.ide.core.MindActivator;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.MindModel;
import org.ow2.mindEd.ide.core.MindModelManager;
import org.ow2.mindEd.ide.core.MindNature;
import org.ow2.mindEd.ide.core.template.TemplateMake;
import org.ow2.mindEd.ide.model.MindProject;

public class CDTUtil {

	private final static String OLD_BINARY_PARSER_ID = "org.eclipse.cdt.core.BinaryParser";	//$NON-NLS-1$

	private static final class RemoveCSourceFolderJob extends Job {
		private final IFolder f;

		private RemoveCSourceFolderJob(IFolder f) {
			super(Messages.CDTUtil_RemoveCSourceFolder_Job+f.getFullPath());
			this.f = f;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (MindModelImpl.TRACING)
					System.out.println(Messages.CDTUtil_RemoveCSourceFolder_Trace + f);
				final ICProjectDescriptionManager mgr = CoreModel
						.getDefault().getProjectDescriptionManager();
				final ICProjectDescription des = mgr.getProjectDescription(
						f.getProject(), true);
				if (des == null)
					return Status.OK_STATUS; // Not C project pas encore ou enlever

				ICConfigurationDescription config = des.getActiveConfiguration();
				ArrayList<ICSourceEntry> srcs = new ArrayList<ICSourceEntry>(
						Arrays.asList(config.getSourceEntries()));
				for (ICSourceEntry icSourceEntry : srcs) {
					if (!f.getProject().isOpen()
							|| !f.getProject().exists())
						return Status.OK_STATUS;
					if (icSourceEntry.getFullPath().equals(f.getFullPath())) {
						if (MindModelImpl.TRACING)
							System.out.println(Messages.CDTUtil_RemovingCSourceFolder_Trace
									+ f);
						srcs.remove(icSourceEntry);
						config.setSourceEntries((ICSourceEntry[]) srcs
								.toArray(new ICSourceEntry[srcs.size()]));
						if (!f.getProject().exists())
							return Status.OK_STATUS;
						mgr.setProjectDescription(f.getProject(), des);
						if (MindModelImpl.TRACING)
							System.out
							.println(Messages.CDTUtil_DoneRemovingCSourceFolder_Trace
									+ f);
						return Status.OK_STATUS;
					}
				}
			} catch (CoreException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			}
			return Status.OK_STATUS;
		}

		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_REMOVE_CSOURCE_FOLDER == family;
		}
	}

	private static final class CreateCSourceFolderJob extends Job {
		private final IFolder f;

		private CreateCSourceFolderJob(IFolder f) {
			super(Messages.CDTUtil_CreateCSourceFolderFor_Job+f.getFullPath());
			this.f = f;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (MindModelImpl.TRACING)
					System.out.println(Messages.CDTUtil_CreateCSourceFolderFor_Trace + f);
				ICProjectDescriptionManager mgr = CoreModel.getDefault()
						.getProjectDescriptionManager();
				ICProjectDescription des = mgr.getProjectDescription(f
						.getProject(), true);
				if (des == null)
					return Status.OK_STATUS; // Not C project pas encore ou enlever
				ICSourceEntry srcEntry = new CSourceEntry(f, null,
						ICSettingEntry.VALUE_WORKSPACE_PATH);
				ICConfigurationDescription config = des.getActiveConfiguration();
				ArrayList<ICSourceEntry> srcs = new ArrayList<ICSourceEntry>(
						Arrays.asList(config.getSourceEntries()));
				for (ICSourceEntry icSourceEntry : srcs) {
					if (icSourceEntry.getFullPath().equals(f.getFullPath()))
						return Status.OK_STATUS;
				}
				if (MindModelImpl.TRACING)
					System.out.println(Messages.CDTUtil_CreatingCSourceFolder_Trace + f);
				srcs.add(srcEntry);
				config.setSourceEntries((ICSourceEntry[]) srcs
						.toArray(new ICSourceEntry[srcs.size()]));
				mgr.setProjectDescription(f.getProject(), des);
				if (MindModelImpl.TRACING)
					System.out.println(Messages.CDTUtil_DoneCreatingCSourceFolder_Trace + f);
			} catch (WriteAccessException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			} catch (CoreException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			}
			return Status.OK_STATUS;
		}

		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_CREATE_CSOURCE_FOLDER == family;
		}
	}

	private static final class ChangeMindcLocation extends Job {
		private final String mindcLocation;

		private ChangeMindcLocation(String mindcLocation) {
			super(Messages.CDTUtil_ChangeMindcLocation_MINDROOTvar_Job);
			this.mindcLocation = mindcLocation;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (MindModelImpl.TRACING)
					System.out.println(Messages.CDTUtil_ChangeMINDROOT_Trace
							+ mindcLocation);
				UserDefinedEnvironmentSupplier usersupplier = EnvironmentVariableManager.fUserSupplier;
				StorableEnvironment wsEnv = usersupplier
						.getWorkspaceEnvironmentCopy();
				IEnvironmentVariable var = wsEnv.getVariable(MIND_ROOT);
				if (var != null) {
					wsEnv.deleteVariable(MIND_ROOT);
				}
				wsEnv.createVariable(MIND_ROOT, mindcLocation);
				usersupplier.setWorkspaceEnvironment(wsEnv);
				MindIdeCore.rebuidAll();
				if (MindModelImpl.TRACING)
					System.out.println(Messages.CDTUtil_DoneChangingMINDROOT_Trace
							+ mindcLocation);

			} catch (WriteAccessException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			}
			return Status.OK_STATUS;
		}


		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_CHANGE_MINDC_LOCATION == family;
		}
	}

	private static final class ChangeMindcRuntimeLocation extends Job {
		private final String mindcRuntimeLocation;

		private ChangeMindcRuntimeLocation(String mindcRuntimeLocation) {
			super(Messages.CDTUtil_ChangeRuntimeFolders_Job);
			this.mindcRuntimeLocation = mindcRuntimeLocation;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (MindModelImpl.TRACING)
					System.out.println(Messages.CDTUtil_ChangeRuntimeFolders_Trace
							+ mindcRuntimeLocation);

				List<MindProject> allMindProjects = MindIdeCore.getModel().getAllProject();
				for (MindProject currProject : allMindProjects) {
					if (mindcRuntimeLocation == null) {
						MindActivator.log(new Status(Status.ERROR, MindActivator.ID, Messages.CDTUtil_ChangeRuntimeFolders_ErrorNoLocation_Log));
					} else {
						// is a "folder" but File is the Java way :)
						File mindRuntimeFile = new File(mindcRuntimeLocation);
						if (!mindRuntimeFile.exists()) {
							MindActivator.log(new Status(Status.ERROR, MindActivator.ID, Messages.CDTUtil_ChangeRuntimeFolders_ErrorNoRuntimeSubFolder_Log));
							continue;
						}

						// get the IProject runtime
						IFolder eclipseRuntimeFolder = currProject.getProject().getFolder("runtime"); //$NON-NLS-1$

						// Only redefine the folder link destination if it's a link
						// otherwise we would crush possibly hand-made local (not linked) runtimes.
						if (eclipseRuntimeFolder.exists() && eclipseRuntimeFolder.isLinked())
							eclipseRuntimeFolder.createLink(new Path(mindRuntimeFile.getAbsolutePath()), IResource.REPLACE, monitor);
					}
				}

				// Why not
				MindIdeCore.rebuidAll();
				if (MindModelImpl.TRACING)
					System.out.println(Messages.CDTUtil_DoneChangingRuntimeFolders_Trace
							+ mindcRuntimeLocation);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Status.OK_STATUS;
		}


		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_CHANGE_MINDC_RUNTIME_LOCATION == family;
		}
	}

	private static final String MIND_ROOT = "MIND_ROOT"; //$NON-NLS-1$

	public static void createCSourceFolder(final IFolder f)
			throws CoreException {
		
		if (f == null) return; // Defensive programming: don't do the job if there is nothing to configure
		
		Job r = new CreateCSourceFolderJob(f);
		r.setRule(f.getWorkspace().getRoot());
		r.schedule();
	}

	public static void removeCSourceFolder(final IFolder f)
			throws CoreException {
		if (!f.getProject().isOpen() || !f.getProject().exists())
			return;

		Job r = new RemoveCSourceFolderJob(f);
		r.setRule(f.getWorkspace().getRoot());
		r.schedule();
	}

	public static void changeMINDCLocation(final String mindcLocation) {
		// Changing MIND_ROOT in the environment
		Job rMindc = new ChangeMindcLocation(mindcLocation);
		rMindc.setRule(ResourcesPlugin.getWorkspace().getRoot());
		rMindc.schedule();

		// Changing runtime linked folders destination
		Job rRuntime = new ChangeMindcRuntimeLocation(mindcLocation + File.separator + "runtime"); //$NON-NLS-1$
		rRuntime.setRule(ResourcesPlugin.getWorkspace().getRoot());
		rRuntime.schedule();
	}

	public static String getMINDCLocation() {
		UserDefinedEnvironmentSupplier usersupplier = EnvironmentVariableManager.fUserSupplier;
		StorableEnvironment wsEnv = usersupplier.getWorkspaceEnvironmentCopy();
		IEnvironmentVariable var = wsEnv.getVariable(MIND_ROOT);
		if (var != null) {
			return var.getValue();
		}
		return null;
	}

	/**
	 * Initialize a mind project. Do not call this method.
	 * 
	 * @param newProject
	 *            create project
	 * @param monitor
	 * @param importRuntime 
	 * @param toolChain 
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	public static void initMindProject(IProject newProject,
			IProgressMonitor monitor, boolean importRuntime, boolean isCPP, IToolChain toolChain) throws CoreException,
			UnsupportedEncodingException {

		CProjectNature.addNature(newProject, "org.eclipse.xtext.ui.shared.xtextNature",	monitor); //$NON-NLS-1$
		CProjectNature.addNature(newProject, MindNature.NATURE_ID, monitor);

		// create Makefile first
		IFile makefile = newProject.getFile("Makefile"); //$NON-NLS-1$
		if (!makefile.exists())
			makefile.create(
					new ByteArrayInputStream(createMakeTemplate(newProject)), true,
					monitor);

		// Create the default structure
		IFolder targetFolder = newProject.getFolder("target"); //$NON-NLS-1$
		if (!targetFolder.exists())
			targetFolder.create(true, true, monitor);
		
		// Make the folder tree ready - Should both work for simple keys such as "src" or more complicated ones like "src/main/mind"
		String[] splitDefaultSrcPath = Messages.CDTUtil_DefaultSourcePath.split("/"); //$NON-NLS-1$
		String currSubPath = null;
		for (String currSubFolderName : splitDefaultSrcPath) {
			if (currSubPath == null)
				currSubPath = currSubFolderName;
			else
				currSubPath = currSubPath + "/" + currSubFolderName; //$NON-NLS-1$
			IFolder currSubFolder = newProject.getFolder(currSubPath);
			if (!currSubFolder.exists())
				currSubFolder.create(true, true, monitor);
		}
		
		// is now always ready thanks to the previous loop
		IFolder srcFolder = newProject.getFolder(Messages.CDTUtil_DefaultSourcePath);
		
		// repeat same task for tests
		String[] splitDefaultTestSrcPath = Messages.CDTUtil_DefaultTestSourcePath.split("/"); //$NON-NLS-1$
		currSubPath = null;
		for (String currSubFolderName : splitDefaultTestSrcPath) {
			if (currSubPath == null)
				currSubPath = currSubFolderName;
			else
				currSubPath = currSubPath + "/" + currSubFolderName; //$NON-NLS-1$
			IFolder currSubFolder = newProject.getFolder(currSubPath);
			if (!currSubFolder.exists())
				currSubFolder.create(true, true, monitor);
		}
		
		// is now always ready thanks to the previous loop
		IFolder testFolder = newProject.getFolder(Messages.CDTUtil_DefaultTestSourcePath);
		
		// Link the runtime folder to the compiler runtime from the Mindc location variable (in preference store)
		IFolder runtimeFolder = null;
		String mindLocation = null;
		if (importRuntime) {
			mindLocation = MindActivator.getPref().getMindCLocation();
			if (mindLocation == null) {
				MindActivator.log(new Status(Status.ERROR, MindActivator.ID, Messages.CDTUtil_RuntimeLocationNotCreatedCauseNotConfigured));
			} else {
				// is a "folder" but File is the Java way :)
				File mindRuntimeFile = new File(mindLocation + "/runtime"); //$NON-NLS-1$

				runtimeFolder = newProject.getFolder("runtime"); //$NON-NLS-1$
				if (mindRuntimeFile.exists() && !runtimeFolder.exists())
					runtimeFolder.createLink(new Path(mindRuntimeFile.getAbsolutePath()), IResource.ALLOW_MISSING_LOCAL, monitor);
			}
		}
		// end runtime folder

		// Propagating toolchain information for CDT integration
		// C Toolchains management inspired from:
		// org.eclipse.cdt.managedbuilder.ui.wizards.STDWizardHandler#setProjectDescription
		// AND
		// org.eclipse.cdt.managedbuilder.ui.wizards.NewMakeProjFromExisting#performFinish
		// (see inner "execute" method of the "WorkspaceModifyOperation")

		// Set CDT information
		ICProjectDescriptionManager mgr = CoreModel.getDefault()
				.getProjectDescriptionManager();
		ICProjectDescription projDesc = mgr.createProjectDescription(newProject, false);

		IManagedBuildInfo info = ManagedBuildManager.createBuildInfo(newProject);

		IConfiguration firstExtCfg = null;

		firstExtCfg = ManagedBuildManager.getFirstExtensionConfiguration(toolChain);

		ManagedProject mProj = new ManagedProject(newProject, firstExtCfg.getProjectType());
		info.setManagedProject(mProj);

		String id = ManagedBuildManager.calculateChildId(
				firstExtCfg.getId(), null);

		// Configuration(ManagedProject managedProject, Configuration cloneConfig, String id, boolean cloneChildren, boolean temporary)
		Configuration config = new Configuration(mProj, (Configuration) firstExtCfg, id, true, false);

		CConfigurationData data = config.getConfigurationData();
		ICConfigurationDescription cfgDes = projDesc.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, data);
		config.setConfigurationDescription(cfgDes);
		config.exportArtifactInfo();

		// We don't want CDT Internal Builder so we take inspiration from STDWizardHandler#setProjectDescription
		// and its
		// if (bld != null) { 		if(bld.isInternalBuilder()) { ... } } block to change from CDT Internal to GNU Make
		IBuilder bld = config.getEditableBuilder();
		if (bld != null) {
			// change default choice from CDT Internal Builder to GNU Make Builder
			if(bld.isInternalBuilder()){
				IConfiguration prefCfg = ManagedBuildManager.getPreferenceConfiguration(false);
				IBuilder prefBuilder = prefCfg.getBuilder();
				config.changeBuilder(prefBuilder, ManagedBuildManager.calculateChildId(config.getId(), null), prefBuilder.getName());
				bld = config.getEditableBuilder();
			}

			// It's make (not eclipse)
			bld.setManagedBuildOn(false);
			
			// For the time being we force Make, we use ${ConfigName}
			// for the Makefile to use the good ${ConfigName}.properties file according to the active Configuration,
			// and the usual "all" target
			bld.setBuildAttribute(IMakeBuilderInfo.BUILD_TARGET_INCREMENTAL, Messages.CDTUtil_MakeConfigAllArgument);
			bld.setBuildAttribute(IMakeBuilderInfo.BUILD_TARGET_CLEAN, Messages.CDTUtil_MakeConfigCleanArgument);
			
			// The makefile is in the project root
			bld.setBuildPath("${project_loc}"); //$NON-NLS-1$

			// the build directory ('build')
			ICOutputEntry buildEntry = new COutputEntry(targetFolder, null,
					ICSettingEntry.VALUE_WORKSPACE_PATH);
			bld.getBuildData().setOutputDirectories(
					new ICOutputEntry[] { buildEntry });
			bld.getBuildData();
		}

		// the name of this configuration is Default
		String defaultConfName = "Default"; //$NON-NLS-1$

		config.setName(defaultConfName);
		config.setArtifactName(mProj.getDefaultArtifactName());

		// Create a source entries ArrayList
		List<ICSourceEntry> sourceEntries = new ArrayList<ICSourceEntry>();

		// ADD the user source entry ("src/main/mind")
		ICSourceEntry srcEntry = new CSourceEntry(srcFolder, null, ICSettingEntry.VALUE_WORKSPACE_PATH);
		sourceEntries.add(srcEntry);

		// ADD the user test source entry ("src/test/mind")
		ICSourceEntry testEntry = new CSourceEntry(testFolder, null, ICSettingEntry.VALUE_WORKSPACE_PATH);
		sourceEntries.add(testEntry);
		
		// ADD the source entry 'runtime'
		if (mindLocation != null) {
			ICSourceEntry runtimeEntry = new CSourceEntry(runtimeFolder, null, ICSettingEntry.VALUE_WORKSPACE_PATH);
			sourceEntries.add(runtimeEntry);
		}

		// convert the List to good-sized typed array
		config.setSourceEntries(sourceEntries.toArray(new ICSourceEntry[sourceEntries.size()]));

		// add the Mindc error parser to the project defaults
		String[] defaultErrorParserListArray = config.getErrorParserList();
		List<String> defaultErrorParserList = new ArrayList<String>(Arrays.asList(defaultErrorParserListArray));
		// See plugin.xml extension MindcErrorParser (we're in project org.ow2.mindEd.ide)
		defaultErrorParserList.add(Messages.CDTUtil_ErrorParserId);
		config.setErrorParserList(defaultErrorParserList.toArray(new String[defaultErrorParserList.size()]));

		// ADD CPL Macro settingsfff
		Set<String> settingProviders = new HashSet<String>(Arrays.asList(cfgDes.getExternalSettingsProviderIds())); 

		settingProviders.add(CPLMacroSettings.ID);
		cfgDes.setExternalSettingsProviderIds(settingProviders.toArray(new String[settingProviders.size()]));

		// finish the C job
		mgr.setProjectDescription(newProject, projDesc);

		// add nature
		// Note: this task HAS TO BE LAST, AFTER configuration
		// (the C_NATURE triggers lots of C configuration, with default values, leading to troublesome situations otherwise)
		CProjectNature.addCNature(newProject, monitor);

		// Optionally C++ nature
		if (isCPP)
			CCProjectNature.addCCNature(newProject, monitor);
		
		// Add the runtime if needed
		// Only do so after Mind nature is enabled, in order for things to be ready to configure
		try {
			MindModel mModel = MindModelManager.getMindModelManager().getMindModel();
			mModel.init(newProject);
			if (runtimeFolder != null)
				mModel.findOrCreateRootSrc(runtimeFolder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MindProperties configProperties = new MindProperties(newProject, config, srcFolder, testFolder, targetFolder);
		configProperties.generateFile(monitor, isCPP);
	}

	/**
	 * The default template for makefile
	 * 
	 * @param newProject2
	 *            the project where put the make file
	 * @return The make file.
	 * @throws UnsupportedEncodingException
	 *             (Cannot find the default charset)
	 * @throws CoreException
	 *             (Cannot find the default charset)
	 */
	protected static byte[] createMakeTemplate(IProject newProject2)
			throws UnsupportedEncodingException, CoreException {
		return (new TemplateMake().generate(newProject2)).getBytes(newProject2
				.getDefaultCharset());
	}
}

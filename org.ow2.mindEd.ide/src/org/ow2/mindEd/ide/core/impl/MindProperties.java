/**
 * 
 */
package org.ow2.mindEd.ide.core.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.PropertiesConfigurationLayout;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.managedbuilder.core.IConfiguration;
import org.eclipse.cdt.managedbuilder.core.ITool;
import org.eclipse.cdt.managedbuilder.core.IToolChain;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Tool;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.ow2.mindEd.ide.core.MindActivator;

@SuppressWarnings("restriction")
public class MindProperties {

	private IProject _project;
	private IConfiguration _configuration;
	private IFolder _srcFolder;
	private IFolder _testFolder;
	private IFolder _outFolder;
	private IFile propertiesIFile;

	/**
	 * Used for initial creation of Properties file.
	 * @param p
	 * @param toolChain
	 * @param c
	 * @param outFolder 
	 */
	public MindProperties(IProject p, IConfiguration c, IFolder srcFolder, IFolder testFolder, IFolder outFolder) {
		_project = p;
		_configuration = c;
		_srcFolder = srcFolder;
		_testFolder = testFolder;
		_outFolder = outFolder;
	}

	/**
	 * Must only be used to modify an existing project with CDT configuration and toolchain defined.
	 * In the case of a non-CDT project, calls for file modification will not work.
	 * @param project
	 */
	public MindProperties(IProject project) {

		_project = project;

		final ICProjectDescriptionManager mgr = CoreModel
				.getDefault().getProjectDescriptionManager();
		final ICProjectDescription des = mgr.getProjectDescription(
				project, true);
		if (des == null)
			return; // Not a C project

		// retrieve CDT build-system-level info from CDT core-level info
		ICConfigurationDescription configDesc = des.getActiveConfiguration();
		_configuration = ManagedBuildManager.getConfigurationForDescription(configDesc);
	}

	private IFile getPropertiesIFile() {
		if (_project != null && _configuration != null && propertiesIFile == null)
			propertiesIFile = _project.getFile(_configuration.getName() + Messages.CDTUtil_PropertiesSuffix);
		return propertiesIFile; // may be null in the case of a new MindProperties(IProject)
	}

	public void generateFile(IProgressMonitor monitor, boolean isCPP) {
		ITool compiler = getCompiler(_configuration.getToolChain(), isCPP);
		ITool linker = getLinker(_configuration.getToolChain(), isCPP);
		ITool assembler = getAssembler(_configuration.getToolChain()); // we do not handle C++ here yet, use default


		MindActivator.log(new Status(Status.INFO, MindActivator.ID, MindActivator.ID + Messages.CDTUtil_initMindProjectMethod + _project.getName() + ": " + Messages.CDTUtil_FoundCompiler + compiler.getToolCommand()));
		MindActivator.log(new Status(Status.INFO, MindActivator.ID, MindActivator.ID + Messages.CDTUtil_initMindProjectMethod + _project.getName() + ": " + Messages.CDTUtil_FoundLinker + linker.getToolCommand())); //$NON-NLS-1$
		MindActivator.log(new Status(Status.INFO, MindActivator.ID, MindActivator.ID + Messages.CDTUtil_initMindProjectMethod + _project.getName() + ": " + Messages.CDTUtil_FoundAssembler + assembler.getToolCommand())); //$NON-NLS-1$

		// generate build properties file
		IFile properties = getPropertiesIFile();
		if (!properties.exists()) {
			PropertiesConfiguration defaultProps = new PropertiesConfiguration();
			PropertiesConfigurationLayout defaultPropsLayout = defaultProps.getLayout();

			// store properties in the buffer and add a comment
			String propComments = Messages.CDTUtil_PropertiesHeader0 + _configuration.getName() + Messages.CDTUtil_PropertiesHeader1;
			defaultProps.setHeader(propComments);

			// used as a buffer to convert from OutputStream to InputStream
			ByteArrayOutputStream defaultValuesOut = new ByteArrayOutputStream();

			String emptyStr = ""; //$NON-NLS-1$

			// default properties
			defaultProps.setProperty(Messages.CDTUtil_SourcePath, _srcFolder.getProjectRelativePath().toPortableString());
			defaultPropsLayout.setComment(Messages.CDTUtil_SourcePath, Messages.CDTUtil_SourcePathComment);
			defaultProps.setProperty(Messages.CDTUtil_TestSourcePath, _testFolder.getProjectRelativePath().toPortableString());
			defaultPropsLayout.setComment(Messages.CDTUtil_TestSourcePath, Messages.CDTUtil_TestSourcePathComment);
			defaultProps.setProperty(Messages.CDTUtil_OutputDirectory, _outFolder.getProjectRelativePath().toPortableString()); 
			defaultPropsLayout.setComment(Messages.CDTUtil_OutputDirectory, Messages.CDTUtil_OutputDirComment);
			defaultProps.setProperty(Messages.CDTUtil_IncludePath, emptyStr); // null is not allowed
			defaultPropsLayout.setComment(Messages.CDTUtil_IncludePath, Messages.CDTUtil_IncludePathComment);

			// target component/binary info
			defaultProps.setProperty(Messages.CDTUtil_TargetComponent, "");
			defaultPropsLayout.setBlancLinesBefore(Messages.CDTUtil_TargetComponent, 1); // 1 = number of blank lines
			defaultPropsLayout.setComment(Messages.CDTUtil_TargetComponent, Messages.CDTUtil_TargetComponentComment);
			defaultProps.setProperty(Messages.CDTUtil_BinaryName, "");
			defaultPropsLayout.setComment(Messages.CDTUtil_BinaryName, Messages.CDTUtil_BinaryNameComment);

			// refined build info
			defaultProps.setProperty(Messages.CDTUtil_CompilerCommand, compiler.getToolCommand());
			defaultPropsLayout.setBlancLinesBefore(Messages.CDTUtil_CompilerCommand, 1); // 1 = number of blank lines
			defaultPropsLayout.setComment(Messages.CDTUtil_CompilerCommand, Messages.CDTUtil_CompilerCommandComment); // name the group: attach on the first element
			defaultProps.setProperty(Messages.CDTUtil_LinkerCommand, linker.getToolCommand());
			defaultProps.setProperty(Messages.CDTUtil_AssemblerCommand, assembler.getToolCommand());

			// target compiler flags
			defaultProps.setProperty(Messages.CDTUtil_ASFlags, emptyStr);
			defaultPropsLayout.setBlancLinesBefore(Messages.CDTUtil_ASFlags, 1); // 1 = number of blank lines
			defaultPropsLayout.setComment(Messages.CDTUtil_ASFlags, Messages.CDTUtil_ASFlagsComment);
			defaultProps.setProperty(Messages.CDTUtil_CPPFlags, emptyStr);
			defaultPropsLayout.setComment(Messages.CDTUtil_CPPFlags, Messages.CDTUtil_CPPFlagsComment);
			// default
			String cFlags = emptyStr;
			// special case - override with specific
			if (_configuration.getToolChain().getId().startsWith("iar."))
				cFlags = "-D__MIND_NO_GCC_ATTRIBUTE";
			defaultProps.setProperty(Messages.CDTUtil_CFlags, cFlags);
			defaultPropsLayout.setComment(Messages.CDTUtil_CFlags, Messages.CDTUtil_CFlagsComment);
			defaultProps.setProperty(Messages.CDTUtil_LDFlags, emptyStr);
			defaultPropsLayout.setComment(Messages.CDTUtil_LDFlags, Messages.CDTUtil_LDFlagsComment);

			// extra properties
			String extraOptsValue = emptyStr; // default case
			if (_configuration.getToolChain().getId().startsWith("iar.")) // special case - override with specific
				extraOptsValue = extraOptsValue + "--iar ";
			if (isCPP)
				extraOptsValue = extraOptsValue + "--cpp --flatten ";
			defaultProps.setProperty(Messages.CDTUtil_ExtraOptions, extraOptsValue);
			defaultPropsLayout.setBlancLinesBefore(Messages.CDTUtil_ExtraOptions, 1); // 1 = number of blank lines
			defaultPropsLayout.setComment(Messages.CDTUtil_ExtraOptions, Messages.CDTUtil_ExtraOptionsComment);

			// test extra properties (such as --automated, --console, --gcov)
			String testExtraOptsValue = "--ld-flags=-lcunit ";
			defaultProps.setProperty(Messages.CDTUtil_TestExtraOptions, testExtraOptsValue);
			defaultPropsLayout.setBlancLinesBefore(Messages.CDTUtil_TestExtraOptions, 1); // 1 = number of blank lines
			defaultPropsLayout.setComment(Messages.CDTUtil_TestExtraOptions, Messages.CDTUtil_TestExtraOptionsComment);

			try {
				defaultProps.save(defaultValuesOut);
				properties.create(new ByteArrayInputStream(defaultValuesOut.toByteArray()), true, monitor);
			} catch (ConfigurationException e) {
				// do nothing: if saving failed, do not create the file
			} catch (CoreException e) {
				// file creation failed: do nothing as well, file will just be missing
			}

		}
	}

	private PropertiesConfiguration loadProperties() throws CoreException {
		InputStream is;
		PropertiesConfiguration propertiesConf = new PropertiesConfiguration();
		try {
			IFile propertiesFile = getPropertiesIFile(); 
			if (propertiesFile == null || !propertiesFile.exists())
				return null;
			is = propertiesFile.getContents();
			propertiesConf.load(is);
		} catch (ConfigurationException e) {
			// do nothing and return empty configuration
		}
		return propertiesConf;
	}

	private void saveProperties(PropertiesConfiguration propertiesConf) throws CoreException {
		IFile propertiesFile = getPropertiesIFile(); 
		if (propertiesFile == null)
			return;

		// used as a buffer to convert from OutputStream to InputStream
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();

		try {
			propertiesConf.save(outStream);
			propertiesFile.setContents(new ByteArrayInputStream(outStream.toByteArray()), IFile.FORCE, null);
		} catch (ConfigurationException e) {
			// do nothing: if saving failed, do not create the file
		}
	}

	/**
	 * Finds a compiler from its build type in the tool-chain.
	 * This returns the first tool found.
	 */
	private ITool getCompiler(IToolChain toolchain, boolean isCPP) {

		ITool[] tools = toolchain.getTools();
		Tool currTool = null;
		for (ITool tool : tools) {
			if (isCPP) {
				// We want a C++ compiler as a default or at least a compiler supporting both C and C++ but NOT only C
				if (!(tool.getNatureFilter() == ITool.FILTER_CC) && !(tool.getNatureFilter() == ITool.FILTER_BOTH))
					continue;
			} else { 			
				// We want a C compiler as a default or at least a compiler supporting both C and C++ but NOT only C++
				if (!(tool.getNatureFilter() == ITool.FILTER_C) && !(tool.getNatureFilter() == ITool.FILTER_BOTH))
					continue;
			}

			currTool = (Tool) tool;
			if (currTool.supportsType("org.eclipse.cdt.build.core.buildType")) { //$NON-NLS-1$
				String[] supportedTypesArray = currTool.getSupportedTypeIds();
				for (String currTypeStr : supportedTypesArray) {
					String[] supportedValuesForCurrType = currTool.getSupportedValueIds(currTypeStr);
					for (String currValueStr : supportedValuesForCurrType) {
						if (currValueStr.equals("org.eclipse.cdt.build.core.buildType.release") || currValueStr.equals("org.eclipse.cdt.build.core.buildType.debug")) //$NON-NLS-1$ //$NON-NLS-2$
							return tool;
					}
				}

			}
		}
		return null;
	}

	/**
	 * Finds a linker from its build type in the tool-chain.
	 * This returns the first tool found.
	 */
	private ITool getLinker(IToolChain toolchain, boolean isCPP) {

		ITool[] tools = toolchain.getTools();
		Tool currTool = null;
		for (ITool tool : tools) {
			if (isCPP) {
				// We want a C++ compiler as a default or at least a compiler supporting both C and C++ but NOT only C
				if (!(tool.getNatureFilter() == ITool.FILTER_CC) && !(tool.getNatureFilter() == ITool.FILTER_BOTH))
					continue;
			} else { 			
				// We want a C compiler as a default or at least a compiler supporting both C and C++ but NOT only C++
				if (!(tool.getNatureFilter() == ITool.FILTER_C) && !(tool.getNatureFilter() == ITool.FILTER_BOTH))
					continue;
			}

			currTool = (Tool) tool;
			if (currTool.supportsType("org.eclipse.cdt.build.core.buildArtefactType")) { //$NON-NLS-1$
				String[] supportedTypesArray = currTool.getSupportedTypeIds();
				for (String currTypeStr : supportedTypesArray) {
					String[] supportedValuesForCurrType = currTool.getSupportedValueIds(currTypeStr);
					for (String currValueStr : supportedValuesForCurrType) {
						// we don't compare to the whole chain since GNU ARM CROSS (old version) uses a different prefix: not sure if the algo is ok
						if (currValueStr.endsWith(".buildArtefactType.exe") //$NON-NLS-1$
								|| currValueStr.endsWith(".buildArtefactType.application")) // sometimes encountered with GNU ARM Eclipse 0.5 old-school toolchains  //$NON-NLS-1$
							return tool;
					}
				}

			}
		}
		return null;
	}

	/**
	 * Finds an assembler. Since I didn't find a clean way I just test if one of the segments
	 * in the tool id contains "assembler", which is pretty hackish... sorry :(
	 * This returns the first tool found.
	 */
	private ITool getAssembler(IToolChain toolchain) {

		ITool[] tools = toolchain.getTools();
		for (ITool tool : tools) {
			// split package-like string with dots
			String[] idTokens = tool.getId().split("\\."); //$NON-NLS-1$
			for (String currToken : idTokens)
				if (currToken.equals("assembler")) //$NON-NLS-1$
					return tool;
		}
		return null;
	}

	/**
	 * Set a new value to variable <code>varName</code>.
	 * 
	 * @param varName  the name of variable
	 * @param newValue the new value
	 * @throws CoreException
	 */
	public void setVarAndSave(String varName, String newValue) throws CoreException {
		PropertiesConfiguration props = loadProperties();
		if (props == null)
			// TODO: add a log ? since user tried to modify project properties
			// however project wasn't of CDT nature or properties file didn't exist...
			return;

		props.setProperty(varName, newValue);
		saveProperties(props);
	}
}
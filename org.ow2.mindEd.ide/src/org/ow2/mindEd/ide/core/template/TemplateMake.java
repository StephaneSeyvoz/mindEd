package org.ow2.mindEd.ide.core.template;

public class TemplateMake
{
  protected static String nl;
  public static synchronized TemplateMake create(String lineSeparator)
  {
    nl = lineSeparator;
    TemplateMake result = new TemplateMake();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "# If the MIND_ROOT variable is defined, look for 'mindc' and 'mindunit' in this directory" + NL + "# otherwise, expect that 'mindc' and 'mindunit' are in the PATH." + NL + "ifdef MIND_ROOT" + NL + "  # If MIND_ROOT contains '\\', replace them by '/' (for Windows)" + NL + "  MINDC = $(subst \\,/, $(MIND_ROOT)/bin/mindc)" + NL + "  MINDUNIT = $(subst \\,/, $(MIND_ROOT)/bin/mindunit)" + NL + "else " + NL + "  MINDC = mindc" + NL + "  MINDUNIT = mindunit" + NL + "endif" + NL + "" + NL + "# Documentation generator command" + NL + "MINDOC = mindoc" + NL + "" + NL + "# Non-MindEd users should invoke this Makefile using \"make CONFIGURATION=<configName> all\" to run the build," + NL + "# where <configName> matches the desired <configName>.properties file." + NL + "# Set CONFIGURATION to Default if not set" + NL + "" + NL + "CONFIGURATION ?= Default" + NL + "include $(CONFIGURATION).properties" + NL + "" + NL + "# Strings and comments management - Skip to \"all:\" for the real build." + NL + "" + NL + "#Platform Separator handling" + NL + "PATH_SEPARATOR =:" + NL + "ifneq (,$(findstring Windows, $(OS))) # Handle Windows-specific separators (':' otherwise)" + NL + "    PATH_SEPARATOR =;" + NL + "endif" + NL + "" + NL + "sourcePathArg=" + NL + "ifdef sourcePath" + NL + "\tifneq ($(sourcePath), \"\")" + NL + "\t\tsourcePathArg=--src-path=\"$(subst :,$(PATH_SEPARATOR),$(subst ::,:,$(sourcePath)))\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "testSourcePathArg=" + NL + "ifdef testSourcePath" + NL + "\tifneq ($(sourcePath), \"\")" + NL + "\t\ttestSourcePathArg=\"$(subst :,$(PATH_SEPARATOR),$(subst ::,:,$(testSourcePath)))\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "includePathArg=" + NL + "ifdef includePath" + NL + "\tifneq ($(includePath), \"\")" + NL + "\t\tincludePathArg=--inc-path=\"$(subst :,$(PATH_SEPARATOR),$(subst ::,:,$(includePath)))\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "compilerCommandArg=" + NL + "ifdef compilerCommand" + NL + "\tifneq ($(compilerCommand), \"\")" + NL + "\t\tcompilerCommandArg=--compiler-command=\"$(compilerCommand)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "linkerCommandArg=" + NL + "ifdef linkerCommand" + NL + "\tifneq ($(linkerCommand), \"\")" + NL + "\t\tlinkerCommandArg=--linker-command=\"$(linkerCommand)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "assemblerCommandArg=" + NL + "ifdef assemblerCommand" + NL + "\tifneq ($(assemblerCommand), \"\")" + NL + "\t\tassemblerCommandArg=--assembler-command=\"$(assemblerCommand)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "asFlagsArg=" + NL + "ifdef asFlags" + NL + "\tifneq ($(asFlags), \"\")" + NL + "\t\tasFlagsArg=--as-flags=\"$(asFlags)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "cppFlagsArg=" + NL + "ifdef cppFlags" + NL + "\tifneq ($(cppFlags), \"\")" + NL + "\t\tcppFlagsArg=--cpp-flags=\"$(cppFlags)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "cFlagsArg=" + NL + "ifdef cFlags" + NL + "\tifneq ($(cFlags), \"\")" + NL + "\t\tcFlagsArg=--c-flags=\"$(cFlags)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "ldFlagsArg=" + NL + "ifdef ldFlags" + NL + "\tifneq ($(ldFlags), \"\")" + NL + "\t\tldFlagsArg=--ld-flags=\"$(ldFlags)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "extraOptionsArg=" + NL + "ifdef extraOptions" + NL + "\tifneq ($(extraOptions), \"\")" + NL + "\t\textraOptionsArg=$(extraOptions)" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "testExtraOptionsArg=" + NL + "ifdef testExtraOptions" + NL + "\tifneq ($(testExtraOptions), \"\")" + NL + "\t\ttestExtraOptionsArg=$(testExtraOptions)" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "#default value" + NL + "confOutputDirVar=target/$(CONFIGURATION)" + NL + "ifdef outputDirectory" + NL + "\tifneq ($(outputDirectory), \"\")" + NL + "\t\tconfOutputDirVar=\"$(subst :,$(PATH_SEPARATOR),$(subst ::,:,$(outputDirectory)))/$(CONFIGURATION)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "# folder utilities" + NL + "empty=" + NL + "space= $(empty) $(empty)" + NL + "# if MIND_ROOT is not defined, 'runtime' folder components such as the Bootstrap or the Main interface" + NL + "# will not be documented and this can lead to broken links. Within MindEd, MIND_ROOT should always be" + NL + "# automatically defined. However, for common builds from the terminal, you should define it or at least" + NL + "# do a dry run of \"mindc\" once for MIND_ROOT to be defined for the terminal session. " + NL + "RUNTIME_PATH=$(subst \\,/,$(MIND_ROOT))/runtime" + NL + "" + NL + "binOutputDir=$(confOutputDirVar)/binaries" + NL + "docOutputDir=$(confOutputDirVar)/doc" + NL + "graphOutputDir=$(confOutputDirVar)/graph" + NL + "testBinOutputDir=$(confOutputDirVar)/test-binaries" + NL + "testDocOutputDir=$(confOutputDirVar)/test-doc" + NL + "" + NL + "# The real build command." + NL + "" + NL + "all: build" + NL + "ifdef targetComponent" + NL + "\tif test ! -x $(MINDC); \\" + NL + "        then echo ' Not found mindc ! Set MIND_ROOT variable or go to 'Mindc location' eclipse preference page'; \\" + NL + "    \telse $(MINDC) $(sourcePathArg) $(includePathArg) $(compilerCommandArg) $(linkerCommandArg) $(assemblerCommandArg) $(asFlagsArg) $(cppFlagsArg) $(cFlagsArg) $(ldFlagsArg) $(extraOptionsArg) -o=$(binOutputDir) $(targetComponent):$(binaryName) ;\\" + NL + "    fi" + NL + "else" + NL + "\techo \"No application defined - MindEd users: Please configure your project target with the 'Mind Path' -> (right click) 'New application' menu.\"" + NL + "endif" + NL + "" + NL + "graph: build_graph" + NL + "ifdef targetComponent" + NL + "\tif test ! -x $(MINDC); \\" + NL + "        then echo ' Not found mindc ! Set MIND_ROOT variable or go to 'Mindc location' eclipse preference page'; \\" + NL + "    \telse $(MINDC) --check-adl $(sourcePathArg) $(includePathArg) -o=$(graphOutputDir) 'dot.DumpComponentDot<'$(targetComponent)'>' ;\\" + NL + "    fi" + NL + "else" + NL + "\techo \"No application defined - MindEd users: Please configure your project target with the 'Mind Path' -> (right click) 'New application' menu.\"" + NL + "endif" + NL + "" + NL + "doc: build_doc" + NL + "\t$(MINDOC) $(sourcePathArg) -S=$(RUNTIME_PATH) -o=$(docOutputDir)" + NL + "" + NL + "# here we reuse the same flags as the common build ones" + NL + "test: build_test" + NL + "\t$(MINDUNIT) $(sourcePathArg) $(includePathArg) $(compilerCommandArg) $(linkerCommandArg) $(assemblerCommandArg) $(asFlagsArg) $(cppFlagsArg) $(cFlagsArg) $(ldFlagsArg) $(extraOptionsArg) $(testExtraOptionsArg) -o=$(testBinOutputDir) $(testSourcePathArg)" + NL + "" + NL + "# Output folder handling." + NL + "" + NL + "build:" + NL + "\tmkdir -p $(binOutputDir)" + NL + "\t" + NL + "build_doc:" + NL + "\tmkdir -p $(docOutputDir)" + NL + "\t" + NL + "build_test:" + NL + "\tmkdir -p $(testBinOutputDir)" + NL + "\t" + NL + "build_graph:" + NL + "\tmkdir -p $(graphOutputDir)" + NL + "" + NL + "clean:" + NL + "\trm -Rf $(binOutputDir); \\" + NL + "\tmkdir -p $(binOutputDir)" + NL + "\t" + NL + "clean_doc:" + NL + "\trm -Rf $(docOutputDir); \\" + NL + "\tmkdir -p $(docOutputDir)" + NL + "\t" + NL + "clean_test:" + NL + "\trm -Rf $(testBinOutputDir); \\" + NL + "\tmkdir -p $(testBinOutputDir)" + NL + "\t" + NL + "clean_graph:" + NL + "\trm -Rf $(graphOutputDir); \\" + NL + "\tmkdir -p $(graphOutputDir)" + NL + "" + NL + ".PHONY: all clean build";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}

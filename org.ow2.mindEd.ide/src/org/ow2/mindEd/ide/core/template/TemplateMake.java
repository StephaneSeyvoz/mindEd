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
  protected final String TEXT_1 = "# If the MIND_ROOT variable is defined, look for Mind binaries in this directory" + NL + "# otherwise, expect that Mind binaries are in the PATH." + NL + "ifdef MIND_ROOT" + NL + "  # If MIND_ROOT contains '\\', replace them by '/' (for Windows)" + NL + "  MINDC = $(subst \\,/, $(MIND_ROOT)/bin/mindc)" + NL + "  MINDUNIT = $(subst \\,/, $(MIND_ROOT)/bin/mindunit)" + NL + "  MINDOC = $(subst \\,/, $(MIND_ROOT)/bin/mindoc)" + NL + "else " + NL + "  MINDC = mindc" + NL + "  MINDUNIT = mindunit" + NL + "  MINDOC = mindoc" + NL + "endif" + NL + "" + NL + "# Non-MindEd users should invoke this Makefile using \"make CONFIGURATION=<configName> all\" to run the build," + NL + "# where <configName> matches the desired <configName>.properties file." + NL + "" + NL + "# Set CONFIGURATION to Default if not set" + NL + "CONFIGURATION ?= Default" + NL + "include $(CONFIGURATION).properties" + NL + "" + NL + "confOutputDirVar=target/$(CONFIGURATION)" + NL + "" + NL + "binOutputDir=$(confOutputDirVar)/binaries" + NL + "depsOutputDir=$(confOutputDirVar)/dependencies" + NL + "docOutputDir=$(confOutputDirVar)/doc" + NL + "graphOutputDir=$(confOutputDirVar)/graph" + NL + "testBinOutputDir=$(confOutputDirVar)/test-binaries" + NL + "testDocOutputDir=$(confOutputDirVar)/test-doc" + NL + "" + NL + "# Strings and comments management - Skip to \"all:\" for the real build." + NL + "" + NL + "#Platform Separator handling" + NL + "PATH_SEPARATOR =:" + NL + "ifneq (,$(findstring Windows, $(OS))) # Handle Windows-specific separators (':' otherwise)" + NL + "    PATH_SEPARATOR =;" + NL + "endif" + NL + "" + NL + "sourcePathArg=" + NL + "ifdef sourcePath" + NL + "\tifneq ($(sourcePath), \"\")" + NL + "\t\tsourcePathArg=--src-path=\"$(subst :,$(PATH_SEPARATOR),$(subst ::,:,$(sourcePath):$(depsOutputDir)))\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "testSourcePathArg=" + NL + "ifdef testSourcePath" + NL + "\tifneq ($(testSourcePath), \"\")" + NL + "\t\ttestSourcePathArg=\"$(subst :,$(PATH_SEPARATOR),$(subst ::,:,$(testSourcePath)))\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "includePathArg=" + NL + "ifdef includePath" + NL + "\tifneq ($(includePath), \"\")" + NL + "\t\tincludePathArg=--inc-path=\"$(subst :,$(PATH_SEPARATOR),$(subst ::,:,$(includePath)))\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "compilerCommandArg=" + NL + "ifdef compilerCommand" + NL + "\tifneq ($(compilerCommand), \"\")" + NL + "\t\tcompilerCommandArg=--compiler-command=\"$(compilerCommand)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "linkerCommandArg=" + NL + "ifdef linkerCommand" + NL + "\tifneq ($(linkerCommand), \"\")" + NL + "\t\tlinkerCommandArg=--linker-command=\"$(linkerCommand)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "assemblerCommandArg=" + NL + "ifdef assemblerCommand" + NL + "\tifneq ($(assemblerCommand), \"\")" + NL + "\t\tassemblerCommandArg=--assembler-command=\"$(assemblerCommand)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "asFlagsArg=" + NL + "ifdef asFlags" + NL + "\tifneq ($(asFlags), \"\")" + NL + "\t\tasFlagsArg=--as-flags=\"$(asFlags)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "cppFlagsArg=" + NL + "ifdef cppFlags" + NL + "\tifneq ($(cppFlags), \"\")" + NL + "\t\tcppFlagsArg=--cpp-flags=\"$(cppFlags)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "cFlagsArg=" + NL + "ifdef cFlags" + NL + "\tifneq ($(cFlags), \"\")" + NL + "\t\tcFlagsArg=--c-flags=\"$(cFlags)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "ldFlagsArg=" + NL + "ifdef ldFlags" + NL + "\tifneq ($(ldFlags), \"\")" + NL + "\t\tldFlagsArg=--ld-flags=\"$(ldFlags)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "extraOptionsArg=" + NL + "ifdef extraOptions" + NL + "\tifneq ($(extraOptions), \"\")" + NL + "\t\textraOptionsArg=$(extraOptions)" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "testExtraOptionsArg=" + NL + "ifdef testExtraOptions" + NL + "\tifneq ($(testExtraOptions), \"\")" + NL + "\t\ttestExtraOptionsArg=$(testExtraOptions)" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "" + NL + "# The real build command." + NL + "" + NL + "all: dependencies compile graph doc test  " + NL + "" + NL + "clean: clean_dependencies clean_compile clean_graph clean_doc clean_test" + NL + "" + NL + "dependencies: build_dependencies" + NL + "# Add 'cp' commands here to copy your project dependencies files to depsOutputDir" + NL + "" + NL + "compile: build " + NL + "ifdef targetComponent" + NL + "\t@if test ! -x $(MINDC); \\" + NL + "        then echo ' Mindc not found! Set MIND_ROOT variable or go to 'Mindc location' eclipse preference page'; \\" + NL + "    \telse $(MINDC) $(sourcePathArg) $(includePathArg) $(compilerCommandArg) $(linkerCommandArg) $(assemblerCommandArg) $(asFlagsArg) $(cppFlagsArg) $(cFlagsArg) $(ldFlagsArg) $(extraOptionsArg) -o=$(binOutputDir) $(targetComponent):$(binaryName) ;\\" + NL + "    fi" + NL + "else" + NL + "\t@echo \"Compile: No application defined - MindEd users: Please configure your project target with the 'Mind Path' -> (right click) 'New application' menu.\"" + NL + "endif" + NL + "" + NL + "graph: build_graph" + NL + "ifdef targetComponent" + NL + "\t@if test ! -x $(MINDC); \\" + NL + "        then echo ' Mindc not found! Set MIND_ROOT variable or go to 'Mindc location' eclipse preference page'; \\" + NL + "    \telse $(MINDC) --check-adl $(sourcePathArg) $(includePathArg) -o=$(graphOutputDir) 'dot.DumpComponentDot<'$(targetComponent)'>' ;\\" + NL + "    fi" + NL + "else" + NL + "\t@echo \"Graph: No application defined - MindEd users: Please configure your project target with the 'Mind Path' -> (right click) 'New application' menu.\"" + NL + "endif" + NL + "" + NL + "doc: build_doc" + NL + "\t@if test ! -x $(MINDOC); \\" + NL + "\t\tthen echo ' Mindoc not found! Set MIND_ROOT variable or go to 'Mindc location' eclipse preference page'; \\" + NL + "\t\telse $(MINDOC) $(sourcePathArg) -o=$(docOutputDir);\\" + NL + "\tfi" + NL + "" + NL + "# here we reuse the same flags as the common build ones" + NL + "test: build_test" + NL + "ifdef testSourcePath" + NL + "\t@if test ! -x $(MINDUNIT); \\" + NL + "\t\tthen echo ' Mindunit not found! Set MIND_ROOT variable or go to 'Mindc location' eclipse preference page'; \\" + NL + "\t\telse $(MINDUNIT) $(sourcePathArg) $(includePathArg) $(compilerCommandArg) $(linkerCommandArg) $(assemblerCommandArg) $(asFlagsArg) $(cppFlagsArg) $(cFlagsArg) $(ldFlagsArg) $(extraOptionsArg) $(testExtraOptionsArg) -o=$(testBinOutputDir) $(testSourcePathArg);\\" + NL + "\tfi" + NL + "else" + NL + "\t@echo \"No test folder defined: Please configure the 'testSourcePath' variable in your $(CONFIGURATION).properties file.\"" + NL + "endif" + NL + "" + NL + "# Output folder handling." + NL + "" + NL + "build:" + NL + "\t@mkdir -p $(binOutputDir)" + NL + "" + NL + "build_dependencies:" + NL + "\t@mkdir -p $(depsOutputDir)" + NL + "" + NL + "build_doc:" + NL + "\t@mkdir -p $(docOutputDir)" + NL + "" + NL + "build_test:" + NL + "\t@mkdir -p $(testBinOutputDir)" + NL + "" + NL + "build_graph:" + NL + "\t@mkdir -p $(graphOutputDir)" + NL + "" + NL + "clean_compile:" + NL + "\t@rm -Rf $(binOutputDir); \\" + NL + "\tmkdir -p $(binOutputDir)" + NL + "" + NL + "clean_dependencies:" + NL + "\t@rm -Rf $(depsOutputDir); \\" + NL + "\tmkdir -p $(depsOutputDir)" + NL + "" + NL + "clean_doc:" + NL + "\t@rm -Rf $(docOutputDir); \\" + NL + "\tmkdir -p $(docOutputDir)" + NL + "" + NL + "clean_test:" + NL + "\t@rm -Rf $(testBinOutputDir); \\" + NL + "\tmkdir -p $(testBinOutputDir)" + NL + "" + NL + "clean_graph:" + NL + "\t@rm -Rf $(graphOutputDir); \\" + NL + "\tmkdir -p $(graphOutputDir)" + NL + "" + NL + ".PHONY: all dependencies compile graph doc test clean clean_dependencies clean_compile clean_doc clean_test clean_graph build build_dependencies build_doc build_test build_graph";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}

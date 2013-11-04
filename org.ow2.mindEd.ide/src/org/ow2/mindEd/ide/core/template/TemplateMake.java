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
  protected final String TEXT_1 = "# Generated Makefile - Manual changes will not be reflected in the Eclipse project configuration." + NL + "" + NL + "# If the MIND_ROOT variable is defined, look for 'mindc' in this directory" + NL + "# otherwise, expect that 'mindc' is in the PATH." + NL + "ifdef MIND_ROOT" + NL + "  # If MIND_ROOT contains '\\', replace them by '/' (for Windows)" + NL + "  MINDC = $(subst \\,/, $(MIND_ROOT)/bin/mindc)" + NL + "else " + NL + "  MINDC = mindc" + NL + "endif" + NL + "" + NL + "# Non-MindEd users should invoke this Makefile using \"make CONFIGURATION=<configName> all\" to run the build," + NL + "# where <configName> matches the desired <configName>.properties file." + NL + "include $(CONFIGURATION).properties" + NL + "" + NL + "# Strings and comments management - Skip to \"all:\" for the real build." + NL + "" + NL + "#Platform Separator handling" + NL + "PATH_SEPARATOR =:" + NL + "ifneq (,$(findstring Windows, $(OS))) # Handle Windows-specific separators (':' otherwise)" + NL + "    PATH_SEPARATOR =;" + NL + "endif" + NL + "" + NL + "sourcePathArg=" + NL + "ifdef sourcePath" + NL + "\tifneq ($(sourcePath), \"\")" + NL + "\t\tsourcePathArg=--src-path=\"$(subst \\,/,$(subst ;,$(PATH_SEPARATOR),$(subst ;;,;,$(sourcePath))))\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "outputDirVar=build #default value" + NL + "ifdef outputDirectory" + NL + "\tifneq ($(outputDirectory), \"\")" + NL + "\t\toutputDirVar=\"$(subst \\,/,$(subst ;,$(PATH_SEPARATOR),$(subst ;;,;,$(outputDirectory))))\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "includePathArg=" + NL + "ifdef includePath" + NL + "\tifneq ($(includePath), \"\")" + NL + "\t\tincludePathArg=--inc-path=\"$(subst \\,/,$(subst ;,$(PATH_SEPARATOR),$(subst ;;,;,$(includePath))))\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "compilerCommandArg=" + NL + "ifdef compilerCommand" + NL + "\tifneq ($(compilerCommand), \"\")" + NL + "\t\tcompilerCommandArg=--compiler-command=\"$(compilerCommand)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "linkerCommandArg=" + NL + "ifdef linkerCommand" + NL + "\tifneq ($(linkerCommand), \"\")" + NL + "\t\tlinkerCommandArg=--linker-command=\"$(linkerCommand)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "assemblerCommandArg=" + NL + "ifdef assemblerCommand" + NL + "\tifneq ($(assemblerCommand), \"\")" + NL + "\t\tassemblerCommandArg=--assembler-command=\"$(assemblerCommand)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "asFlagArg=" + NL + "ifdef asFlag" + NL + "\tifneq ($(asFlag), \"\")" + NL + "\t\tasFlagArg=--as-flags=\"$(asFlag)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "cppFlagsArg=" + NL + "ifdef cppFlags" + NL + "\tifneq ($(cppFlags), \"\")" + NL + "\t\tcppFlagsArg=--cpp-flags=\"$(cppFlags)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "cFlagsArg=" + NL + "ifdef cFlags" + NL + "\tifneq ($(cFlags), \"\")" + NL + "\t\tcFlagsArg=--c-flags=\"$(cFlags)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "ldFlagsArg=" + NL + "ifdef ldFlags" + NL + "\tifneq ($(ldFlags), \"\")" + NL + "\t\tldFlagsArg=--ld-flags=\"$(ldFlags)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "extraOptionsArg=" + NL + "ifdef extraOptions" + NL + "\tifneq ($(extraOptions), \"\")" + NL + "\t\textraOptionsArg=\"$(extraOptions)\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "# The real build command." + NL + "" + NL + "all: build" + NL + "ifdef targetComponent" + NL + "\tif test ! -x $(MINDC); \\" + NL + "        then echo ' Not found mindc ! Set MIND_ROOT variable or go to 'Mindc location' eclipse preference page'; \\" + NL + "    \telse $(MINDC) $(sourcePathArg) $(includePathArg) $(compilerCommandArg) $(linkerCommandArg) $(assemblerCommandArg) $(asFlagArg) $(cppFlagsArg) $(cFlagsArg) $(ldFlagsArg) $(extraOptionsArg) -o=$(outputDirectory) $(targetComponent):$(binaryName) ;\\" + NL + "    fi" + NL + "else" + NL + "\techo \"No application defined - MindEd users: Please configure your project target with the 'Mind Path' -> (right click) 'New application' menu.\"" + NL + "endif" + NL + "" + NL + "# Output folder handling." + NL + "" + NL + "build:" + NL + "\tmkdir -p $(outputDirVar)" + NL + "" + NL + "clean:" + NL + "\trm -Rf $(outputDirVar); \\" + NL + "\tmkdir -p $(outputDirVar)" + NL + "" + NL + ".PHONY: all clean build";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}

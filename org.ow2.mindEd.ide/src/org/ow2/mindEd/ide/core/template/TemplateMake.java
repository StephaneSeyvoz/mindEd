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
  protected final String TEXT_1 = "# If the MIND_ROOT variable is defined, look for 'mindc' in this directory" + NL + "# otherwise, expect that 'mindc' is in the PATH." + NL + "ifdef MIND_ROOT" + NL + "  # If MIND_ROOT contains '\\', replace them by '/' (for Windows)" + NL + "  MINDC = $(subst \\,/, $(MIND_ROOT)/bin/mindc)" + NL + "else " + NL + "  MINDC = mindc" + NL + "endif" + NL + "" + NL + "include $(CONFIGURATION).properties" + NL + "" + NL + "#Platform Separator handling" + NL + "PATH_SEPARATOR =:" + NL + "ifneq (,$(findstring Windows, $(OS))) # Handle Windows-specific separators (':' otherwise)" + NL + "    PATH_SEPARATOR =;" + NL + "endif" + NL + "" + NL + "includePathArg=" + NL + "ifdef includePath" + NL + "\tifneq ($(includePath), \"\")" + NL + "\t\tincludePathArg=--inc-path=\"$(subst \\,/,$(subst ;,$(PATH_SEPARATOR),$(subst ;;,;,$(includePath))))\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "sourcePathArg=" + NL + "ifdef sourcePath" + NL + "\tifneq ($(sourcePath), \"\")" + NL + "\t\tsourcePathArg=--src-path=\"$(subst \\,/,$(subst ;,$(PATH_SEPARATOR),$(subst ;;,;,$(sourcePath))))\"" + NL + "\tendif" + NL + "endif" + NL + "" + NL + "all: build" + NL + "ifdef targetComponent" + NL + "\tif test ! -x $(MINDC); \\" + NL + "        then echo ' Not found mindc ! Set MIND_ROOT variable or go to 'Mindc location' eclipse preference page'; \\" + NL + "    \telse $(MINDC) $(sourcePathArg) $(includePathArg) -o=$(outputDirectory) $(targetComponent):$(binaryName) ;\\" + NL + "    fi" + NL + "else" + NL + "\techo \"No application defined - Please configure with the 'Mind Path' -> 'New application' menu.\"" + NL + "endif" + NL + "" + NL + "build:" + NL + "\tmkdir -p build" + NL + "" + NL + "clean:" + NL + "\trm -Rf build; \\" + NL + "\tmkdir -p build" + NL + "" + NL + ".PHONY: all clean build";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}

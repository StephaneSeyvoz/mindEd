package org.ow2.mindEd.ide.core.template;

import org.ow2.mindEd.ide.model.*;


public class TemplatePrimitiveADL
 {
  protected static String nl;
  public static synchronized TemplatePrimitiveADL create(String lineSeparator)
  {
    nl = lineSeparator;
    TemplatePrimitiveADL result = new TemplatePrimitiveADL();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "primitive ";
  protected final String TEXT_2 = " {" + NL + " \t";
  protected final String TEXT_3 = NL + "\t";
  protected final String TEXT_4 = NL + "\t// TODO Auto-generated component implementation" + NL + "\tsource ";
  protected final String TEXT_5 = ".";
  protected final String TEXT_6 = ";" + NL + "}";

   public String generate(MindAdl adl, String srcExtension, String... contains)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
 String qualifiedName = adl.getQualifiedName();
 String srcFile = adl.getName();


    stringBuffer.append(TEXT_1);
    stringBuffer.append(qualifiedName);
    stringBuffer.append(TEXT_2);
    for(String l : contains) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(l);
    }
    stringBuffer.append(TEXT_4);
    stringBuffer.append(srcFile);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(srcExtension);
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}

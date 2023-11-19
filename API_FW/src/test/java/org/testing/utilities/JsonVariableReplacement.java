package org.testing.utilities;

import java.util.regex.Pattern;

//input parameter--- complete Json data,variable name and variable value.
//purpose of this method--- To assign the value to the variable.
//Output parameter-- After replacement it will give the complete string .
public class JsonVariableReplacement 
{
  public static String JsonReplacement(String reqBody,String variableName,String variableValue) 
 {
	  reqBody= reqBody.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
	  return reqBody;
 }
	
}

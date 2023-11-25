package org.testing.responseValidation;

import org.testing.assertions.Assertion_1;
import org.testing.utilities.JsonParsingUsingJsonPath;

import io.restassured.response.Response;

public class validateResponse 
{
  public static Boolean validateStatusCode(int expectedStatusCode ,Response res) 
  {
	 Boolean result= Assertion_1.assertt(expectedStatusCode,res.getStatusCode() );
	 return result;
  }
  
  public static Boolean validateData(String expectedValue ,Response res,String jsonPath) 
  {
	
	  String actualValue =JsonParsingUsingJsonPath.parsing(jsonPath, res);
	  
	  Boolean result= Assertion_1.assertt2(expectedValue,actualValue );
	  return result;
  }
}

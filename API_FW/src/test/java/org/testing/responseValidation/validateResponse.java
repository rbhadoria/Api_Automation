package org.testing.responseValidation;

import org.testing.assertions.Assertion_1;

import io.restassured.response.Response;

public class validateResponse 
{
  public static Boolean validateStatusCode(int expectedStatusCode ,Response res) 
  {
	 Boolean result= Assertion_1.assertt(expectedStatusCode,res.getStatusCode() );
	 return result;
  }
}

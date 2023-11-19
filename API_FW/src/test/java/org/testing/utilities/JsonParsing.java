package org.testing.utilities;

import io.restassured.response.Response;

public class JsonParsing 
{
  public static String jsonParsingUsingJsonPath(Response res,String jsonPath)
  {
	  String extractedValue= res.jsonPath().get(jsonPath);
	  return extractedValue;
	  
  }
}

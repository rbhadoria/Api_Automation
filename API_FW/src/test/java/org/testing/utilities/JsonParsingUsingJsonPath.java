package org.testing.utilities;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath 
{
  public static String parsing(String jsonPath, Response res) 
  {
	 return res.jsonPath().get(jsonPath);
  }
}

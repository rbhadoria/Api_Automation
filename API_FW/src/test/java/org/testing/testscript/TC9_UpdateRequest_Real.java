package org.testing.testscript;

import java.io.IOException;
import java.util.Properties;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandlerJsonFile;

import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesLoad;

import io.restassured.response.Response;

public class TC9_UpdateRequest_Real 
{
  public void testCase9() throws IOException 
  {
	  {
			Properties pr=PropertiesLoad.handlerProperties("../API_FW/URI.properties");
		    String requestBody= HandlerJsonFile.readjsonfile("../API_FW/src/test/java/org/testing/resourses/PutRequestBody.json");
		    requestBody=JsonVariableReplacement.JsonReplacement(requestBody,"id",TC1_PostRequest.resIdValue); 
		    HTTPMethods http=new HTTPMethods(pr);
			Response resObj =http.PutMethod(requestBody, "RealApi_URI1", TC1_PostRequest.resIdValue);	
		 }
	  
  }
}

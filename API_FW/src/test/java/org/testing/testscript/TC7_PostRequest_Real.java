package org.testing.testscript;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandlerJsonFile;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesLoad;

import io.restassured.response.Response;

public class TC7_PostRequest_Real 
{
    static String resIdValue;
  public  void testCase7() throws IOException 
 {
	Properties pr=PropertiesLoad.handlerProperties("../API_FW/URI.properties");
    String requestBody= HandlerJsonFile.readjsonfile("../API_FW/src/test/java/org/testing/resourses/RequestBody.json");
	Random r=new Random();
	Integer idValue=r.nextInt();
    requestBody=JsonVariableReplacement.JsonReplacement(requestBody,"id",idValue.toString());
    System.out.println("Before hitting the request"+requestBody);
    HTTPMethods http=new HTTPMethods(pr);
	Response resObj =http.PostMethod(requestBody, "RealApi_URI1");
	resIdValue=JsonParsing.jsonParsingUsingJsonPath(resObj, "id");
	
 }
   
}

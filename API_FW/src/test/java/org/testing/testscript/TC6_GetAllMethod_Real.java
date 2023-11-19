package org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_GetAllMethod_Real 
{
	@Test
   public void testCase6() throws IOException
   {
	   Properties pr=PropertiesLoad.handlerProperties("../API_FW/URI.properties");
       HTTPMethods http=new HTTPMethods(pr);
       Response resObj=http.GetAllMethod("RealApi_URI");
      
   
   }
}

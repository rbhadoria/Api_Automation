package org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.validateResponse;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesLoad;
import org.testing.utilities.ReportHandling;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

public class TC2_GetAllMethod 
{
	@Test
   public void testCase2() throws IOException
   {
	   ExtentReports reports=ReportHandling.Report();
	   ExtentTest test = reports.startTest("TC2_GetAllMethod");	
	   
	   Properties pr=PropertiesLoad.handlerProperties("../API_FW/URI.properties");
       HTTPMethods http=new HTTPMethods(pr);
       Response resObj=http.GetAllMethod("QA_URI4");
       Boolean result=validateResponse.validateStatusCode(200, resObj);
    if(result)
   	{
         test.log(LogStatus.PASS, "Status Code is matching with the expected status code");
   	}
   	else
   	{
         test.log(LogStatus.FAIL, "Status Code is not matching with the expected status code");
   	}
       reports.endTest(test);
       reports.flush();  // for saving the data
       System.out.println("********************");
       JsonParsingUsingOrgJson.JsonParsing(resObj.asString(), "id",true);
       System.out.println("********************");
       JsonParsingUsingOrgJson.JsonParsing(resObj.asString(), "id",false);
   
   }
}

package org.testing.testscript;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.responseValidation.validateResponse;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandlerJsonFile;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesLoad;
import org.testing.utilities.ReportHandling;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

public class TC1_PostRequest 
{
    static String resIdValue;
    @Test
  public  void testCase1() throws IOException 
 {
    	
    ExtentReports reports=ReportHandling.Report();
    ExtentTest test = reports.startTest("TC1_PostRequest");	
    
	Properties pr=PropertiesLoad.handlerProperties("../API_FW/URI.properties");
    String requestBody= HandlerJsonFile.readjsonfile("../API_FW/src/test/java/org/testing/resourses/RequestBody.json");
	Random r=new Random();
	Integer idValue=r.nextInt();
    requestBody=JsonVariableReplacement.JsonReplacement(requestBody,"id",idValue.toString());
    System.out.println("Before hitting the request"+requestBody);
    HTTPMethods http=new HTTPMethods(pr);
	Response resObj =http.PostMethod(requestBody, "QA_URI4");
	Boolean result=validateResponse.validateStatusCode(201, resObj);
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
    
	resIdValue=JsonParsing.jsonParsingUsingJsonPath(resObj, "id");
 }
   
}

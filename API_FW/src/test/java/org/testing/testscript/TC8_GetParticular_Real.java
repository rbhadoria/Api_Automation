package org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;

public class TC8_GetParticular_Real 
{
   
	public void testCase8() throws IOException
	{
		 Properties pr=PropertiesLoad.handlerProperties("../API_FW/URI.properties");
	     HTTPMethods http=new HTTPMethods(pr);
	     http.GetParticular("RealApi_URI1", TC7_PostRequest_Real.resIdValue);
	}
}

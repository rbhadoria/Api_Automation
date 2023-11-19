package org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

public class TC5_DeleteRequest 
{
	@Test
  public void testCase5() throws IOException
  {
	  Properties pr=PropertiesLoad.handlerProperties("../API_FW/URI.properties");
	  HTTPMethods http=new HTTPMethods(pr);
	  http.DeleteMethod("QA_URI4", TC1_PostRequest.resIdValue);
	}
  }


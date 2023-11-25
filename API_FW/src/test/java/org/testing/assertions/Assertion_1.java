package org.testing.assertions;

public class Assertion_1 
{
    public static Boolean assertt(int expectedStatusCode ,int actualStatusCode) 
    {
	          if (expectedStatusCode==actualStatusCode)
			  {
		        return true; 
			  }		
			  else
			  {
				return false;
			  }				  
	  
     }
    
    public static Boolean assertt2(String expectedData ,String actualData) 
    {
	          if(expectedData.equals(actualData))
			  {
		        return true; 
			  }		
			  else
			  {
				return false;
			  }				  
	  
     }
    
    
  
 }

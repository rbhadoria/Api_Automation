package org.testing.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods 
{ 
	Properties probject;
	public HTTPMethods(Properties probject) 
	{
		this.probject=probject;
	}
  public Response PostMethod(String RequestBody,String uriKeyName )
  {
	  String uriValue=probject.getProperty(uriKeyName);
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .body(RequestBody)
	  .when()
	  .post(uriValue);
	  System.out.println("Status Code is : "+res.statusCode());
	return res;
  }
  
  public  Response GetAllMethod(String uriKeyName)
  {
	  String uriValue=probject.getProperty(uriKeyName);
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .get(uriValue);
	  System.out.println("Status Code is : "+res.statusCode());
	  System.out.println("Response Data is :");  
	  System.out.println(res.asString());
	return res;
  }
  
  public void GetParticular(String uriKeyName, String endPointValue)
  {
	  String uriValue=probject.getProperty(uriKeyName)+"/"+endPointValue;
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .get(uriValue);
	  System.out.println("Status Code is : "+res.statusCode());
	  System.out.println("Response Data is :");  
	  System.out.println(res.asString());
  }
  
  public Response PutMethod(String RequestBody,String uriKeyName,String endpointValue )
  {
	  String uriValue=probject.getProperty(uriKeyName)+"/"+endpointValue;
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .body(RequestBody)
	  .when()
	  .put(uriValue);
	  System.out.println("Status Code is : "+res.statusCode());
	return res;
  }
  
  public void DeleteMethod(String uriKeyName, String endPointValue)
  {
	  String uriValue=probject.getProperty(uriKeyName)+"/"+endPointValue;
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .delete(uriValue);
	  System.out.println("Status Code is : "+res.statusCode());
	  System.out.println("Response Data is :");  
	  System.out.println(res.asString());
  }
}



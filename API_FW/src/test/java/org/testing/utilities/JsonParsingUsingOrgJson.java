package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;


public class JsonParsingUsingOrgJson 
{
  public static void JsonParsing(String responseData,String KeyName,Boolean singleValueFeatch) 
  {
	 if(singleValueFeatch)
	   {
		JSONArray js=new JSONArray(responseData);
		JSONObject j=js.getJSONObject(16);
		System.out.println(j.get(KeyName));	
		}
	 else 
	 {
		 JSONArray js=new JSONArray(responseData);
			int L=js.length();
			for(int i=0;i<L;i=i+1)
			{
				JSONObject j=js.getJSONObject(i);
				System.out.println(j.get(KeyName));	
			}
	 }
  
  }
}

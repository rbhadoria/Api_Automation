package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

//Purpose of this method --To read any json file
//Input parameter -- json file path .
//Output parameter-- string

public class HandlerJsonFile 
{
   public static String readjsonfile (String jsonFilePath) throws FileNotFoundException
   {
	   File f=new File(jsonFilePath);
	   FileInputStream fi=new FileInputStream(f);
	   JSONTokener jr=new JSONTokener(fi);
	   JSONObject j=new JSONObject(jr);
	   return j.toString();	   
	  
   }
}

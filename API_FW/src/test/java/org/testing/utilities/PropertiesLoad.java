package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//Purpose of this method --To load any properties file.
//Input parameter -- file path .
//Output parameter-- it will give the object of Properties class
public class PropertiesLoad 
{
   public static Properties handlerProperties(String filename) throws IOException
   {
	   File fr=new File(filename); // connection establish.
	   FileInputStream fi=new FileInputStream(fr);
	   Properties pr=new Properties();
	   pr.load(fi);
	return pr;
   }
	
}

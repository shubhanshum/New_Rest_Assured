package com.sopra.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static String getPropFileData(String key) {
		FileInputStream file = null;
		String value="";
		if (file==null) {
			try {
				file=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//sopra//utility//configuration.properties");
				Properties prop=new Properties();
				prop.load(file);
				value=prop.getProperty(key);
			}
			
			catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		return value;
	}
}

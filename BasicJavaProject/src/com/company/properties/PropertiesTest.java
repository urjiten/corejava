package com.company.properties;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws Exception {

		FileReader reader=new FileReader("/Users/Shared/EclipseWorkspace/JavaWorkspace/FirstJavaProject/resources/db.propeties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
	}

}

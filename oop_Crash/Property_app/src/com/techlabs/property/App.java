package com.techlabs.property;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class App {
	public static void main(String args[])throws Exception
	{
		Properties con=new Properties();
		InputStream input=null;
		
		
			input = new FileInputStream("Attribute.properties");
            con.load(input); 
            System.out.println(con.getProperty("userName"));
    		System.out.println(con.getProperty("password")); 
		
	
	}

}

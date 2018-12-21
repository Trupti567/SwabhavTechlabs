package com.techlabs.csvwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriterExample {
	static String filename="write.csv";
	public static void main(String args[])
	{
		
		writeDataLineByLine(filename);
		  System.out.println("Success");
	}
	public static  void writeDataLineByLine(String filename)
	{
		  File file = new File(filename); 
		  try { 
		      
		        FileWriter output = new FileWriter(filename); 
		        
		        BufferedWriter writer = new BufferedWriter(output);
		        writer.write("Trupti");
		        writer.append(",");
		        writer.write("Mahale");
		        writer.append(",");
		      
		      
		     
		        writer.append("")
		        writer.close();
		      
		        
		       
		     
		}   catch (IOException e) { 
	       
	        e.printStackTrace(); 
	    } 
	}
}



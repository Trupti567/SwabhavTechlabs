package com.techlabs.readfileusingreader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String args[]) throws IOException
	{
		FileReader fileread=new FileReader("C:\\SwabhavRepository\\oop_Crash\\FileHandling\\secondfile.txt");
		int i;
		while((i=fileread.read())!=-1)
		{
			System.out.print((char)i);    
		

		}
		fileread.close();
		
	}


}

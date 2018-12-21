package com.techlabs.writetofile.fileoutputstream;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]){
		try{
		FileOutputStream fout = new FileOutputStream(
				"C:\\SwabhavRepository\\oop_Crash\\FileHandling\\firsttext.txt");
		fout.write(69);
		
		
		fout.write(70);
		fout.flush();
		fout.close();
		
		System.out.println("Success");
		}
		catch(Exception e){System.out.println(e);}   

	}

}

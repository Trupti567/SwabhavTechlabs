package com.techlabs.writetofile.fileoutputstream;

import java.io.FileOutputStream;

public class FileOutputStreamString {
	public static void main(String args[]) {
		try {
			FileOutputStream fileoutput = new FileOutputStream(
					"C:\\SwabhavRepository\\oop_Crash\\FileHandling\\firsttext2.txt");
			String name="Manjusha";
			byte b[]=name.getBytes();
			fileoutput.write(b);
			fileoutput.close();
			System.out.println("Success");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

package com.techlabs.writetofile.filewriter;

import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String args[]) {
		try {
			FileWriter filewrite = new FileWriter(
					"C:\\SwabhavRepository\\oop_Crash\\FileHandling\\secondfile.txt");
			String name = "Trupti";

			filewrite.write(name);
		    filewrite.append("\n");
            
			filewrite.append(" Rutu");

			filewrite.append("\nManjusha");
			filewrite.flush();
			
			filewrite.append(" pratibha");
			filewrite.close();

			System.out.println("Success");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

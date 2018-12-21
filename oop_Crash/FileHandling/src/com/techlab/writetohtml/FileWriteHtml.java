package com.techlab.writetohtml;

import java.io.FileWriter;

public class FileWriteHtml {
	public static void main(String args[]) {
		try {
			FileWriter fout = new FileWriter(
					"data//third.html");
			fout.write("<html><head><title>This is First Html Page</title></head><body><h1>SWABHAV TECHLABS</h1><br><h2>Courses Available Are:</h2></br><br><ol><li>Core Java</li><li>Python</li><li>Advance Java</li></ol></br> </body></html>");
			fout.close();
			System.out.println("Sucess");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

package com.techlabs.readfromfileinputstram;

import java.io.FileInputStream;

public class FileReadExample {
	public static void main(String args[]) {
		try {
			FileInputStream finput = new FileInputStream(
					"data\\firsttext2.txt");
		int i=0;
		while((i=finput.read())!=-1)
		{
			System.out.print((char)i);
		}
		finput.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

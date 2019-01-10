package com.techlabs.namesort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class ReadNamesTest {
	public static void main(String args[]) throws IOException {
		String filename = "trupti\\names.txt";
		try {
			Set<String> namesset = new TreeSet<String>();
			File file = new File(filename);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(file)));
			String nameinfile;
			while ((nameinfile = br.readLine()) != null) {
				namesset.add(nameinfile);
			}
			for (String temp : namesset) {
				System.out.println(temp);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

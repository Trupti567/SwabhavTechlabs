package com.techlab.state;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateAndCapital {
	private final static String filename = "data\\StateAndCapitals.txt";

	Map<String, String> hashmap = new HashMap<String, String>();

	private Map<String, String> readFromFile(String filename)
			throws IOException {

		File file = new File(this.filename);
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file)));

		while ((name = br.readLine()) != null) {

			String[] parts = name.split(":", 2);
			if (parts.length >= 2) {
				String state = parts[0];
				String capital = parts[1];
				hashmap.put(state, capital);
			}
		}

		return hashmap;

	}

	public Map<String, String> retrive() throws IOException {
		Map<String, String> newmap = readFromFile(this.filename);
		return newmap;
	}

	public void display() throws IOException {
		Map<String, String> map = retrive();
		for (Map.Entry m : map.entrySet()) {
			System.out.println(" States : " + m.getKey() + " Capitals : "
					+ m.getValue());
		}
	}

	public Map<String, String> search(String ch) throws IOException {
		Map<String, String> newcontains = new HashMap<String, String>();
		Map<String, String> map = retrive();

		for (Map.Entry<String, String> temp : map.entrySet()) {
			if (temp.getKey().contains(ch) && temp.getValue().contains(ch)) {
				newcontains.put(temp.getKey(), temp.getValue());
			}
		}
		return newcontains;

	}
}

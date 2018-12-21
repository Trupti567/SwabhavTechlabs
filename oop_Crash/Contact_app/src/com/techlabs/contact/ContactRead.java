package com.techlabs.contact;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContactRead {
	public static void main(String args[]) throws Exception {
		FileReader fileread = new FileReader(
				"C:\\SwabhavRepository\\oop_Crash\\Contact_app\\contact.txt");
		BufferedReader br = new BufferedReader(fileread);
		String line = "";
		String splitBy = ",";
		int count = 0;
		int sum = 0;
		int maximum = 0;
		int salary1 = 0;
		ContactConstructor c = new ContactConstructor();

		while ((line = br.readLine()) != null) {
			String[] contact = line.split(splitBy);
			System.out
					.println(contact[0] + " " + contact[1] + " " + contact[3]);
			if (count > 0) {

				sum = sum + Integer.parseInt(contact[3]);
				if (maximum < Integer.parseInt(contact[3])) {

					maximum = Integer.parseInt(contact[3]);
					c.setName(contact[0]);
					c.setLname(contact[1]);
					c.setphoneNo(contact[2]);

				}

			}
			count++;
		}
		count = count++ - 1;
		System.out.println("Count=" + count);
		System.out.println("sum is" + sum);
		System.out.println("Max is" + maximum);
		System.out.println("Maximum Salaried Employee is" + c.getName() + " "
				+ c.getLname() + " " + c.getPhoneNumber());

	}

}

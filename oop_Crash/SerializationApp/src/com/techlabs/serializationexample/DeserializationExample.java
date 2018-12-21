package com.techlabs.serializationexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
	public static void main(String args[]) throws ClassNotFoundException,
			IOException {
		FileInputStream in = new FileInputStream("first.ser");
		ObjectInputStream os = new ObjectInputStream(in);
		Account account1 = (Account) os.readObject();
		System.out.println("AccountId = " + account1.getAccountId() + " Name :"
				+ account1.getName() + " Balance :" + account1.getBalance());
		os.close();
	}

}

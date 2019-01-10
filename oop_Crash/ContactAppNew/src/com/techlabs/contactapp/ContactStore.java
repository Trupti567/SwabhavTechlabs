package com.techlabs.contactapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class ContactStore  {
	private static final String fileName = "data\\Contactdata.Ser";

	private List<Contact> contacts;

	public ContactStore() throws Exception {
		contacts=retrive();
	}

	public void addContact(String fname, String lname, String phoneNo)
			throws IOException {

		Contact contact = new Contact(fname, lname, phoneNo);
		contacts.add(contact);
		save();

	}

	

	private void save() throws IOException {
		FileOutputStream fout = new FileOutputStream(this.fileName);
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(contacts);

		objout.close();
		
		System.out.println("Sucess");
	}

	private List<Contact> readFromFile(String filename) throws Exception {
		List<Contact> contactnot = null;
		File f = new File(filename);
		if (f.exists()) {
			FileInputStream fin = new FileInputStream(filename);

			ObjectInputStream in = new ObjectInputStream(fin);
			ArrayList<Contact> contactsretrive = (ArrayList<Contact>) in
					.readObject();
			fin.close();

			in.close();
			return contactsretrive;
		} else {
			System.out.println("File not found");
		}

		return contactnot;
	}

	public Contact search(String phoneNo)  {
		Contact contactfound = null;
		for (Contact c : contacts) {
			if (c.getPhone().equals(phoneNo)) {
				return c;
			}
		}
		return contactfound;
	}

	public boolean delete(String phoneNo) throws Exception {
		Contact contacttoDelete = search(phoneNo);
		if (contacttoDelete == null) {
			return false;
		} else {
			contacts.remove(contacttoDelete);
			save();
		}
		return true;

	}

	

	
	public List<Contact> retrive() throws Exception {
		List<Contact> contactnew = readFromFile(this.fileName);
		
		return contactnew;
	}

}

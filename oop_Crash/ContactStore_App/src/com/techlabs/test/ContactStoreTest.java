package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.contactapp.Contact;
import com.techlabs.contactapp.ContactStore;

public class ContactStoreTest {
	public static void main(String args[]) {

		addtoContact();

		displayAll();

		deleteContact();

	}

	public static void addtoContact() {
		ContactStore constrore = new ContactStore();
		constrore.addContact("Trupti", "Mahale", "8653272734");
		constrore.addContact("Nikita", "jadhav", "8652602922");
		constrore.addContact("Aditya", "Gharat", "9894632662");
		int no = constrore.getContacts().size();
		System.out.println(no);

	}

	public static void displayAll() {
		ContactStore constore1 = new ContactStore();
		System.out.println(constore1.getContacts().size());
		for (Contact temp : constore1.getContacts()) {
			System.out.println("name = " + temp.getFname() + " last"
					+ temp.getLname() + "phone" + temp.getPhone());
		}

	}

	public static void deleteContact() {
		

		ContactStore constore = new ContactStore();
		constore.addContact("Trupti", "mahale", "876553888999");
		
		int no1 = constore.getContacts().size();
		System.out.println(no1);

		if (constore.delete("Trupti", constore.getContacts()) == true) {
			System.out.println("Contact deleted");
		} else {
			System.out.println("Contact not found");
		}
	}

}

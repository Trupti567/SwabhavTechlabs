package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.contactapp.Contact;
import com.techlabs.contactapp.ContactStore;

public class ContactStoreTest {
	static final int AddContact= 1;
	static final int DeleteContact = 2;
	static final int DisplayContact = 3;
	
	public static void main(String args[]) {
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		ContactStore contactstore = new ContactStore();
		
		do {
			System.out.println(" Menu : ");
			System.out.println(" 1. Add Contacts : ");
			System.out.println(" 2. Delete Contacts : ");
			System.out.println(" 3. Display Contact :");

			System.out.println(" Enter Your Choice : ");
			ch = sc.nextInt();
			String fname, lname, phoneNo;
			

			switch (ch) {

			case AddContact:
				System.out.println("Enter the firstname");
				fname = sc.next();
				System.out.println("Enter lastName");
				lname = sc.next();
				System.out.println("Enter the PhoneNo");
				phoneNo = sc.next();
				Contact contact = new Contact(fname, lname, phoneNo);
				contactstore.addContact(fname, lname, phoneNo);
				int no = contactstore.getContacts().size();
				System.out.println(no);
				break;

			case DeleteContact:

				System.out.println("Enter the contact to Delete");
				String phoneNo1 = sc.next();
				if (contactstore.delete(phoneNo1) == true) {
					System.out.println("Contact is Deleted");
				} else {
					System.out.println("Contact not fount");
				}
				int no1 = contactstore.getContacts().size();
				System.out.println(no1);
				break;
			case  DisplayContact:
				System.out.println("Display Contacts");
				System.out.println(contactstore.getContacts().size());
				for (Contact temp : contactstore.getContacts()) {
					System.out.println("First Name = " + temp.getFname()
							+ " LastName = " + temp.getLname() + "   phone  = "
							+ temp.getPhone());
				}
				break;

			}
		} while (ch != 4);

	}

}

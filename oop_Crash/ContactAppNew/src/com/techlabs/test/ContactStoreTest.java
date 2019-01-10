package com.techlabs.test;

import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.contactapp.Contact;
import com.techlabs.contactapp.ContactStore;

public class ContactStoreTest {
	static final int addtoContact=1;
	static final int deleteContact=2;
	static final int displayContact=3;
	public static void main(String args[]) throws Exception {
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		ContactStore contactList1 = new ContactStore();
		contactList1.retrive();
		for(Contact contact1:contactList1.retrive()){
			System.out.println(" fname " +contact1.getFname()+" Last "+contact1.getLname()+" phone "+contact1.getPhone());

		}

		do {
			System.out.println(" Menu : ");
			System.out.println(" 1. Add Contacts : ");
			System.out.println(" 2. Delete Contacts : ");
			System.out.println(" 3. Display Contact :");

			System.out.println(" Enter Your Choice : ");
			ch = sc.nextInt();

			switch (ch) {

			case addtoContact:
				System.out.println("Enter the firstname ");
				String fname = sc.next();
				System.out.println("Enter the lastname ");
				String lname = sc.next();
				System.out.println("Enter the PhoneNo");
				String phoneNo = sc.next();
				Contact contact = new Contact(fname, lname, phoneNo);
				contactList1.addContact(fname, lname, phoneNo);
				int no = contactList1.retrive().size();
				System.out.println(no);

				break;

			case deleteContact:

				System.out.println("Enter the contact to Delete");
				String phoneNo1 = sc.next();
				if (contactList1.delete(phoneNo1) == true) {
					System.out.println("Contact is Deleted");
				} else {
					System.out.println("Contact not fount");
				}
				int no1 = contactList1.retrive().size();
				System.out.println(no1);
				break;
			case displayContact:
				System.out.println("Display Contacts");
				System.out.println(contactList1.retrive().size());
				for (Contact temp : contactList1.retrive()) {
					System.out.println("name = " + temp.getFname() + " last = "
							+ temp.getLname() + "   phone  = "
							+ temp.getPhone());
				}
				break;
		
			

			}
		} while (ch != 4);

	}

}

package com.techlabs.contactapp;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ContactStore {
	private List<Contact> contacts;

	public ContactStore() {
		contacts = new ArrayList<Contact>();
	}

	public void addContact(String fname, String lname, String phoneNo) {
		Contact contact = new Contact(fname, lname, phoneNo);
		contacts.add(contact);
		
	}

	public List<Contact> getContacts() {
		return contacts;

	}
	
	
	
	public Contact search(String phoneNo1 )
	{
		Contact contactfound=null;
		for(Contact c: contacts)
		{
			if(c.getPhone().equals(phoneNo1))
			{
				contactfound=c;
				break;
			}
		}
		return contactfound;
	}
	public boolean delete(String phoneNo1)
	{
		Contact contacttoDelete=search(phoneNo1);
		if(contacttoDelete==null)
		{
			return false;
		}
		else{
			contacts.remove(contacttoDelete);
		}
		return true;
	}

}

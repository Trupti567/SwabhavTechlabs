package com.techlabs.contactapp;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ContactStore {
	private List contacts;

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
	
	public Contact search(String fname,List<Contact> contacts )
	{
		Contact con=null;
		for(Contact c: contacts)
		{
			if(c.getFname()==fname)
			{
				return c;
			}
		}
		return con;
	}
	public boolean delete(String fname,List<Contact> contacts)
	{
		Contact contacttoDelete=search(fname, contacts);
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

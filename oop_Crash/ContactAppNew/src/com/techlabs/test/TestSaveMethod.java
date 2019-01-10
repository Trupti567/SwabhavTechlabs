package com.techlabs.test;

import java.io.IOException;
import java.util.List;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import com.techlabs.contactapp.Contact;
import com.techlabs.contactapp.ContactStore;

public class TestSaveMethod {
	public static void main(String args[]) throws Exception {
		ContactStore contact = new ContactStore();

		//contact.addContact("Trupti", "Mahale", "867548888");
		//contact.addContact("Manisha", "khilaari", "8796004000");
		//Contact con=contact.retrive().get(0);
		for(Contact contact1:contact.retrive()){
		System.out.println(" fname " +contact1.getFname()+" Last "+contact1.getLname()+" phone "+contact1.getPhone());

	}

}
}

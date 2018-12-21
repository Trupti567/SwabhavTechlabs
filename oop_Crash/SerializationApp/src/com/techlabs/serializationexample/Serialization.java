package com.techlabs.serializationexample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
public static void main(String args[]) throws IOException
{
	Account account=new Account(101, "Trupti", 1000);
	account.deposite(2000);
	 FileOutputStream fout=new FileOutputStream("first.ser");  
	  ObjectOutputStream out=new ObjectOutputStream(fout);  
	  out.writeObject(account);
	  
	  out.close();
	  System.out.println("Success");
}
}

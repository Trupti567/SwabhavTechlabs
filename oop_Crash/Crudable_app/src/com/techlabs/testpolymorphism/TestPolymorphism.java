package com.techlabs.testpolymorphism;

import com.techlabs.crudable.CustomerDb;
import com.techlabs.crudable.Icrudable;
import com.techlabs.crudable.OrderDataBase;
import com.techlabs.crudable.ProductDb;

public class TestPolymorphism {
	public static void doDatabaseOperations(Icrudable x)
	{
		System.out.println("Performing Database Operations");
		x.create();
		x.read();
		x.update();
		x.delete();
	}
	public static void main(String args[])
	{
		doDatabaseOperations(new CustomerDb());
		System.out.println("********************");
		doDatabaseOperations(new OrderDataBase());
		System.out.println("********************");
		doDatabaseOperations(new ProductDb());
		
		
		
	} 

}

package com.techlabs.crudable;

public class CustomerDb implements Icrudable {

	@Override
	public void create() {
		System.out.println("Customer  is added");
		
	}

	@Override
	public void read() {
	
		System.out.println("Customer is selected");
	}

	@Override
	public void update() {
		System.out.println("Customer Account is Updated");
		
	}

	@Override
	public void delete() {
		System.out.println("Customer Account is Deleted");
		
	}
	

}

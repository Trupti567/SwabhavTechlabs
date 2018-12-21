package com.techlabs.crudable;

public class ProductDb implements Icrudable {

	@Override
	public void create() {
		System.out.println("Product database is added");
		
	}

	@Override
	public void read() {
		System.out.println("Product database is got");
		
	}

	@Override
	public void update() {
		System.out.println("Product database is Edited");
		
	}

	@Override
	public void delete() {
		System.out.println("Product database is deleted");
		
	}

}

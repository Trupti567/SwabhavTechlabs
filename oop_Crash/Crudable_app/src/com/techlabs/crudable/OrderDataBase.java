package com.techlabs.crudable;

public class OrderDataBase implements Icrudable{

	@Override
	public void create() {
		System.out.println("Order database is created");
		
	}

	@Override
	public void read() {
		System.out.println("Order database is read");
	}

	@Override
	public void update() {
		System.out.println("Oredr database is created");
		
	}

	@Override
	public void delete() {
		System.out.println("order database is created");
	}

}

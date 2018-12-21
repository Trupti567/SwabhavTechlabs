package com.techlabs.finalmethodexample;

public class Bike extends Vehical {
	public void run() {
		System.out.println("running safely with 100kmph");
		super.run();
	}

	public static void main(String args[]) {
		Bike bike = new Bike();
		bike.run();

	}

}

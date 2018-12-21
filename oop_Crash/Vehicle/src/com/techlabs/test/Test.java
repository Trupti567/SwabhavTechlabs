package com.techlabs.test;

import com.techlabs.vehicle.Bike;
import com.techlabs.vehicle.Car;
import com.techlabs.vehicle.IMoveable;
import com.techlabs.vehicle.Truck;

public class Test {
	public static void startRace(IMoveable m) {
		System.out.println("Starting");
		m.move();
		System.out.println("Stopping");
	}

	public static void main(String args[]) {
		IMoveable move[] = new IMoveable[4];
		move[0] = new Car();
		move[1] = new Bike();
		move[2] = new Car();
		move[3] = new Truck();
		startRace(move);

	}

	public static void startRace(IMoveable[] move) {
		System.out.println("StartRecing");

		for (IMoveable temp : move) {
			temp.move();
		}
		System.out.println("Stop Racing");

	}

}

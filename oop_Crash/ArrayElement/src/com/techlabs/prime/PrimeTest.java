package com.techlabs.prime;

public class PrimeTest {
	public static void main(String args[]) {
		int no[] = new int[] { 3, 6, 7, 8, 9, 10, 17, 15, 19, 29, 12, 39, 16 };
		
		PrimeArray numbers = new PrimeArray();
		int number2[] = numbers.identifyPrime(no);
		for (int number3 : number2) {

			System.out.println(number3);

		}

	}
}
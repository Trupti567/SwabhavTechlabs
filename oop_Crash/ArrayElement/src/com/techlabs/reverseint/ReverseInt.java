package com.techlabs.reverseint;

public class ReverseInt {
	public static void main(String args[]) {
		int notoreverse=-189;
		int reversenumber=reverse(notoreverse);
		System.out.println("reverse of given number is" +reversenumber);
		

	}

	public static int reverse(int no) {
		int rev = 0, a;
		int temp = no;
		while (no != 0) {
			a = no % 10;
			rev = a + (rev * 10);
			no = no / 10;

		}
		return rev;

	}
}

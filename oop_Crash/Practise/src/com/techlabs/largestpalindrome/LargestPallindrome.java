package com.techlabs.largestpalindrome;

public class LargestPallindrome {

	public static void main(String args[]) {
		int product = 0;
		int max = 0;

		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				product = i * j;
				// System.out.println(product);
				if (pallindrom(product) == true) {
					if (max < product) {
						max = product;

					}

					System.out.println(product);

				}

			}
		}
		System.out.println("Maximum is" + max);
	}

	public static boolean pallindrom(int product) {
		int rev = 0, a;
		int temp = product;
		while (product != 0) {
			a = product % 10;
			rev = a + (rev * 10);
			product = product / 10;

		}
		if (rev == temp) {
			return true;
		}
		return false;

	}

}
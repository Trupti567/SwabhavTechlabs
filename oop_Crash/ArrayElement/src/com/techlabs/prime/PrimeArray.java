package com.techlabs.prime;

public class PrimeArray {
	public int[] identifyPrime(int[] no) {
		int prime[] = new int[no.length];
		int k = 0;

		for (int i = 0; i < no.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < no[i]; j++) {
				if (no[i] % j == 0) {
					isPrime = false;
					break;

				}
			}
			if (isPrime) {
				prime[k] = no[i];
				k++;

			}

		}

		return prime;

	}
}

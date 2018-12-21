package com.techlabs.dynamicarraysplit;

import java.util.Arrays;

public class ArraySpliDynamic {
	public static void main(String args[]) {
		int inputarray[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Input : "+Arrays.toString(inputarray) + "ChunkSize: 2");

		Object resultArray2[] = split(inputarray, 5);

		System.out.print(" Output :"+Arrays.deepToString(resultArray2));

	}

	public static Object[] split(int inputarray[], int chunk) {
		int newsize = inputarray.length;
		int length = 0;
		if (newsize % chunk == 0) {

			length = inputarray.length / chunk;
		} else {
			length = inputarray.length / chunk + 1;

		}
		Object resultArray[] = new Object[length];
		int counter = 0;
		for (int i = 0; i < inputarray.length; i = i + chunk) {
			int k = 0;

			int temp[] = new int[chunk];
			for (int j = i; j < inputarray.length; j++) {
				if (k < chunk) {
					temp[k] = inputarray[j];
					k++;

				}

			}
			resultArray[counter] = temp;
			counter++;
		}
		return resultArray;

	}

}

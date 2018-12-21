package com.techlab.arrayspliting;

public class ArraySplit {
	public static void main(String args[]) {
		int numbers[] = { 10, 20, 30, 40, 50, 60 };
		Object[] splitArray2 = subArrays(numbers, 2);
		for (Object result : splitArray2) {
			int[] slice1 = (int[]) result;
			for (int no : slice1) {
				System.out.print(no);
			}
			System.out.println();

		}

	}

	public static Object[] subArrays(int[] numbers, int n) {
		Object resultArray[] = new Object[2];
		int firstslice[] = new int[numbers.length / n];
		int secondSlice[] = new int[numbers.length - firstslice.length];
		int indexOffirst = 0;
		int indexOfSecond = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i < numbers.length / n) {
				firstslice[indexOffirst] = numbers[i];
				indexOffirst++;
			} else {
				secondSlice[indexOfSecond] = numbers[i];
				indexOfSecond++;

			}
		}

		resultArray[0] = firstslice;
		resultArray[1] = secondSlice;
		return resultArray;
	}

}
package com.techlab.arrayshifting;

public class ArrayShifting {
	public static void main(String args[]) {
		int[] numbers = new int[] { 10, 20, 30 };

		//int shiftedNumbers1[] = arrayShift(numbers);
		//for (int result : shiftedNumbers1) {
			//System.out.println(result);
		//}
		int[] shiftePosition=arrayshiftposition(numbers,1);
		for(int result1:shiftePosition)
		{
			System.out.println(result1);
		}
		
		
	}

	public static int[] arrayShift(int numbers[]) {
		int temp = numbers[0];
		for (int i = 0; i < numbers.length - 1; i++) {
			numbers[i] = numbers[i + 1];
		}
		numbers[numbers.length - 1] = temp;

		return numbers;

	}
	public static int[] arrayshiftposition(int numbers[],int no)
	{
		for(int i=no-1;i>=0;i--)
			numbers=arrayShift(numbers);
			
		return numbers;
	}

}

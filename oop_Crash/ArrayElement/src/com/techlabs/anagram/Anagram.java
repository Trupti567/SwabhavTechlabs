package com.techlabs.anagram;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[]) {
		String inputString = "rail safety";
		String inputString2 = "fairy tales";
		// int Storingarray2[]=new int[255];
		// Storingarray2=arrayofoneString(inputString);
		// for(int no:Storingarray2)
		// {
		// System.out.println(no);
		// }
		// int Storing[]=new int[255];
		// Storing=arrayofStringTwo(inputString2);
		// for(int no2:Storing)
		// {
		// System.out.println(no2);
		// }

		if (issame(inputString, inputString2) == true) {
			System.out.println("true");
		} 
		else {
			System.out.println("false");
		}

	}

	public static int[] arrayofoneString(String inputString) {
		int storingArray[] = new int[255];
		int index1 = 0;
		for (int i = 0; i < inputString.length(); i++) {
			
				
			index1 = (int) inputString.charAt(i);
			storingArray[index1]++;
		}
		return storingArray;
	}

	public static int[] arrayofStringTwo(String inputString2) {
		int storingArray2[] = new int[255];
		storingArray2 = arrayofoneString(inputString2);
		return storingArray2;
	}

	public static boolean issame(String inputString, String inputString2) {
		int array[] = new int[255];
		int array2[] = new int[255];
		array=arrayofoneString( inputString);
		array2=arrayofStringTwo( inputString2);
		
		boolean result = Arrays.equals(array, array2);

		return result;

	}

}

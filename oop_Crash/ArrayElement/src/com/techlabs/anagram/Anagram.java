package com.techlabs.anagram;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[]) {
		String inputString = "RAIL SAFETY";
		String inputString2 = "fairy talesee";

		if (issame(inputString, inputString2) == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}

	public static int[] arrayofoneString(String inputString) {
		String inputStrinlower = inputString.toLowerCase();
		int storingArray[] = new int[255];
		int index1 = 0;
		for (int i = 0; i < inputStrinlower.length(); i++) {

			index1 = (int) inputStrinlower.charAt(i);
			storingArray[index1]++;
		}
		return storingArray;
	}

	public static int[] arrayofStringTwo(String inputString2) {
		String inputStrinlower2 = inputString2.toLowerCase();
		int storingArray2[] = new int[255];
		storingArray2 = arrayofoneString(inputStrinlower2);
		return storingArray2;
	}

	public static boolean issame(String inputString, String inputString2) {
		
		int array[] = new int[255];
		int array2[] = new int[255];
		array = arrayofoneString(inputString);
		array2 = arrayofStringTwo(inputString2);
		boolean result=Arrays.equals(array,array2 );
		return result;
	}

}

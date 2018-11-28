package com.techlabs.capitalized;

public class Capitalized {
	public static void main(String args[]) {
		String input = "hello world";
		String capitalize = convertCapital(input);
		System.out.println(capitalize);

	}

	public static String convertCapital(String input) {
		char[] inputString = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (i == 0 && inputString[i] != ' ' || inputString[i] != ' '
					&& inputString[i - 1] == ' ')
				
			{
				if (inputString[i] >= 'a' && inputString[i] <= 'z') {
					inputString[i] = (char) (inputString[i] - 'a' + 'A');
				}

			}
		}
		String st = new String(inputString);
		return st;

	}

}

package com.techlabs.removerepeatingcharacter;

public class RemoveRepeatingCharacter {
	public static void main(String args[]) {
		String input = "Truptii";
		String input2 = input.toLowerCase();

		char array[] = input2.toCharArray();
		int count = 0;
		for (int i = 0; i < input2.length(); i++) {
			for (int j = i + 1; j < input2.length(); j++) {
				if (array[i] == array[j]) {
					System.out.println(array[i]);
					count++;
					break;

				}

			}

		}
		System.out.println(count);

	}
}

package com.techlabs.calculator;

public class Calculator {
	public int add(String numbers) {
		if (numbers == "") {
			return 0;
		}

		String[] numberforaddition = numbers.split(",");
		int sum = 0;

		for (String numbertoadd : numberforaddition) {
			if (Integer.parseInt(numbertoadd) >= 1000) {

				continue;
			}
			sum = sum + Integer.parseInt(numbertoadd);
		}

		return sum;

	}
}

package com.techlabs.calculater;

public class NegativeNotSupportException extends RuntimeException {
	public int num1;
	public int num2;

	NegativeNotSupportException(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNumber1() {
		return num1;
	}

	public int getNumber2() {
		return num2;
	}

	public String toString() {

		return String.format("Addition is not possible due to negative number "
				+ this.num1+" "+this.num2);
	}

}

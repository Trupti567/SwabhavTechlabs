package com.techlabs.args;

public class OperationArgs {
	public static void main(String args[]) {
		if (args.length == 0) {
			System.out.println("Enter Parameter");
		} else if (args.length == 2) {

			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("Additon is" + (a + b));
			System.out.println("Substraction is" + (a - b));

		} else {
			System.out.println("invalid input:Please enter two numbers");
		}
	}
}

package com.techlabs.array;

public class TestFunctionParameter {
	public static void main(String args[]) {
		int mark = 100;
		int marks[] = new int[] { 100, 200, 300, 400 };
		update(mark);
		System.out.println(mark);
		update(marks);
		for (int m : marks) {
			System.out.println(m);
			System.out.println(marks.hashCode());
		}

	}

	public static void update(int pmark) {
		pmark = 0;

	}

	public static void update(int marks[]) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = 0;
		}
	}

}

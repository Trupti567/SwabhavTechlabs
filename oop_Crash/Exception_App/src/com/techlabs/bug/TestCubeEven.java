package com.techlabs.bug;

public class TestCubeEven {

	public static int cudeEvenNo(int no) {
		if (no % 2 == 0) {
			return no * no * no;

		} else {
			throw new RuntimeException("Number should be even");

		}
	}

	public static void main(String args[]) {
		try {
			System.out.println(cudeEvenNo(3));
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}

	}

}

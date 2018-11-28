package com.techlabs.array;

public class TestArray2 {
	public String[] getAllNamesWithS(String names[]) {
		String newname[] = new String[names.length];

		int j = 0;
		for (int i = 0; i < names.length; i++) {

			if (names[i].contains("s")) {

				newname[j] = names[i];
				j++;
			}

		}

		return newname;

	}

}

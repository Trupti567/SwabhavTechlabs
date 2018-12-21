package com.techlab.nameStartwith;

public class TestArray {
	public static void main(String[] args) {
		String names[]=new String[]{"Trupti","Nikita","Karishma","vaishu"};
		TestArray2 array=new TestArray2();
		String filterednames[]=array.getAllNamesWithS(names);
		for(String name2:filterednames)
		{
			System.out.println(name2);
		}
	}

}

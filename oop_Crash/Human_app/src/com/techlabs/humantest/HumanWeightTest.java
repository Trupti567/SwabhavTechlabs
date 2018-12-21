package com.techlabs.humantest;

import com.techlabs.human.Human;

public class HumanWeightTest {
	public static void main(String args[])
	{
		Human human=new Human("Trupti", 5.2f, 100f, 22);
		System.out.println(human.getWeight());
		human.play();
		System.out.println("Weight After play");
		System.out.println(human.getWeight());
		
	}

}

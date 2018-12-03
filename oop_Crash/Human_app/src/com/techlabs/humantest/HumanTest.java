package com.techlabs.humantest;

import com.techlabs.human.Human;

public class HumanTest {

	public static void main(String[] args) {
		Human human=new Human("Trupti",5.2f,40.2f,22);
		Human human2=new Human("Manju", 4.3f, 30f, 20);
		printDetail(human);
		printDetail(human2);
		Human strong=human.whoIsStrong(human2);
		System.out.println("Strong is" +strong.getName());
		
		
		
		
		// TODO Auto-generated method stub

	}
	public static void printDetail(Human h)
	{
		System.out.println("name="+h.getName()+" height = "+h.getHeight()+
				"weight = "+h.getWeight()+ " Age= "+h.getAge());
	}

}

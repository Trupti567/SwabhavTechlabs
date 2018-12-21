package com.techlabs.humantest;

import com.techlabs.human.*;
import com.techlabs.human.Human;

public class HumanTestEnum {
	public static void main(String args[]) {
		Human human3 = new Human("Trupti", 5.2f, 40.0f, 22,
				GenderOptions.FEMALE);
		Human human2 = new Human("Manju", 5.0f, 40.5f, 20, GenderOptions.FEMALE);
		Human human4 = new Human("mayur", 6.2f, 60.5f, 22, GenderOptions.MALE);
		Human human5 = new Human("Aditya", 6.5f, 65.0f, 22, GenderOptions.MALE);
		Human human6 = new Human("Nikita", 6.0f, 55.5f, 22,
				GenderOptions.FEMALE);
		Human newHumanArray[] = new Human[5];
		newHumanArray[0] = human3;
		newHumanArray[1] = human2;
		newHumanArray[2] = human4;
		newHumanArray[3] = human5;
		newHumanArray[4] = human6;

		printDetail(human3);
		Human filteredArray[] = getFiltered(newHumanArray);
		for (Human filter2 : filteredArray) {
			System.out.println(filter2.getName());
		}
		//int no=occurenceOfFemale(newHumanArray);
		//System.out.println("no is"+no);
		

	}

	public static void printDetail(Human h) {
		System.out.println("name=" + h.getName() + " height = " + h.getHeight()
				+ "weight = " + h.getWeight() + " Age= " + h.getAge()
				+ "gender=" + h.gender());
	}
	
	public static int occurenceOfFemale(Human inputHumanArray[])
	{
		int counter=0;
		for(int i=0;i<inputHumanArray.length;i++)
		{
			if (inputHumanArray[i].gender() == GenderOptions.FEMALE)
			{
				counter=counter+1;
			}
		}
		return counter;
	}
	

	public static Human[] getFiltered(Human inputHumanArray[]) {
        
		Human humanArray[] = new Human[occurenceOfFemale(inputHumanArray)];
		int k = 0;
		for (int i = 0; i < inputHumanArray.length; i++) {
			if (inputHumanArray[i].gender() == GenderOptions.FEMALE) {
				humanArray[k] = inputHumanArray[i];
				k++;
			}
			
			
		}
		return humanArray;
	}
	

}

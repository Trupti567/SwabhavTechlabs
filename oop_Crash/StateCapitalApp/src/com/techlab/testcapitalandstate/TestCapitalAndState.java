package com.techlab.testcapitalandstate;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import com.techlab.state.StateAndCapital;

public class TestCapitalAndState {
	public static void main(String args[]) throws IOException {
		StateAndCapital state = new StateAndCapital();
		int ch;
		do{
			Scanner sc=new Scanner(System.in);
			System.out.println(" Menu   : ");
			System.out.println(" 1. Display : " );
			System.out.println(" 2. Search  : " );
			System.out.println(" 3. Exit    : " );
			System.out.println(" Enter Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:state.display();
			       break; 
			
			case 2:System.out.println("Enter the character you want to search");
			       String str=sc.next();
			       Map<String, String> result = state.search(str);

					for (Map.Entry m : result.entrySet()) {
						System.out.println(m.getKey() + " " + m.getValue());
					}
					break;
			case 3:System.out.println("Thank you");
				   exit(0);
				   break;
			       
			}
			
		}while(ch!=4);
		
		

	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}
}

package com.techlabs.guessgame;

public class Game {

	public void guessNumber(int no) {
		int random = (int) (Math.random() * 10);
		int guess=0;
		 System.out.println("Enter your guess");
	      
	        while(no!=random)
	        {
			if(no>random)
			{
				guess++;
				System.out.println("To high");
				
			}
			else 
			{
				guess++;
				System.out.println("To low");
			}
	        }
	        System.out.println(random+"Your ans is correct");
			
		  
	   }

		
	}


package com.techlabs.guesstest;

import java.util.Scanner;

import com.techlabs.guessgame.Game;

public class GuessGameTest {
	public static void main(String args[]) {
		System.out.println("Enter your choice");
		System.out.println("1.Start Game" +"\n"+ "2.Exit");
		Game game=new Game();
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		  

		    do{ 
			switch (ch) 
			{
			case 1: 
			       System.out.println("Enter your guess");
			       int no=sc.nextInt();
			       game.guessNumber(no);
			    	   
			        break;
			
			case 2:System.out.println("2.Exit");
			       System.exit(0);   
			       break;
			}

		}while(ch!=3);
	}
}



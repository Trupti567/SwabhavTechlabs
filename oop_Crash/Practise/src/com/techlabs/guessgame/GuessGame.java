package com.techlabs.guessgame;

import java.util.Scanner;

public class GuessGame {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Start Game" + "\n" + " 2.Exit ");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			GuessGame();
			break;
		case 2:
			System.out.println("You are Out of the Game");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;

		}

	}

	public static void GuessGame() {
		int randomNo = (int) (Math.random() * 100);
		Scanner game = new Scanner(System.in);
		int guess, count = 0;
		do {
			
			System.out.println("Enter the guess no : ");
			

			guess = game.nextInt();
			if(guess>100)
			{
				System.out.println("Please Enter Range 1-100");
			}
			
			else if (guess == randomNo) {
				count++;
				System.out.println("You won");
			} else if (guess > randomNo) {
				count++;
				System.out.println("To high");
			} else if (guess < randomNo) {
				count++;
				System.out.println("To low");
			}

		} while (guess != randomNo);
		System.out.println("You Won the game in counts == " + count);
		System.out.println("Thank You!!!!!!!!!!!!!!!!");
	}

}

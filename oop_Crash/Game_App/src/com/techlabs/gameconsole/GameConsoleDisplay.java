package com.techlabs.gameconsole;

import java.util.Scanner;

import com.techlabs.gamebusinesslogic.Game;
import com.techlabs.gamebusinesslogic.ResultOption;

public class GameConsoleDisplay {
	static final int START = 1;
	static final int EXIT = 2;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Menu: " + "\n" + " 1.Start Game " + "\n"
				+ " 2.Exit ");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();

		int no, count = 0;
		switch (ch) {
		case START:
			Game game = new Game();
			ResultOption input;
			do {
				System.out.println("Enter your number in range of 1-100");

				no = sc.nextInt();
				input = game.validationGame(no);

				if (input == ResultOption.HIGH) {
					System.out.println("To high");
				} else if (input == ResultOption.LOW) {
					System.out.println("To low");
				} else {
					System.out.println("Your guess is correct");

				}
				count++;
			} while (input != ResultOption.SAME);
			System.out.println("You have guess in coun: " + count);
			break;
		case EXIT:
			System.out.println("You are out of the Game");
			System.exit(0);
			break;
		}

	}
}

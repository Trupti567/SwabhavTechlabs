package com.techlabs.gamebusinesslogic;

import java.util.Scanner;

public class Game {
	private int randomNo;

	public Game() {
		this.randomNo = (int) (Math.random() * 100);
	}

	public ResultOption validationGame(int no) {

		if (no == this.randomNo) {
			return ResultOption.SAME;
		} else if (no > this.randomNo) {
			return ResultOption.HIGH;
		}

		return ResultOption.LOW;

	}
}

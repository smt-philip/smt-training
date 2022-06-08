
package com.mann.philip.training.game.guessing;

import java.util.Scanner;

/*******************************************************************************
*<b>Title:</b> Player.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 8, 2022
*<b>updates:</b>
*******************************************************************************/

public class Player {
	int playerGuess = 0;
	/**
	 * @returns an int captured via input from the terminal
	 * 
	 */
	public int getGuess() {
		Scanner promptGuess = new Scanner(System.in);
		System.out.println("Guess a number between 0 and 100");
		int guess = promptGuess.nextInt();
		promptGuess.close();
		return guess;
	}
}

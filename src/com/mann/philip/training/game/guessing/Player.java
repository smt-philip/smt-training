
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
	int howManyTrys = 0;
	/**
	 * @returns an int captured via input from the terminal
	 * @SuppressWarnings("resource"): 
	 * https://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed
	 */
	public int getGuess() {
		@SuppressWarnings("resource")
		Scanner promptGuess = new Scanner(System.in);
		System.out.println("Guess a number between 0 and 10");
		howManyTrys++;
		return promptGuess.nextInt();
	}
}

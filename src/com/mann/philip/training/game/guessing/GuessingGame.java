
package com.mann.philip.training.game.guessing;

/*******************************************************************************
*<b>Title:</b> GuessingGame.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 8, 2022
*<b>updates:</b>
*******************************************************************************/

public class GuessingGame {
	
	int rightNum = (int) (Math.random() * 10);
	boolean isGuessRight = false;
	Player player = new Player();
	int howManyTrys = 0;
	/**
	 * creates a loop while isGuessRight == false
	 * keeps track of how many trys to win
	 * once isGuessRight == true, game ends.
	 */
	public void startGame() {
		while (!isGuessRight) {
			int guess = player.getGuess();
			if (guess == rightNum) {
				isGuessRight = true;
				System.out.println("Winner Winner, Chicken Dinner");
				System.out.println("Your answer: " + guess + ", took this many tries: " + howManyTrys);
				System.out.println("Correct answer: " + rightNum);
			} else {
				howManyTrys++;
				System.out.println("You have guessed wrong!");
				System.out.println("Try again.");
			}
		}
	}
}

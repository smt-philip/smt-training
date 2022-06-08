
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
				System.out.println("Your answer: " + guess + ", took this many tries: " + player.howManyTrys);
				System.out.println("Correct answer: " + rightNum);
			} else {
				System.out.println("You have guessed wrong, try again!");
				System.out.println("Number of attempts: " + player.howManyTrys);
			}
		}
	}
}

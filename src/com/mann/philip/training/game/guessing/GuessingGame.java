
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
	public void startGame() {
		System.out.println("game starting...");
		Player player = new Player();
		int guess = player.getGuess();
		System.out.println("player has guessed: " + guess);
	}
}

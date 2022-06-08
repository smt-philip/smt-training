
package com.mann.philip.training.game.guessing;

/*******************************************************************************
*<b>Title:</b> GameLauncher.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 8, 2022
*<b>updates:</b>
*******************************************************************************/

public class GameLauncher {
	/**
	 * creates a new instance of GuessingGame
	 * and starts the game
	 * @param args
	 */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame();
		game.startGame();
	}
}

/*******************************************************************************
 * 					TTTTTTTTT    OOOOOO    DDDDDDD    OOOOOO
 * 					TTTTTTTTT   OOOOOOOO   DDDDDDD   OOOOOOOO
 *				       TTT	    OO    OO   DD   DD	 OO    OO
 *					   TTT      OO    OO   DD   DD   OO    OO
 *				       TTT      OOOOOOOO   DDDDDDD   OOOOOOOO
 *                     TTT       OOOOOO    DDDDDDD    OOOOOO
 *******************************************************************************
 *
 *  move howManyTrys into Player and increment in getGuess
 */
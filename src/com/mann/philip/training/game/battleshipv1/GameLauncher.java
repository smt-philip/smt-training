/**
 * 
 */

package com.mann.philip.training.game.battleshipv1;

/*******************************************************************************
*<b>Title:</b> GameLauncher.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 27, 2022
*<b>updates:</b>
*******************************************************************************/

/**
 * @author philipmann
 *
 */
public class GameLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numOfGuesses = 0;
		
		GameHelper helper = new GameHelper();
		Battleship battleship = new Battleship();
		
		int randomNum = (int) (Math.random() * 5);
		int[] locationCells = {randomNum, randomNum + 1, randomNum + 2};
		battleship.setLocationCells(locationCells);
		
		boolean isAlive = true;
		
		while (isAlive) {
			String guess = helper.getUserInput("enter a number");
			String result = battleship.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println(numOfGuesses + " guess");
			}
		} 
	}
	
}

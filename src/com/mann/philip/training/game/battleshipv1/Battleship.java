
package com.mann.philip.training.game.battleshipv1;

/*******************************************************************************
*<b>Title:</b> Battleship.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 27, 2022
*<b>updates:</b>
*******************************************************************************/

public class Battleship {
	int[] locationCells;
	int numOfHits;
	
	/**
	 * 
	 * @param guess
	 * @returns a String
	 */
	public String checkYourself(String userGuess) {
		int guess = Integer.parseInt(userGuess);
		String result = "miss";
		
		for (int i = 0; i < locationCells.length; i++) {
			if (guess == locationCells[i]) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println("result: " + result);
		return result;
	}
	
	/**
	 * sets location array
	 * @param location
	 */
	public void setLocationCells(int[] location) {
		locationCells = location;
	}
}

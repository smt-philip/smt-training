
package com.mann.philip.training.game.guessingv2;

import java.util.HashMap;

/*******************************************************************************
*<b>Title:</b> EnglishText.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 21, 2022
*<b>updates:</b>
*******************************************************************************/

public class English extends Language{

	/**
	 * 
	 * @returns a HashMap of English game text
	 */
	public HashMap<String, String> createMap() {
		// create a HashMap
		HashMap<String, String> english = new HashMap<>();
		// add keys of correct/incorrect, tryAgain, guess is low/high, how many attempts, etc.
		english.put("language", "Enter 'en' for english.");
		english.put("correct", "Winner winner, chicken dinner!");
		english.put("incorrect", "Your answer is incorrect.");
		english.put("tryAgain", "Please try again.");
		english.put("guessLow", "Your guess is to low");
		english.put("guessHigh", "Your guess is to high");
		english.put("attempts", "You have guessed this many times:");
		english.put("playAgain", "Would you like to play again?");
		return english;
	}
	
}

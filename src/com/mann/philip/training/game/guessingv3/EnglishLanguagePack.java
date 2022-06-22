
package com.mann.philip.training.game.guessingv3;

import java.util.HashMap;

/*******************************************************************************
*<b>Title:</b> EnglishLanguagePack.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 22, 2022
*<b>updates:</b>
*******************************************************************************/

public class EnglishLanguagePack extends Language {
	/**
	 * 
	 * @returns a HashMap of English game text
	 */
	public HashMap<String, String> generateLanguagePack() {
		HashMap<String, String> english = new HashMap<>();
		english.put("language", "Enter 'en' for english.");
		english.put("guess", "Pick a number between 1 - 100.");
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


package com.mann.philip.training.game.guessing;

import java.util.HashMap;
import java.util.Scanner;

/*******************************************************************************
*<b>Title:</b> GuessingGame.java
*<b>Project:</b> smt-training
*<b>Description:</b> WIP: GuessingGame built during training
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 22, 2022
*<b>updates:</b>
*******************************************************************************/

public class GuessingGame {
	public static HashMap<String, String> languagePack;
	/**
	 * 
	 * @returns a HashMap of the language pack selected after being set
	 */
	public static HashMap<String, String> getLanguagePack() {
		return languagePack;
	}
	/**
	 * 
	 * @param languagePack
	 */
	public static void setLanguagePack(HashMap<String, String> languagePack) {
		GuessingGame.languagePack = languagePack;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		init();
		loadPlayerInfo();
		getInput();
		startGameIteration();
		endGame();
		
	}
	/**
	 * 
	 * @returns a new instance of GuessingGame
	 */
	public static GuessingGame init() {
		System.out.println("Game has initialized");
		GuessingGame guessingGame = new GuessingGame();
		return guessingGame;
	}
	
	/**
	 * gets input for language & guess
	 */
	static int counter = 0;
	public static String getInput() {
		String input = "";
		try (Scanner prompt = new Scanner(System.in)) {
			while (counter <= 0) {
				System.out.println("Enter 'en' for english || Ingrese 'mx' para español.");
				input = prompt.nextLine();
				loadLanguagePack(input);
				counter = counter + 1;
			}
			if (counter > 0) {
				System.out.println(getLanguagePack().get("guess"));
				String response = prompt.nextLine();
				loadPlayerInfo().setGuess(response);
			}
			return input;
		}
	}
	
	/**
	 * 
	 * @param langCode
	 * @returns a HashMap of the user selected language
	 */
	public static HashMap<String, String> loadLanguagePack(String langCode) {
		Language language = new Language();
		HashMap<String, String> languagePack = language.initLanguagePack(langCode);
		setLanguagePack(languagePack);
		return languagePack;
	}
	/**
	 * 
	 * @returns an instance of Player
	 */
	public static Player loadPlayerInfo() {
		Player player = new Player();
		return player;
	}
	/**
	 * starts the game loop
	 */
	public static void startGameIteration() {
		// start the game loop
		System.out.println("Game has started");
		int targetNumber = generateTargetNumber();
		int guess =  Integer.valueOf(loadPlayerInfo().getGuess());
		while (targetNumber != guess) {
			getInput();
			// check to see if they are equal
			// if equal, end game and ask to play again
			// if not equal, guess again
		}
		System.out.println(loadPlayerInfo().getGuess());
	}
	/**
	 * 
	 * @returns a number bewteen 1 - 100
	 */
	public static int generateTargetNumber() {
		int targetNumber = (int) (Math.random() * 100);
		return targetNumber;
	}
	/**
	 * ends game, and ask for a new one. 
	 */
	public static void endGame() {
		System.out.println(getLanguagePack().get("playAgain"));
	}
	
	
	
	
	
	

}

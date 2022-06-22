
package com.mann.philip.training.game.guessingv3;

import java.util.HashMap;
import java.util.Scanner;

/*******************************************************************************
*<b>Title:</b> GuessingGame.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 22, 2022
*<b>updates:</b>
*******************************************************************************/

public class GuessingGame {
	/**
	 * TODO: look into why scanner is throwing errors
	 * https://stackoverflow.com/questions/28052519/java-lang-illegalstateexception-scanner-closed
	 */
	public static HashMap<String, String> languagePack;
	
	public static HashMap<String, String> getLanguagePack() {
		return languagePack;
	}

	public void setLanguagePack(HashMap<String, String> languagePack) {
		GuessingGame.languagePack = languagePack;
	}

	public static void main(String[] args) {
		init();
//		 promptLanguage();
		loadPlayerInfo();
		
		Scanner prompt = new Scanner(System.in);
		getLanguageInput(prompt);
		prompt.close();
		
		startGameIteration();
		generateTargetNumber();
		
		Scanner promptGuess = new Scanner(System.in);
		getGuessInput(promptGuess);
		prompt.close();
		endGame();
		
	}
	
	public static GuessingGame init() {
		System.out.println("Game has started");
		GuessingGame guessingGame = new GuessingGame();
		return guessingGame;
	}
	
	public static String getLanguageInput(Scanner prompt) {
		try (prompt) {
			System.out.println("Enter 'en' for english || Ingrese 'mx' para español.");
			String inputLanguage = prompt.nextLine();
			loadLanguagePack(inputLanguage);
			return inputLanguage;
		}
	}
	
	public static int getGuessInput(Scanner promptGuess) {
		try (promptGuess) {
			System.out.println("Choose a number bewteen 1 - 100");
			int response = promptGuess.nextInt();
			System.out.println("guess: " + response);
			return response;
		}
	}
	
	public static HashMap<String, String> loadLanguagePack(String langCode) {
		Language language = new Language();
		HashMap<String, String> languagePack = language.initLanguagePack(langCode);
		return languagePack;
	}
	
	public static Player loadPlayerInfo() {
		Player player = new Player();
		return player;
	}
	
	public static void startGameIteration() {
		// start the game loop
	}
	
	public static int generateTargetNumber() {
		int targetNumber = (int) (Math.random() * 100);
		return targetNumber;
	}
	
	public static void endGame() {
		System.out.println("Game has ended");
	}
	
	
	
	
	
	

}

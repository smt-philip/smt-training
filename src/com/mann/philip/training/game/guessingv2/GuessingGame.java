
package com.mann.philip.training.game.guessingv2;

import java.util.Scanner;

/*******************************************************************************
*<b>Title:</b> GameLauncher.java
*<b>Project:</b> smt-training
*<b>Description:</b> Guessing game for Silicon Mountain Technologies
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 16, 2022
*<b>updates:</b>
*******************************************************************************/

public class GuessingGame {
	
	public static void main(String[] args) {
		// call process() to start
	}
	
	public void process() throws Exception {
		
		// Initialize Game
		this.init();
		
		// Load Player info
		loadPlayer();
		
		// Start Game Iteration
		this.startGameIteration();
		
		// Get random number
		this.generateTargetNumber();
		
		// prompt for guess and validate
		this.getInput();
		
		// Ask if they want to play again
		this.endGame();
	}
	
	/**
	 * 
	 * @returns a new instance of GuessingGame
	 */
	public GuessingGame init() {
		GuessingGame guessingGame = new GuessingGame();
		return guessingGame;
	}
	
	/**
	 * 
	 * @returns a new instance of Player
	 */
	public static Player loadPlayer() {
		Player player = new Player();
		return player;
	}
	/**
	 * starts game iteration
	 */
	public void startGameIteration() {
		// start the loop
		// if input == targetNumber, break loop
	}
	/**
	 * 
	 * @returns a random number between 0 - 100
	 */
	public int generateTargetNumber() {
		return (int) (Math.random() * 100);
	}
	/**
	 * 
	 * @returns a String of input from the console
	 */
	public String getInput() throws Exception {
		// prompt player for input
		try {
			Scanner prompt = new Scanner(System.in);
			String response = prompt.nextLine();
		}
		catch (Exception e) {
			System.out.println("Exception thrown: " + e);
		}
		if (
		// call validateInput
		// if correct return guess
		// if wrong, prompt player to guess again
		return "";
	}
	/**
	 * validates input to see if 
	 */
	public boolean validateInput(String response) {
		// is input a number bewteen 1 - 100?
		// if yes, input is valid (return true?)
		// if no, input is invalid
		// prompt to guess again
		return false;
	}
	
	public void endGame() {
		// ask player if they'd like to play again
	}

}

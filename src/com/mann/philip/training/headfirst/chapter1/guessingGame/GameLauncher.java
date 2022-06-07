package com.mann.philip.training.headfirst.chapter1.guessingGame;
public class GameLauncher {
	// marking a method as public and static makes this method callable from anywhere
	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		game.startGame();
	}
}
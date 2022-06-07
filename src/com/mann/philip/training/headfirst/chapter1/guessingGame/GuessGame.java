package com.mann.philip.training.headfirst.chapter1.guessingGame;
public class GuessGame {
	
	// created three instance variables for the three player objects
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		
		// created three player objects and assigned them to three player instance variables
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		// declared three variables to hold the three guesses the players make
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		// decalred three varables to hold a boolean value based on players ansers
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		// target number that players have to guess
		int targetNumber = (int) (Math.random() * 100);
		System.out.println("Java: I am thinking of a number between 0 and 100...");
		
		// calling each players guess() method
		p1.guess();
		p2.guess();
		p3.guess();
		
		// getting each players guess, a result of guess() method running, by accessing the number variable of each player 
		guessp1 = p1.number;
		System.out.println("Player 1 guessed: " + guessp1);
		
		guessp2 = p2.number;
		System.out.println("Player 2 guessed: " + guessp2);
		
		guessp3 = p3.number;
		System.out.println("Player 3 guessed: " + guessp3);
		
		// checking guesses to see if they match the target number.
		// if guess is right, set boolean value, respective to player guess, true.
		if (guessp1 == targetNumber) {
			p1isRight = true;
		}
		if (guessp1 == targetNumber) {
			p1isRight = true;
		}
		if (guessp1 == targetNumber) {
			p1isRight = true;
		}
		
		if (p1isRight || p2isRight || p3isRight) {
			System.out.println("We have a winner");
			System.out.println("Player 1 got it right? " + p1isRight);
			System.out.println("Player 2 got it right? " + p2isRight);
			System.out.println("Player 3 got it right? " + p3isRight);
			System.out.println("The game is over :D");
//			break;
		} else {
			System.out.println("Players will have to try again :/");
		}
		
	}
}

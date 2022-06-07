package com.mann.philip.training.headfirst.chapter1.guessingGame;
public class Player {
	int number = 0;
	
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I am guessing " + number);
	}
}
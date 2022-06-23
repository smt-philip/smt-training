
package com.mann.philip.training.game.guessing;

/*******************************************************************************
*<b>Title:</b> Player.java
*<b>Project:</b> smt-training
*<b>Description: A Subclass of Person</b> 
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 22, 2022
*<b>updates:</b>
*******************************************************************************/

public class Player extends Person {
	private String guess;

	public String getGuess() {
		return guess;
	}

	public void setGuess(String guess) {
		this.guess = guess;
	}
}

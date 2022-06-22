
package com.mann.philip.training.game.guessingv2;

/*******************************************************************************
*<b>Title:</b> Player.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 16, 2022
*<b>updates:</b>
*******************************************************************************/

public class Player extends Person {
	private String nickName;
	private int guess;
	/**
	 * 
	 * @returns a String of nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 *
	 * @param nickName
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * 
	 * @returns an int guess
	 */
	public int getGuess() {
		return guess;
	}
	/**
	 * 
	 * @param guess
	 */
	public void setGuess(int guess) {
		this.guess = guess;
	}
	
}
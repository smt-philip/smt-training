/**
 * 
 */

package com.mann.philip.training.game.battleshipV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*******************************************************************************
*<b>Title:</b> GameLauncher.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jul 5, 2022
*<b>updates:</b>
*******************************************************************************/

/**
 * @author philipmann
 *
 */
public class BattleshipGame {
	
	// create an ArrayList called battleships
	private List<List<Integer>> gameboard = new ArrayList<>();
	// create a counter to count number of Guesses
	private int numOfAttempts = 0;
	
	/**
	 * 
	 * @returns battleship gameboard (7x7 grid)
	 */
	public void initGameboard() {
		int rows = 7, columns = 7;
		// create a battleship gameboard (7x7 grid)
		Integer [][] board = new Integer[rows][columns];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				board[row][col] = 0;
			}
		}
		List<List<Integer>> list = new ArrayList<>();
		for (Integer[] cells : board) {
			list.add(Arrays.asList(cells));
		}
		setGameboard(list);
		System.out.println(getGameboard());
	}
	
	public void placeGamePieces() {
		// randomly place game pieces on the board
	}

	/**
	 * @return the gameboard
	 */
	public List<List<Integer>> getGameboard() {
		return gameboard;
	}

	/**
	 * @param list the gameboard to set
	 */
	public void setGameboard(List<List<Integer>> list) {
		this.gameboard = list;
	}

	/**
	 * @return the numOfAttempts
	 */
	public int getNumOfAttempts() {
		return numOfAttempts;
	}

	/**
	 * @param numOfAttempts the numOfAttempts to set
	 */
	public void setNumOfAttempts(int numOfAttempts) {
		this.numOfAttempts = numOfAttempts;
	}
	
	// create a few "battleships" (game piece)
	// place "battleships" on gameboard
}

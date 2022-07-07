/**
 * 
 */

package com.mann.philip.training.game.battleshipV2;

/*******************************************************************************
*<b>Title:</b> GameLauncher.java
*<b>Project:</b> smt-training
*<b>Description:</b> Battleship: The Game
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jul 5, 2022
*<b>updates:</b>
*******************************************************************************/

/**
 * @author: philipmann
 * @rules: https://www.hasbro.com/common/instruct/battleship.pdf
 */
public class GameLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameLauncher game = new GameLauncher();
		game.process();
		
	}
	
	public void process() {
		// init game 
		this.initGame();
		// load player info
		this.initPlayer();
		// start game iteration
		this.startGame();
		// get player's input
		this.getPlayersInput();
		// validate player's input
		this.validatePlayersInput();
		// end game
		this.endGame();
	}
	
	public void initGame() {
		// create BatteshipGame
		BattleshipGame battleshipGame = new BattleshipGame();
		// create battleship gameboard
		battleshipGame.initGameboard();
		// create a few "battleships"
		// place "battleships" on gameboard (7x7 grid)
	}
	
	public void initPlayer() {
		System.out.println("init player...");
		Player player = new Player();
		// create a player to play Battleship
		// load player info
	}
	
	public void startGame() {
		System.out.println("starting game...");
		// while any "battleships" exist,
		// this.getPlayersInput();
		// this.validatePlayersInput();
		// if player's input is validated, 
		// return a "hit", "miss", or "kill" where applicable
		// if player's guess is a "kill", remove Battleship from battleshipsList
	}
	
	public String getPlayersInput() {
		System.out.println("get players input");
		// prompt player for input
		// validate player's input
		// if not valid, guess again
		return "";
	}
	
	public boolean validatePlayersInput() {
		System.out.println("validating players input");
		// if players input is a valid guess, 
		// increment numOfAttempts & return true;
		// else let player know input is NOT valid
		// then prompt player to guess again
		return false;
	}
	
	public void endGame() {
		System.out.println("ending game!");
		// display end of game text
		// display player's game stats
		// ask player if they would like to play again
	}
	
	

}

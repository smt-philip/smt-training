
package com.mann.philip.training.game.guessing;

/*******************************************************************************
*<b>Title:</b> GuessingGame.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 8, 2022
*<b>updates:</b>
*******************************************************************************/

public class GuessingGame {
	
	int rightNum = (int) (Math.random() * 10);
	boolean isGuessRight = false;
	Player player = new Player();
	
	String winnerEn = "Winner Winner, Chicken Dinner";
	String answerEn = "Your answer: ";
	String howManyTrysEn = ", took this many tries: ";
	String correctAnswerIsEn = "Correct answer is: ";
	String wrongAttemptsEn = "You have guessed wrong, try agaion! *** Attempts: ";
	
	String winnerSp = "¡A ganar, a ganar, pollo para cenar!";
	String answerSp = "Tu respuesta es: ";
	String howManyTrysSp = ", tuviste tantos intentos: ";
	String correctAnswerIsSp = "La respuesta correcta es: ";
	String wrongAttemptsSp = "Has adivinado equivocado, intentar otra vez *** Intentos: ";
	/**
	 * gets player's language from the player instance
	 * creates a loop while isGuessRight == false
	 * keeps track of how many trys to win
	 * once isGuessRight == true, game ends.
	 */
	public void startGame() {
		player.getLanguage();
		while (!isGuessRight) {
			int guess = player.getGuess();
			if (guess == rightNum) {
				isGuessRight = true;
				if (player.isEnglish) {
					System.out.println(winnerEn);
					System.out.println(answerEn + guess + howManyTrysEn + player.howManyTrys);
					System.out.println(correctAnswerIsEn + rightNum);					
				} else {
					System.out.println(winnerSp);
					System.out.println(answerSp + guess + howManyTrysSp + player.howManyTrys);
					System.out.println(correctAnswerIsSp + rightNum);
				}
			} else {
				if (player.isEnglish) {
					System.out.println(wrongAttemptsEn + player.howManyTrys);					
				} else {
					System.out.println(wrongAttemptsSp + player.howManyTrys);
				}
			}
		}
	}
}

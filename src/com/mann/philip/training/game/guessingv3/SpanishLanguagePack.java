
package com.mann.philip.training.game.guessingv3;

import java.util.HashMap;

/*******************************************************************************
*<b>Title:</b> SpanishLanguagePack.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 22, 2022
*<b>updates:</b>
*******************************************************************************/

public class SpanishLanguagePack extends Language {
	/**
	 * 
	 * @returns a HashMap of Spanish game text
	 */
	public HashMap<String, String> generateLanguagePack() {
		HashMap<String, String> spanish = new HashMap<>();
		spanish.put("language", "Ingrese 'mx' para español.");
		spanish.put("guess", "Elija un número entre 1 y 100.");
		spanish.put("correct", "¡A ganar a ganar pollo para cenar!");
		spanish.put("incorrect", "Tu respuesta es incorrecta.");
		spanish.put("tryAgain", "Inténtalo de nuevo.");
		spanish.put("guessLow" , "Su conjetura es demasiado baja.");
		spanish.put("guessHigh", "Su conjetura es demasiado alta.");
		spanish.put("attempts", "Lo has adivinado muchas veces:");
		spanish.put("playAgain", "¿Te gustaría volver a jugar?");
		return spanish;
	}
}

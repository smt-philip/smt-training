
package com.mann.philip.training.game.guessingv2;

import java.util.HashMap;

/*******************************************************************************
*<b>Title:</b> SpanishText.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 21, 2022
*<b>updates:</b>
*******************************************************************************/

public class Spanish extends Language {
	/**
	 * 
	 * @returns a HashMap of Spanish game text
	 */
	public HashMap<String, String> createMap() {
		HashMap<String, String> spanish = new HashMap<>();
		spanish.put("language", "Ingrese 'mx' para español.");
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

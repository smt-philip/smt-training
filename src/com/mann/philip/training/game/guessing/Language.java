
package com.mann.philip.training.game.guessing;

import java.util.HashMap;

import com.mann.philip.training.game.guessing.EnglishLanguagePack;
import com.mann.philip.training.game.guessing.SpanishLanguagePack;

/*******************************************************************************
*<b>Title:</b> Language.java
*<b>Project:</b> smt-training
*<b>Description:</b> Language initializes language packs for GuessingGame
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 17, 2022
*<b>updates:</b>
*******************************************************************************/

public class Language {
	
	private HashMap<String, String> languagePack;
	
	public HashMap<String, String> getLanguagePack() {
		return languagePack;
	}
	public void setLanguagePack(HashMap<String, String> languagePack) {
		this.languagePack = languagePack;
	}
	/**
	 * 
	 * @param langCode 
	 * ie: en = english, mx = spanish
	 * @return 
	 */
	public HashMap<String, String> initLanguagePack(String langCode) {
		HashMap<String, String > english = new EnglishLanguagePack().generateLanguagePack();
		HashMap<String, String> spanish = new SpanishLanguagePack().generateLanguagePack();
		switch (langCode) {
		case "en":
			setLanguagePack(english);
			break;
		case "mx": 
			setLanguagePack(spanish);
			break;
		default: 
			setLanguagePack(english);
		}
		return getLanguagePack();
	}
}


package com.mann.philip.training.game.guessingv2;

import java.util.HashMap;

import com.mann.philip.training.game.guessingv3.EnglishLanguagePack;
import com.mann.philip.training.game.guessingv3.SpanishLanguagePack;

/*******************************************************************************
*<b>Title:</b> Language.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
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
	 * ie: en, mx, de, fr
	 */
	public void initLanguagePack(String langCode) {
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
	}
}

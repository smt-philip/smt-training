
package com.mann.philip.training.headFirstJava.chapter1.phrasomatic;

/*******************************************************************************
*<b>Title:</b> PhraseOMatic.java
*<b>Project:</b> smt-training
*<b>Description:</b> Head First Java Chapter 1 Phrase O Matic Exercise
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 2, 2022
*<b>updates:</b>
*******************************************************************************/

public class PhraseOMatic {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] wordsListOne = {"24/7", "multi-tiered", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		String[] wordsListTwo = {"empowered", "sticky", "flabergasted", "java", "nutty", "outside the box", "positioned", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
		String[] wordsListThree =  {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
		
		int oneLength = wordsListOne.length;
		int twoLength = wordsListTwo.length;
		int threeLength = wordsListThree.length;

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordsListOne[rand1] + " " + wordsListTwo[rand2] + " " + wordsListThree[rand3];
		
		System.out.println("What we need is a " + phrase + ".");
		System.out.println("rand1: " + rand1 + ", " + "rand2:" + rand2 + ", " + "rand3:" + rand3);
	}
}

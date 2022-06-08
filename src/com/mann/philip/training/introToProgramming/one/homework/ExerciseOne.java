
package com.mann.philip.training.introToProgramming.one.homework;

/*******************************************************************************
*<b>Title:</b> ExerciseOne.java
*<b>Project:</b> smt-training
*<b>Description:</b> Intro to Programming: Exercise
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since May 31, 2022
*<b>updates:</b>
*******************************************************************************/

public class ExerciseOne {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		countToTen();
		reverseCount();
		evenLoops();
	}
	
	/**
	 * 
	 * @param counter
	 */
	public static void countToTen() {
		int counter = 1;
		while(counter <= 10) {
			System.out.print(counter + " ");
			counter = counter + 1;
		}
	}
	
	/**
	 * 
	 * @param counter
	 */
	public static void reverseCount() {
		int x = 10;
		for (int i = 10; i >= 1; i--) {
			System.out.print(x + " ");
			x = x - 1;
		}
	}
	
	/**
	 * 
	 * @param none used for this method
	 */
	public static void evenLoops() {
		for (int i = 2; i <= 20; i++) {
			System.out.print(i + " ");
			i = i + 1;
		}
	}
}

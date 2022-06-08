
package com.mann.philip.training.introToProgramming.two.homework;

/*******************************************************************************
*<b>Title:</b> ArrayExcercise.java
*<b>Project:</b> smt-training
*<b>Description:</b> Array Excercise from Intro To Programming 2
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since May 31, 2022
*<b>updates:</b>
*******************************************************************************/

public class ArrayExcercise {
	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		createArray(numArr);
	}
	
	/**
	 * 
	 * @param numArr
	 * 
	 */
	public static void createArray(int[] numArr) {
		int x = 0;
		while(x < 10) {
			int randVal = (int)(Math.random() * 100);
			numArr[x] = randVal;
			System.out.println(x + ": " + numArr[x]);
			x = x + 1;
		}
	}
}

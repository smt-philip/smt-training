
package com.mann.philip.training.headfirst.chapter1.bottlesofbeer;

/*******************************************************************************
*<b>Title:</b> BottleOfBeer.java
*<b>Project:</b> smt-training
*<b>Description:</b> Head First Java Chapter 1 Bottles of Beer Excercise
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 2, 2022
*<b>updates:</b>
*******************************************************************************/

public class BottleOfBeer {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";
			}
			System.out.println(beerNum + " " + word + " of beer on the wall,");
			System.out.println(beerNum + " " + word + " of beer!");
			System.out.println(" Take one down,");
			System.out.println(" pass it around!");
			beerNum = beerNum - 1;
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall.");
				System.out.println("");
			} else {
				System.out.println("No more bottles of beer on the wall.");
			}
		}

	}

}


package com.mann.philip.training.headfirst.chapter4.sizeOfDogBark;

import java.util.Arrays;

/*******************************************************************************
*<b>Title:</b> DogBark.java
*<b>Project:</b> smt-training
*<b>Description:</b> Head First Java Chapter 4: The Size Affects The Bark
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 3, 2022
*<b>updates:</b>
*******************************************************************************/

public class DogBark {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("args: " + Arrays.toString(args));
		Dog one = new Dog();
		one.size = 70;
		Dog two = new Dog();
		two.size = 8;
		Dog three = new Dog();
		three.size = 35;
		
		one.bark();
		two.bark();
		three.bark();
	}

}

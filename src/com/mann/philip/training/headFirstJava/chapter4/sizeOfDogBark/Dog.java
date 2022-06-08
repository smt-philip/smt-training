
package com.mann.philip.training.headFirstJava.chapter4.sizeOfDogBark;

/*******************************************************************************
*<b>Title:</b> Dog.java
*<b>Project:</b> smt-training
*<b>Description:</b> Head First Java Chapter 4: The Size Affects The Bark
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 3, 2022
*<b>updates:</b>
*******************************************************************************/

public class Dog {
	int size;
	String name;
	
	public void bark() {
		if(size > 60) {
			System.out.println("BIG DAWG SAYS: WOOOF! WOOOF!");
		} else if (size > 14) {
			System.out.println("Medium Dawg Says: Ruff! Ruff!");
		} else {
			System.out.println("smol dawg says: yip! yip!");
		}
	}
}

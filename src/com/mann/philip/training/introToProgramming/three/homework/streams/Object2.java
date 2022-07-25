

package com.mann.philip.training.introToProgramming.three.homework.streams;

import java.io.*;
import java.util.*;

/*******************************************************************************
*<b>Title:</b> Object2.java
*<b>Project:</b> smt-training
*<b>Description:</b> Object 2 holds the process to read and write the file.
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jul 7, 2022
*<b>updates:</b>
*******************************************************************************/

public class Object2 {
	Object1 object1 = new Object1("/home/philipmann/Desktop/streams/input/text.txt");
	/**
	 * 
	 * @throws IOException
	 */
	public void process() throws IOException {
		object1.readFile();
		convertToUppercase();
		object1.writeFile();
	}
	/**
	 * iterates through content
	 * converts all of content to uppercase
	 * updates uppercase content to content
	 */
	public void convertToUppercase() {
		List<Integer> content = object1.getContent();
		List<Integer> uppercaseContent = new ArrayList<Integer>();
		for(Integer i : content) {
			int x = Character.toUpperCase(i);
			uppercaseContent.add(x);
		}
		object1.setContent(uppercaseContent);
	}
}

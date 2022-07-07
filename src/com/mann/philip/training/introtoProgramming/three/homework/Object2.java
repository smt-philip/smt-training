

package com.mann.philip.training.introtoProgramming.three.homework;

import java.io.*;

/*******************************************************************************
*<b>Title:</b> Object2.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jul 7, 2022
*<b>updates:</b>
*******************************************************************************/

/**
 * @author philipmann
 *
 */
public class Object2 {
	
	
	// read file information from file in Object1
	public void readFile() {
		Object1 object1 = new Object1("/home/philipmann/Desktop/streams/input/text.txt");
		File outputFile = new File("/home/philipmann/Desktop/streams/output/outagain.txt");
//		create a new instance of file that takes a file as a param
		File inputFile = new File(object1.file);
		int c;
		try {
			FileReader in = new FileReader(inputFile);
			FileWriter out = new FileWriter(outputFile);
			while ((c = in.read()) != -1) {
				// convert file from Object1 into uppercase
				char x = (char) Character.toUpperCase(c);
				out.write(x);			
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

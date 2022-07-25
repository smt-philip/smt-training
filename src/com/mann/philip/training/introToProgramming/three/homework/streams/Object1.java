/**
 * 
 */

package com.mann.philip.training.introToProgramming.three.homework.streams;

import java.io.*;
import java.util.*;
/*******************************************************************************
*<b>Title:</b> Object1.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jul 7, 2022
*<b>updates:</b>
*******************************************************************************/

public class Object1 {
	String file;
	private List<Integer> content = new ArrayList<>();
	
	/**
	 * @returns content
	 */
	public List<Integer> getContent() {
		return content;
	}

	/**
	 * @param content
	 */
	public void setContent(List<Integer> content) {
		this.content = content;
	}

	/**
	 * Constructor accepts file names
	 * @param fileName
	 */
	public Object1(String fileName) {
		file = fileName;
	}
	
	/**
	 * reads file and copies contents into a List
	 * @throws IOException
	 */
	public void readFile() throws IOException {
		// instantiate a new File that takes file as a param
		File inputFile = new File(file);
		// use a FileReader to read file
		int c;	
		List<Integer> textToInts = new ArrayList<>();
		try {
			FileReader in = new FileReader(inputFile);
			while ((c = in.read()) != -1) {
				textToInts.add(c);
			}
			in.close();
			setContent(textToInts);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Writes content to new file
	 */
	public void writeFile() {
		File outputFile = new File("/home/philipmann/Desktop/streams/output/output.txt");
		try {
			FileWriter out = new FileWriter(outputFile);
			for (Integer x : getContent()) {
				out.write(x);
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

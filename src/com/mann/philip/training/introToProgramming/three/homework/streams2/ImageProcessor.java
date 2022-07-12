
package com.mann.philip.training.introToProgramming.three.homework.streams2;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Arrays;

import javax.imageio.ImageIO;

/*******************************************************************************
*<b>Title:</b> StoreReader.java
*<b>Project:</b> smt-training
*<b>Description:</b> Image processor for reading and writing images
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jul 11, 2022
*<b>updates:</b>
*******************************************************************************/

public class ImageProcessor {
	// file to be read
	File input = new File("/home/philipmann/Desktop/streams/input/bulldogge.jpg");
	File output = new File("/home/philipmann/Desktop/streams/output/newPic.jpg");
	// byte[] of bytes from input
	InputStream inputStream;
	// instantiates a new image to be read
	BufferedImage img;
	// holds the individual bytes of the image
	byte[] imgBytes;
	
	
	/**
	 * reads input and stores bytes into memory via ByteArrayInputStream
	 * @throws IOException
	 */
	public void readImage() throws IOException {
		try {
			img = ImageIO.read(input);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(img, "jpg", baos);
			imgBytes = baos.toByteArray();
			inputStream = new ByteArrayInputStream(imgBytes);
		} catch (IOException e) {
			System.out.println("error: " + e);
		}
		inputStream.close();
	}
	
	/**
	 * writes img to new file called output
	 */
	public void writeImage() {
		try {
			ImageIO.write(img, "jpg", output);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("image read and written successfully");
	}
	
}
package com.mann.philip.training.introToProgramming.three.homework.streams2;

// java io
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
// java awt
import java.awt.image.BufferedImage;
// java imageio
import javax.imageio.ImageIO;

/*******************************************************************************
*<b>Title:</b> ImageProcessor.java
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
	File input;
	// file to write to
	File output;
	// holds the byte[] of img
	ByteArrayOutputStream baos;
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
			// instantiates a new File to be read
			input = new File("/home/philipmann/Desktop/streams/input/bulldogge.jpg");
			// reads input into a BufferegImage
			img = ImageIO.read(input);
			// instantiate a new byteArrayStream 
			baos = new ByteArrayOutputStream();
			// writes img to a jpg file using baos
			ImageIO.write(img, "jpg", baos);
			// copys baos to imgBytes
			imgBytes = baos.toByteArray();
		} catch (IOException e) {
			System.out.println("error: " + e);
		}
	}
	
	/**
	 * writes img to new file
	 */
	public void writeImage() {
		try {
			// file that image will be written to
			output = new File("/home/philipmann/Desktop/streams/output/newPic.jpg");
			ImageIO.write(img, "png", output);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("image read and written successfully");
	}
}
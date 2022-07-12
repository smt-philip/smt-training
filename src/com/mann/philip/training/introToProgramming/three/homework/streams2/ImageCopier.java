
package com.mann.philip.training.introToProgramming.three.homework.streams2;

import java.io.IOException;

/*******************************************************************************
*<b>Title:</b> FileStore.java
*<b>Project:</b> smt-training
*<b>Description:</b> Homework assignment for ItP 3: Streams
*<b>Description:</b> Take an image file and store it to memory, pull file from memory and recreate it.
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jul 11, 2022
*<b>updates:</b>
*******************************************************************************/

public class ImageCopier {

	public static void main(String[] args) throws IOException {
		ImageProcessor imageInput = new ImageProcessor();
		imageInput.readImage();
		imageInput.writeImage();
	}

}

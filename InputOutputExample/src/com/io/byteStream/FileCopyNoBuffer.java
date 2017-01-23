package com.io.byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copy contents form a img file with no buffer. Code is pre jdk 1.7
 * 
 * @author Sidhesh
 *
 */
public class FileCopyNoBuffer {

	public static void main(String[] args) {

		String inputFile = "img\\vpn_Error.png";
		String outputFile = "img\\vpn_Error_out.png";
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		int byteRead;
		long startTime = 0, elapsedTime = 0l;

		try {
			startTime = System.currentTimeMillis();
			System.out.println("Start Time " + startTime);

			inputStream = new FileInputStream(inputFile);
			outputStream = new FileOutputStream(outputFile);

			while ((byteRead = inputStream.read()) != -1) {
				outputStream.write(byteRead);
			}

			elapsedTime = System.currentTimeMillis() - startTime;
			System.out.println("Final time required for Stream I/O is "
					+ elapsedTime + " msecs");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (inputStream != null)
					inputStream.close();
				if (outputStream != null)
					outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

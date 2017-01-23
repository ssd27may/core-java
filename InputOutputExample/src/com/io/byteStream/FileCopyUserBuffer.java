package com.io.byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * File copy with user specified buffer to speed up the time of read and
 * swriting stream data.
 * 
 * @author Sidhesh
 *
 */
public class FileCopyUserBuffer {

	public static void main(String[] args) {

		String inputFile = "img\\vpn_Error.png";
		String outputFile = "img\\vpn_Error_out.png";
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		long startTime = 0, elapsedTime = 0l;

		try {
			startTime = System.nanoTime();
			System.out.println("Start Time " + startTime);

			inputStream = new FileInputStream(inputFile);
			outputStream = new FileOutputStream(outputFile);
			byte[] bytesBuffer = new byte[4096];
			int noOfBytesRead = 0;

			// in this method we need to specifu=y the bytes array size which will be filled with data
			// then write to using offset and no of bytes read
			while ((noOfBytesRead = inputStream.read(bytesBuffer)) != -1) {
				outputStream.write(bytesBuffer, 0, noOfBytesRead);
			}
			
			elapsedTime = System.nanoTime() - startTime;
			System.out.println("Final time required for Stream I/O is "
					+ elapsedTime / 1000000.0 + " msecs");

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

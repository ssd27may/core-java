package com.io.byteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBuffer {

	public static void main(String[] args) {

		String inputFile = "img\\vpn_Error.png";
		String outputFile = "img\\vpn_Error_out.png";
		BufferedInputStream inputStreamBuffer = null;
		BufferedOutputStream outputStreamBuffer = null;
		int byteRead;
		long startTime = 0, elapsedTime = 0l;

		try {
			startTime = System.currentTimeMillis();
			System.out.println("Start Time " + startTime);

			inputStreamBuffer = new BufferedInputStream(new FileInputStream(
					inputFile));
			outputStreamBuffer = new BufferedOutputStream(new FileOutputStream(
					outputFile));

			while ((byteRead = inputStreamBuffer.read()) != -1) {
				outputStreamBuffer.write(byteRead);
			}

			elapsedTime = System.currentTimeMillis() - startTime;
			System.out.println("Final time required for Stream I/O is "
					+ elapsedTime + " msecs");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (inputStreamBuffer != null)
					inputStreamBuffer.close();
				if (outputStreamBuffer != null)
					outputStreamBuffer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

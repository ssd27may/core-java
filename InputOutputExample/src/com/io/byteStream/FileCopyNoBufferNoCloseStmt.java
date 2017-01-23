package com.io.byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Read contetns from a image file with no buffer and post jdk 1.7 i.e. no need
 * to close the I/O statements.
 * 
 * @author Sidhesh
 *
 */
public class FileCopyNoBufferNoCloseStmt {

	public static void main(String[] args) {
		String inputFile = "img\\vpn_Error.png";
		String outputFile = "img\\vpn_Error_out.png";
		int byteRead;
		long startTime = 0, elapsedTime = 0l;

		try (FileInputStream inputStream = new FileInputStream(inputFile);
				FileOutputStream outputStream = new FileOutputStream(outputFile)) {

			while ((byteRead = inputStream.read()) != -1) {
				outputStream.write(byteRead);
			}

			elapsedTime = System.currentTimeMillis() - startTime;
			System.out.println("Final time required for Stream I/O is "
					+ elapsedTime + " msecs");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

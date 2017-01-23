package com.io.dataStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataInputStream and DataOutputStream is used to read/write primitives data to
 * and from a file.
 */
public class DataStreamDemo {

	public static void main(String[] args) {

		// *****************************************
		// write primitive data to a file

		double[] prices = { 150.00, 200.00 };
		int[] units = { 5, 8 };
		String[] products = { "t-shirts", "jeans" };
		DataOutputStream dataStream = null;

		try {
			dataStream = new DataOutputStream(new FileOutputStream("./data/dataStream.txt"));
			for (int i = 0; i < prices.length; i++) {
				dataStream.writeChars(products[i]);
				dataStream.writeChar('\t');
				dataStream.writeDouble(prices[i]);
				dataStream.writeChar('\t');
				dataStream.writeInt(units[i]);
				dataStream.writeChar('\n');
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dataStream != null)
					dataStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

package com.io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Character stream has two abstract classes , reader and writer
 * @author Sidhesh
 *
 */
public class BufferedFileReaderWriter {

	public static void main(String[] args) {
		String fileName = "data/out.txt";
		String message = "Hello world ! Testing Character stream read and write";
		
		//************************* Write data to a file ***********
		System.out.println(java.nio.charset.Charset.defaultCharset());
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write(message);
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//************************ Read data from a file **********
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String inLine = null;
			while((inLine = reader.readLine()) != null){
				System.out.println(inLine);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

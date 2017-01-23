package com.io.file;

import java.io.File;

public class ListDirectoryRecursive {

	public static void main(String[] args) {

		File file = new File("H://input-output.txt");
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.exists());
		
		//file.renameTo(new File("D://text.txt"));
		
		File file2 = new File("/data/data.txt");
		System.out.println("data file exists :" +file2.exists());
		
		//create a new directory
		// . (dot) denotes the working directory
		File newDir = new File("./data2");
		System.out.println("Created new direc : "+newDir.mkdir());
		
		//list all the files in the directory
		File[] dirFiles = newDir.listFiles();
		for(File fileInDir : dirFiles){
			System.out.println(fileInDir.getAbsolutePath());
		}
		
		
	}

}

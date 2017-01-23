package org.generics.client;

import org.generics.util.GenericsUtil;

public class GenericsExamples {

	public static void main(String[] args) {

		//Write a generic method to exchange the positions of two different elements in an array.
		Integer[] arr  = new Integer[3];
		arr[0] = 111;
		arr[1] = 123;
		arr[3] = 355;
		
		System.out.println("before exchange");
		GenericsExamples.displayArrayElement(arr);
		
		// exchange process
		GenericsUtil.exchangeElementsInArray(arr, 0, 2);
	}

	public static void displayArrayElement(Integer[] arr) {
		for(int i : arr){
			System.out.println(i);
		}
		
	}
}

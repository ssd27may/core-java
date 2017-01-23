import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Find max element in an array. Two different approaches
 * @author sidhesh
 *
 */

public class ArrayExamples {

	public static void main(String[] args) {

		//find max elem in an array
		Integer[] array1 = {12,34,51,2,3,11};
		
		long startTime = System.nanoTime();
		
		List<Integer> list = Arrays.asList(array1);
		System.out.println("Max elem : "  +Collections.max(list));
		
		long endTime = System.nanoTime();
		System.out.println("Time req using collection approach: " +(endTime-startTime));
		
		startTime = System.nanoTime();
		int maxElem = array1[0];
		//approach 2
		for(int i=1;i<array1.length;i++) {
			if(maxElem < array1[i]) {
				maxElem = array1[i];
			}
		}
		
		System.out.println("Max elem : " +maxElem);
		endTime = System.nanoTime();
		System.out.println("Time req using normal for loop approach: " +(endTime-startTime));
		
		//How to get distinct elements from an array by avoiding duplicate elements?
		Integer[] array2 = {12,34,999,9999};
		
	
		
	}

}

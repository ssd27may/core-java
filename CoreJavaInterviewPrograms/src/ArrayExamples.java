import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ArrayExamples {

    public static void main(String[] args) {
        
        //Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.
        Integer[] arr1 = {1,5,33,42,4};
        Integer[] arr2 = {5,42,4,33};
        
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr2));
        for(int i=0; i<arr1.length;i++){
            if(set1.add(arr1[i])) {
                System.out.println("Element "+arr1[i]+" is not present in second array.");
            }
        }
        
        //How do you find second highest number in an integer array?
        int[] intArray = {1,5,33,42,4};
        Arrays.sort(intArray);
////        List<Integer> myList = Arrays.asList(intArray);
////        Collections.sort(myList);
//        System.out.println("The second highest number is "+myList.get(myList.size()-2));
        System.out.println("The required element is "+intArray[intArray.length - 2]);
        
        
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionExamples {

    public static void main(String[] args) {

        // frquency
        List<String> ll = new ArrayList<String>();
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        ll.add("two");
        ll.add("three");
        ll.add("two");
        ll.add("one");
        System.out.println("Actual list: " + ll);
        System.out.println("Frequency of 'one': " + Collections.frequency(ll, "one"));
        System.out.println("Frequency of 'three': " + Collections.frequency(ll, "three"));
        System.out.println("Frequency of 'two': " + Collections.frequency(ll, "two"));

        //********************************************************************************************
        // How to get max element from the given list?
        // using collection
        List<Integer> li = new ArrayList<Integer>();
        li.add(23);
        li.add(44);
        li.add(12);
        li.add(12);
        
        long startTime = System.nanoTime();
        System.out.println("Max elem " + Collections.max(li));
        long endTime = System.nanoTime();
        System.out.println("time taken " +(endTime-startTime));

        //using normal method
        startTime = System.nanoTime();
        int maxElem = li.get(0);

        for (int max : li) {
            if (max > maxElem) {
                maxElem = max;
            }
        }
        System.out.println("Max elem " + maxElem);
        endTime = System.nanoTime();
        System.out.println("time taken " +(endTime-startTime));
        
        
        
    }

}

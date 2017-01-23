import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class ArrayExample {

    public static void main(String[] args) {
        Integer[] intArray = {101,102,103,103,100,10};
        
        //with using collection
        Set<Integer> intSet = new TreeSet<>(Arrays.asList(intArray));
        for(Integer i : intSet){
        System.out.println(i);
        }
        
    }
    
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListDemo {

    public static void main(String[] args) {
        // test if it maintains insertion order
        LinkedList<String> emps = new LinkedList<>();
        emps.add("Sidhesh");
        emps.add("rohan");
        emps.add("roy");
        
        // test array list insertion order
        List<String> empList = new ArrayList<String>();
        empList.add("Sidhesh");
        empList.add("rohan");
        empList.add("roy");
        
        
        for(String str : emps) {
            System.out.println(str);
        }
        for(String str : empList) {
            System.out.println(str);
        }
    }
}

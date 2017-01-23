import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * HashSet internally contains a hashmap. It stores each element as a key in the hashmap.
 * Hashset is unordered whereas linkedhashset is ordered by insertion
 * @author Sidhesh
 *
 */
public class SetOrderingDemo {

    public static void main(String[] args) {
        
         //hashset is unordered
        Set<Employee> empHashSet = new HashSet<>();
        //Set<Employee> empHashSet = new LinkedHashSet<>();
        Employee emp1 = new Employee(1, "sidhesh");
        Employee emp2 = new Employee(2, "sidhesh2");
        Employee emp3 = new Employee(3, "sidhesh3");
        Employee emp5 = new Employee(5, "sidhesh5");
        Employee emp4 = new Employee(4, "sidhesh4");
        
        empHashSet.add(emp1);
        empHashSet.add(emp2);
        empHashSet.add(emp3);
        
        // please note adding 5th elem first than 4th
        empHashSet.add(emp5);
        empHashSet.add(emp4);
        
        System.out.println(empHashSet);
        
    }
}

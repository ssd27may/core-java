import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/**
 * This class demonstrates use of equals method.
 * Equals method is used to check if two comparable objects of a class are identical or not.
 * @author Sidhesh
 *
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee(1, "sidhesh");
		Employee e2 = new Employee(2, "ajit");
		list.add(e1);
		list.add(e2);
		
		// below code will generate error we cannot add element at any index
		// index should be within the size of the list
		//list.add(10, new Employee(3, "rohit"));
		//System.out.println(list.get(1));
		
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
            Employee employee = (Employee) itr.next();
            System.out.println(employee.getName());
        }
		
		for(int i=0; i<list.size();i++){
		    System.out.println(list.get(i).getName());
		}
		
		// when we search a emp obj it will return false as we dont override equals in employee class
		System.out.println(list.contains(new Employee(1, "sidhesh")));
		System.out.println(list.get(0).getEmployeeId());
		
		Collections.reverse(list);
		
		for(Employee emp: list) {
			System.out.println(emp.getName());
		}
		
		// copy or clone a array list
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("abc");
		
		ArrayList<String> cloneList = (ArrayList<String>) arr1.clone();
		
		// find element
		System.out.println(arr1.contains("xyz"));
		
		// copy arraylist to array
		String[] strArr = new String[arr1.size()];
		arr1.toArray();
		
		
	}

}

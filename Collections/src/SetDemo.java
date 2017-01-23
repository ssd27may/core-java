import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		// there is no get method for the set as set already has unique elements
		
		Employee e1 = new Employee(1, "sidhesh");
		Employee e2 = new Employee(2, "ajit");
		Employee e3 = new Employee(2, "ajit");
		Employee e4 = new Employee(2, "ajit");
		
		Set<Employee> empSet = new HashSet<>();
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e2);

		empSet.add(e3);
		empSet.add(e4);
		
		System.out.println(empSet.size());
		
	}

}

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		TreeSet<Employee> empSet = new TreeSet<>();
		empSet.add(new Employee(101, "x"));
		
		// this will result into runtime exception
		// as employee does not implement comparable interface
		System.out.println(empSet);
		
		//remove duplicate entries from a array
		Integer[] empIds = {101,101,102};
		TreeSet<Integer> uniqueEmpids = new TreeSet<>(Arrays.asList(empIds));
		System.out.println(uniqueEmpids);
		
		//to find duplicate element from an array
		uniqueEmpids = new TreeSet<>();
		for(int i=0;i<empIds.length;i++){
			if(!uniqueEmpids.add(empIds[i])){
				System.out.println(empIds[i]);
			}
		}
		
		// how to get the highest value from an array
		Integer[] empIds2 = {101,101,102};
		TreeSet<Integer> uniqueEmpids2 = new TreeSet<>(Arrays.asList(empIds2));
		System.out.println(uniqueEmpids2.last());
		
		//how to get the lowest ele from an array
		System.out.println(uniqueEmpids2.first());

	}
}

package org.sorting.client;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.sorting.comparator.EmployeeNameComparator;
import org.sorting.model.Employee;

public class TreeSetSortingDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(98, "Sidhesh");
		Employee e2 = new Employee(488, "John");
		Employee e3 = new Employee(003, "David");
		Employee e4 = new Employee(007, "David");
		//Employee e5 = new Employee(007, "David");

		// set sorted on emp id ascending order
		Set<Employee> employees = new TreeSet<>(new EmployeeNameComparator());
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		//employees.add(e5);
		
		for (Employee e : employees) {
			System.out.println(e.getName() +":" +e.getEmployeeId());
		}
		
		Set set = new TreeSet();
		set.add("2");
		set.add(3);
		set.add("1");
		Iterator it = set.iterator();
		while (it.hasNext())
		System.out.print(it.next() + " ");
	}

}

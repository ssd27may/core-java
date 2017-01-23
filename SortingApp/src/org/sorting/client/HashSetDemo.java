package org.sorting.client;

import java.util.HashSet;
import java.util.Set;

import org.sorting.model.Employee;

public class HashSetDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(98, "Sidhesh");
		Employee e3 = new Employee(003, "David");
		Employee e4 = new Employee(003, "David");
		
		Set<Employee> employees = new HashSet<>();
		employees.add(e1);
		employees.add(e3);
		employees.add(e4);
		
		System.out.println(employees.size());
		for (Employee e : employees) {
			System.out.println(e.getName() +":" +e.getEmployeeId());
		}
		
	}
}

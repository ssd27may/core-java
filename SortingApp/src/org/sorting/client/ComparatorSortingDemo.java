package org.sorting.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.sorting.comparator.EmployeeIdComparator;
import org.sorting.comparator.EmployeeNameComparator;
import org.sorting.model.Employee;

public class ComparatorSortingDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(98, "Sidhesh");
		Employee e2 = new Employee(488, "John");
		Employee e3 = new Employee(003, "David");

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		

		//Collections.sort(employees, new EmployeeIdComparator());
		Collections.sort(employees, new EmployeeNameComparator());

		for (Employee e : employees) {
			System.out.println(e.getName() +":" +e.getEmployeeId());
		}

	}
}

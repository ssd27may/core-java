package org.sorting.comparator;

import java.util.Comparator;

import org.sorting.model.Employee;

public class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEmployeeId() < o2.getEmployeeId())
			return -1;
		else if (o1.getEmployeeId() > o2.getEmployeeId())
			return 1;
		else
			return 0;
	}

}

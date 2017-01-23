package org.sorting.comparator;

import java.util.Comparator;

import org.sorting.model.Employee;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		int id = arg0.getName().compareTo(arg1.getName());
		// this is done to fix the treeset comparator issue
		if (id != 0)
			return id;
		return (arg0.getEmployeeId() < arg1.getEmployeeId()) ? -1 : (arg0
				.getEmployeeId() > arg1.getEmployeeId()) ? 1 : 0;
	}

}

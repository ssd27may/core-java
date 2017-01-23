package com.org1;

import com.org.Employee;

public class EmployeeFactory {

	public Employee getEmployee() {
		
		return new Employee(1, "Sidhesh");
	}
}

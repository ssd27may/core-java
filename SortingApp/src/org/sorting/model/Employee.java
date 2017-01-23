package org.sorting.model;


public class Employee {

	private int employeeId;
	private String name;

	public Employee(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return employeeId * 20;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!obj.getClass().equals(Employee.class))
			return false;
		Employee emp = (Employee) obj;
		if (emp.getEmployeeId() == employeeId) {
			return true;
		} else {
			return false;
		}
	}
}


public class Employee implements Comparable<Employee>{
 
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
		return this.employeeId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!obj.getClass().equals(Employee.class)) return false;
		Employee emp = (Employee) obj;
		if(emp.getName() == name) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
	    // TODO Auto-generated method stub
	    return this.getName();
	}

    @Override
    public int compareTo(Employee arg0) {
        return this.employeeId < arg0.getEmployeeId() ? -1 : this.employeeId > arg0.getEmployeeId() ? 1 : 0;
    }
}

package JUnit;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
    private int empId;
    private int salary;
	public Employee(String name, int empId, int salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	public boolean equals(Object obj) {
		Employee emp=(Employee)obj;
		boolean status=false;
		if(this.name.equalsIgnoreCase(emp.name)
				&& this.empId==emp.empId &&
				this.salary==emp.salary) {
			status=true;
		}
		return status;
	}
	public static List<Employee> getEmployeeList(){
		List<Employee> emps=new ArrayList<Employee>();
		emps.add(new Employee("Nats", 1, 15000));
        emps.add(new Employee("Kalid", 2, 25000));
        emps.add(new Employee("Krish", 3, 5000));
		
		return emps;
	}
	public int hashCode() {
		return this.empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}

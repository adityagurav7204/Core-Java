package cource.map;

public class Employee {
	
	private int ID;
	private String Name;
	private String Department;
	private long salary;

	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getDepartment() {
		return Department;
	}



	public void setDepartment(String department) {
		Department = department;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}



	public Employee(int iD, String name, String department, long salary) {
		super();
		ID = iD;
		Name = name;
		Department = department;
		this.salary = salary;
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Department=" + Department + ", salary=" + salary + "]";
	}




}

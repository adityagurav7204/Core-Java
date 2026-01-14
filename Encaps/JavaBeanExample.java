package com.ABC.Encaps;

public class JavaBeanExample {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setAge("21");
		emp.setName("Aditya");
		emp.setSalary("77000");
		
		System.out.println(emp.getAge());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

	}

}

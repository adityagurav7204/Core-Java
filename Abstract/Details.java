package com.Abstract;

abstract class Details {

	abstract void PrintInfo();
	 
}
class EmpDetails extends Details
{

	@Override
	public void PrintInfo() {
		String name ="Aditya";
		int age=21;
	    float salary=77000.777F;
	    
	  System.out.println(name);
	  System.out.println(age);
	  System.out.println(salary);
		
	}
	
}

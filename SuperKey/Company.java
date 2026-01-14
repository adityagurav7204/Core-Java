package com.SuperKey;

class Emp
{
	String name="Adity";
	
	Emp(String name)
	{
		this.name=name;
		System.out.println("using constructor of emp "+name);
	}
	void showDetails()
	{
		System.out.println("You are employee of XYZ company !!! welcome" +name);
	}
}
class Manager extends Emp
{
	String name="DhavalManager";
	
	Manager(String name)
	{
		super(name);
		System.out.println("Manager name is: "+name);
	}
	void showDetails()
	{
		super.showDetails();
		System.out.println("The employee name using super"+super.name);
		System.out.println("The employee name using super"+this.name);
	}
			
}

public class Company {

	public static void main(String[] args) {
		Manager mng = new Manager("BOB");
		mng.showDetails();
				

	}

}

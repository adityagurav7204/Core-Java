package com.SuperKey;

// use of super keyword
// the super keyword in java used to refer to members (variables,methods,constructor)of the parent class.
//its especially useful in inheritance when there is name conflict or when you want to explicitly access the parent class functionality
class SuperClass
{
	int num=100;
}
public class SubClass extends SuperClass {
	
	int num = 110;
	void printnumber()
	{
	 /*Note that instead of writing num we are
	  * writing supar.num in the print statement
	  * this refers to the num variable of superclass
	  */
		System.out.println(super.num);
		System.out.println(num);
	}
	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		obj.printnumber();
	}

}

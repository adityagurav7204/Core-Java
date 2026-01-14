package com.threading;

public class MultiMethod {
	
	public void method1()
	{
		System.out.println("this is 1st method");
	}
	public void method2()
	{
		System.out.println("this is 2nd mwthod");
	}
	public void run()
	{
		method1();
		method2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MultiMethod th = new MultiMethod();
         th.run();
	}

}

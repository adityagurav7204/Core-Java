package com.Except;

public class MyException {

	public static void main(String[] args) {
		try
		{
			int a = 10;
			int b= 0;
			int c= a/b;
			System.out.println("Dividation is :"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You cant divided by zeo");
		}

	}

}

package com.Interfacee;

interface Arithmetic
{
	public double calculate(double a,double b);
	
}
class Addition implements Arithmetic
{

	@Override
	public double calculate(double a, double b) {
		
		return a+b;
	}
	
}
class Substraction implements Arithmetic
{

	@Override
	public double calculate(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	
	
}
class Multiplication implements Arithmetic
{

	@Override
	public double calculate(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	
	
}
class Division implements Arithmetic
{

	@Override
	public double calculate(double a, double b) {
		if(b==0)
		{
			System.out.println("division zero is not allowed");
			return 0;
			
		}
		return a/b;
	}


	
}

public class ArithmeticOperations {
	
	public static void main(String[] args) {
		 Arithmetic add = new Addition();
		 Arithmetic sub = new Substraction();
		 Arithmetic mult = new Multiplication();
		 Arithmetic div = new Division();
		 
		System.out.println( add.calculate(7, 78));
		 System.out.println(sub.calculate(72,41));
		 System.out.println(mult.calculate(74, 2));
		 System.out.println(div.calculate(74, 12));
		 
	}

}

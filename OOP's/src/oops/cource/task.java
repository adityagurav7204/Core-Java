package oops.cource;

import java.util.Scanner;

public class task {
	int a;
	int b;
	 
	public void add()
	{
		System.out.println("Enetr a two numbers:");
		
		Scanner s = new Scanner(System.in);
		 a=s.nextInt();
		 b= s.nextInt();
		
		int c= a+b;
		System.out.println("Addition is:"+c);
		
	}
	    		

	public static void main(String[] args)
	{
		task t = new task();
		t.add();
		
	}

}

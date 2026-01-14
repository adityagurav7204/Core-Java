package cource.Exception;

import java.util.Scanner;

public class Multiple {
	
	public static void main(String[] args) {
		
		
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the first value");
			int a = sc.nextInt();
			System.out.println("Enter the second value");
			int b = sc.nextInt();

			int c= a/b;
			System.out.println(c);
			
			String s = null;
			System.out.println(s.charAt(3));
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("can't divide by zero");
		}
		catch(NullPointerException f)
		{
			System.out.println("String is Null");
		}

	}
}	

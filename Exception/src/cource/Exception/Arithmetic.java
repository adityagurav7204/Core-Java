package cource.Exception;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number:");
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		
		try {
			int c=a/b;
			System.out.println(c);
			System.out.println("program  end");
		}
		catch(ArithmeticException e) {
			System.out.println("cant't divide by zero");
		}
	}

}

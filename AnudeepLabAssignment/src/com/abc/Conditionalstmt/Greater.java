package com.abc.Conditionalstmt;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your numbers");
		int A=sc.nextInt();
		int B=sc.nextInt();
		int c=sc.nextInt();
		
		if(A>B && A>c)
		{
			System.out.println(A+" is greater");
		}
		else if(B>c && B>A)
		{
			System.out.println(B+" is greater");
		}
		else
		{
			System.out.println(c+" is greater");
		}

	}

}

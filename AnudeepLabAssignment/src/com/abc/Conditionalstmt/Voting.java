package com.abc.Conditionalstmt;

import java.util.Scanner;

// WAP To accept age from user and make decision whether he can vote or not.
public class Voting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("you are  not eligible for voting");
		}

	}

}

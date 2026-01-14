package com.Strings;

import java.util.Scanner;

public class strPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		
		String data = sb.toString();
		if(str.equals(data))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not  Palindrome");
		}
		sc.close();
				
	}

}

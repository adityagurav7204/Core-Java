package com.strings;

import java.util.Scanner;

//Q.1) Write a Java program to concatenate a given string to the end of another string.


public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your 1st string");
		String str1 = sc.nextLine();
		
		System.out.println("Enter your 2nd string");
		String str2 = sc.nextLine();
		
		System.out.println(str1+" "+str2);
		
		
	}

}

package com.Strings;

import java.util.Scanner;

public class Str1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your Address");
		String address = sc.nextLine();
		
		System.out.println("Enter your preffered language");
		String language = sc.nextLine();
		
		System.out.println("Enter any three programming languages you are skilled");
		
		String p [] = new String[3];
		
		for (int i=0;i<3;i++)
		{
			p[i]=sc.nextLine();
		}
		
		System.out.println("your basic information is with us kindly verify again !!");
		System.out.println("Your name is: "+name);
		System.out.println("Your address is: "+address);
		System.out.println("Your preffered language for job is: "+language);
		System.out.println("you are skilled in following languages");
		
		for(int i=0;i<3;i++)
		{
			System.out.println(p[i]);
		}
		
		
	

	}

}

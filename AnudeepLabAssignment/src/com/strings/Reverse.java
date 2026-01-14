package com.strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String reversed ="";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your String");
			String str = sc.nextLine();
			
			int mystr=str.length();
			
			System.out.println("Your input String is: "+str);
			System.out.println("Length of your String is: "+mystr);
			
			System.out.println("character at index 4: "+str.charAt(4));
			System.out.println("index of specific letter: "+str.indexOf('G'));
			System.out.println("Length of your String is: "+str.length());
			
			for(int i=mystr-1;i>=0;i--)
			{
			    reversed+=str.charAt(i);				
			}
			System.out.println(reversed);	}

}

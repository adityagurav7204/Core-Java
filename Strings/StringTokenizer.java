package com.Strings;

import java.util.Scanner;

public class StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.nextLine();
	
	
		//stringLength
		System.out.println("You have entered string with length :"+name.length());
		
		//equalCase
		System.out.println("Enter another String");
		String str2=sc.nextLine();
		System.out.println(name.equals(str2));
		
		//equalIgnorecase
		System.out.println(name.equalsIgnoreCase(str2));
		
		//lowerCase
		System.out.println(str2.toLowerCase());
		
		//upperCase
		System.out.println(str2.toUpperCase());
		
		//charAt(index) means character at particular index
		System.out.println("Character at 4th index :"+name.charAt(5));
				
     */
		String str1="java is awesome";
		String str2=str1.replace("awesome","fantastic");
		System.out.println("the original string is: "+str1);
		System.out.println("the replaced string is"+str2);
		
		//indexOf
		System.out.println("Index at 7th index is: "+str1.indexOf("s"));
		
		//End-Start
		System.out.println(str1.startsWith("j"));
		System.out.println(str2.endsWith("k"));
		
		//System.out.println("new String :"+str1.trim());
	}

}

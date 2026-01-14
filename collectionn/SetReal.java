package com.collectionn;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetReal {
	public static void main(String[] args) {
		
		Set<String> registeredCourses = new HashSet<>();
		String input;
		
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("\n---Course Registration Menu---");
			System.out.println("1.Register a course");
			System.out.println("2.View registered courses");
			System.out.println("3.Remove a Course");
			System.out.println("4.Exit");
			System.out.println("Enter your choice: ");
			
			input = sc.nextLine();			
			switch(input)
			{
			case "1":
				System.out.println("Enter course name to register");
				String course = sc.nextLine();
				if (registeredCourses.add(course))
				{
				System.out.println("registered successfully");
				}
				else
				{
					System.out.println(course + "is already registered");
				}
				break;
			case "2":
		
				if(registeredCourses.isEmpty())
				{
					System.out.println("No courses registered yet.");
				}
				else
				{
					System.out.println("Registered Cources : "+registeredCourses);
				}
				break;
			case "3":
				System.out.println("Enter course name to remove");
				String toRemove = sc.nextLine();
				if( registeredCourses.remove(toRemove))
				{
					System.out.println("course removed");
				}
				else
				{
					System.out.println(toRemove+ " is not in your registration list");
				}
				break;
			case "4":
				System.out.println("Exiting program...");
				return;
				
			default: 
				{
					System.out.println("Invalid choice");
				}
			}
		}
				
	}

}



	



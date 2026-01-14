package com.collectionn;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		ArrayList<String> tasks = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("\n---To Do List---");
			System.out.println("1.Add Task");
			System.out.println("2.View task");
			System.out.println("3.Remove task");
			System.out.println("4.Exit");
			System.out.println("Enter your choice: ");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter task: ");
				String mytask = sc.nextLine();
				tasks.add(mytask);
				System.out.println("Task added.");
				break;
			case 2:
				System.out.println("\n your tasks");
				if(tasks.isEmpty())
				{
					System.out.println("No task available");
				}
				else
				{
					for(int i=0;i<tasks.size();i++)
					{
						System.out.println((i + 1)+ "." +tasks.get(i));
					}
				}
				break;
			case 3:
				System.out.println("Enter task number to remove");
				int taskNumber = Integer.parseInt(sc.nextLine());
				if( taskNumber > 0 && taskNumber <= tasks.size())
				{
					tasks.remove(taskNumber-1);
					System.out.println("Task removed");
				}
				else
				{
					System.out.println("invalid task number.");
				}
			case 4:
				System.out.println("Exiting good bye");
				return;
				
			default: 
				{
					System.out.println("Invalid choice");
				}
			}
		}
				
	}

}

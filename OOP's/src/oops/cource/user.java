package oops.cource;

import java.util.Scanner;

public class user {
	int a;
	int b;
	
	
	public void user_input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		 a= s.nextInt();
		 b= s.nextInt();
	}
	public void addition()
	{   
		//user_input();
		
		user z = new user();
		z.user_input();
		
		int c= z.a+z.b;
		System.out.println("Addition is:"+c);
	    
	}
	
	public static void main(String[]args)
	{
		user u = new user();
		u.addition();
		
	}

}

package cource.Exception;

import java.util.Scanner;

public class Voting {

	Scanner sc = new Scanner(System.in);
	int Age= sc.nextInt();
	public Voting()
	{
		if(Age>18)
		{
			System.out.println("you are Eligible for Voting");
		}
		
		else {
			try {
			throw new InvalidAgeException("yor are not eligible for Voting");
			}
			
			catch(InvalidAgeException e) {
				System.out.println(e);
				System.out.println("try after 18 ");
			}
		}
		System.out.println("Program End");
	}
}

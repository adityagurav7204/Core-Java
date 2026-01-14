package cource.Exception;

import java.util.Scanner;

public class MarriageAgeValidation {

	
	Scanner sc = new Scanner(System.in);
	int maleAge= sc.nextInt();
	int femaleAge = sc.nextInt();
	public MarriageAgeValidation()
	{
		if((maleAge>21)&&(femaleAge>18))
		{
			System.out.println("you are Eligible to Marriage");
		}
		
		else {
			try {
			throw new InvalidAgeException("yor are not eligible for Marrage");
			}
			
			catch(InvalidAgeException e) {
				System.out.println(e);
				System.out.println("Yanda Kartavya nahi");
			}
		}
		System.out.println("Program End");
	}
}

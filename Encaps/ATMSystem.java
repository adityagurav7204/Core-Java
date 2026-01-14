package com.ABC.Encaps;

import java.util.Scanner;

public class ATMSystem {

	public static void main(String[] args) {
		
		final int CorrectPIN = 1234;
		int attempts =0 ;
		Scanner sc = new Scanner(System.in);
		
		while (attempts < 3)
		{
			System.out.print("Enter your Pin:");
			int enteredPIN = sc.nextInt();
			
			if(enteredPIN == CorrectPIN)
			{
				System.out.println("PIN Correct. Access granted.");
				break;
			}
			else
			{
				System.out.println("InCorrect PIN.Try again.");
				attempts++;
			}
			if (attempts == 3)
			{
				System.out.println("To many failed attempts.Your Account is locked.");
			}
		}
		 sc.close();
	}

}

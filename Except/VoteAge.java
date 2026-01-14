package com.Except;

public class VoteAge {

	public static void main(String[] args) throws AgeChecker {
		
	  check(17);
	}
	public static void check(int age) throws AgeChecker
	{
		if(age>18)
		{
			System.out.println("you can vote");
		}
		else
		{
			throw new AgeChecker("you can't vote");
		}
	}
	
	

 }

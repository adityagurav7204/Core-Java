package com.Except;

public class CustomeException { 
	
	public static void validate(int age) throws AgeLessThanZero
	{
		if(age<0)
		{
			throw new AgeLessThanZero("you cannot be negative");
		}
	}

	public static void main(String[] args) throws AgeLessThanZero {
        validate(-1);
	}

}

package string.cource;

import java.util.Scanner;

public class Palindrome {
	
//	Static Scanner s = new Scanner (System.in);
// if we create method as static then we must have to create Scanner class static before method
	
	public static void pal()
	{
	    Scanner s = new Scanner (System.in);
		System.out.println("Enter a String:");
		String str = s.next();
		
				
 		String rev ="";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);// it returns character
// jitu			System.out.print(str.charAt(i));
		}
//		System.out.println("Reverse String:"+rev);
//		System.out.println("Old String:"+str);
		
		if(str.equals(rev))
		
// jitu		if(str.equals(str))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
		
	}

	public static void main(String[] args) {
		pal();

	}

}

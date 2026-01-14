package string.cource;

import java.util.Scanner;

public class countword {
	
	public void words()
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a String:");
		String str = s.next();		
		
		int count = 0;
		
		for(int i =0; i<str.length(); i++) 
		{
			count++;
		}
		System.out.println("Total words in given string is :"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countword w = new countword();
		w.words();
	}

}

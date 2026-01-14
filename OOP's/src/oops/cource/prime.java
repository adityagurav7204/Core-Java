package oops.cource;

import java.util.Scanner;

public class prime {
	
	public  void prime()
	{
		System.out.println("Enter a number:");
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();

		int count=0;
	
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println("it's a prime number :"+num);
			}
			else
			{
				System.out.println("not prime number");
			}
	}

}

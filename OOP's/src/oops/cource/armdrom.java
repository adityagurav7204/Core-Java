package oops.cource;

import java.util.Scanner;

public class armdrom {
	
	public void armstrong()
	{
		System.out.println("enter a number:");
		Scanner s = new Scanner(System.in);
		  int n = s.nextInt();
		  
		    int rem;
			int count=0;
			int n1=0;
			int temp=n;
			
			while(n>0)
			{
				n=n/10;
				count++;  //3
			}
			
			n=temp;
			while(n>0)
			{
				rem=n%10;  //3  //5
				n1=n1+(int)Math.pow(rem,count);  //27 + 721 + 1
				n=n/10;                          //27+125+1
			}
			
			if(n1==temp)
			{
				System.out.println("Armstrong Number");
				
			}
			else 
			{
				System.out.println("Not An Armstrong Number");
			
			}
		  
		
	}
	public void palindrom()
	{
		System.out.println("Enter a number:");
		Scanner s = new Scanner (System.in);
		int l = s.nextInt();
		
		 int temp=0;
		 int rem;
		 int a=l;
		 
		 while(l>0)
		 {
			 rem=l%10;
			 temp=temp*10+rem;
			 l=l/10; 
		 }
		 if(temp==a)
		 {
		   System.out.println("palindrome number");
		   
		 }
		 else
		 {
			 System.out.println("not an palindrome number");
		 }
		
	}

}

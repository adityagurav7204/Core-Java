package oops.cource;

import java.util.Scanner;

public class infinite {
	int add=0;
	int sub=0;
	public void add()
	{
	
	Scanner s = new Scanner (System.in);
	
	while(true) 
	{
		System.out.println("Enetr a Number:");
		int a = s.nextInt();
		if (a==0)
		{
			add=add+a;
			break;
		}
		else
		{
			add=add+a;
			System.out.println(add);
		}
	} 	
	System.out.println("stop");
   }
	
	
	public void sub()
	{
		Scanner s = new Scanner(System.in);
        for (int i=1;true;i++)
		{
			System.out.println("Enter a number");
			int a = s.nextInt();
		    if(i==1)
		    {
				sub=a;
				
		    }
			else
			{
			sub=sub-a;
			
			}
			  System.out.println(sub);
		}
//        System.out.println(sub);
	}

	
	public static void main(String[]args)
	{
		infinite i = new infinite();
		i.add();
		i.sub();
				
	}

}

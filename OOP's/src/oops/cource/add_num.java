package oops.cource;

import java.util.Scanner;

public class add_num {
	int add = 0;
	
	public void add()
	{
		Scanner s =  new Scanner (System.in);
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter number");
			int a= s.nextInt();
			add=add+a;
			
			System.out.println("Addition is:"+add);
		}
	}

	public static void main(String[] args) {
		add_num n = new add_num();
		n.add();
		

	}

}

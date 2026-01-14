package oops.cource;

import java.util.Scanner;

public class add_for {
	
	int add=0;
	
	public void add()
	{
		Scanner s = new Scanner(System.in);
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter Number:");
			int a= s.nextInt();
			add = add+a;	
		}
		System.out.println("Additon is:"+add);
	}

	public static void main(String[]args) {
		
		add_for f = new add_for();
		f.add();
	}

}

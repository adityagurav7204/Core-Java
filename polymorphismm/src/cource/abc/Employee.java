package cource.abc;

import java.util.Scanner;

public class Employee {
	
	
	
	public void work()
	{
		System.out.println("i am working a softwear developer");
	}
	public void getSalary()
	{
		Scanner s = new Scanner(System.in);
		long salary = s.nextInt();
		System.out.println("salary per Annum "+salary);
	}

}

package array.cource;

import java.util.Scanner;

public class datatypes {
	
	 static Scanner sc = new Scanner(System.in);
	 
	public static void integer()
	{
		System.out.println("Enter number of integer element:");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter integer Element:"+i+" index");
			a[i] = sc.nextInt();
		}
		
	}
	
	public static void string()
	{
		System.out.println("Enter number of String element:");
		int Size = sc.nextInt(); //to enter size of array
		String S[] = new String[Size]; //enter array
		
		for(int i=0; i<S.length; i++)
		{
			System.out.println("Enter String Element of  "+i+" index");
			S[i] = sc.next();
		}
		
		System.out.println("Print String Element :");
		for(int i=0;i<S.length;i++)
		{
			System.out.println(S[i]);
		}
	}
	
	public static void Float()
	{
		System.out.println("Enter the number of float element:");
		int size = sc.nextInt();
		float f[]= new float[size];
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter float array of "+i+" index");
			f[i]= sc.nextFloat();
		}
		
	}
	
	public  static void Char()
	{
		char a[]= {'a','b','c','d','e'}; 
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter the array element of "+i+" index");
			System.out.println(a[i]);
		}
		
		System.out.println("Print character elemnt");
	
		for(int i=0; i<a.length; i++)
		{
			 System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
			//integer();
			//string();
		    //Float();
		    Char();
			
	}

}

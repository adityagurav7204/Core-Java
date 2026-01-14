package com.Except;

public class MyProject {

	public static void main(String[] args) {
		try
		{
			int a[] = new int[5];
			a[3]=7;
			a[4]=56;
			System.out.println(a[3]);
			System.out.println(a[4]);
			a[8]=67;
			System.out.println(a[8]);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("We dont have special array index space");
		}

	}

}

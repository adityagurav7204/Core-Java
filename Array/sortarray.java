package com.Array;

import java.util.Scanner;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five values: ");
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("You have entered");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
	 for(int i=0;i<5;i++)	
	 {
		for(int j=i+1;j<5;j++)
		{
			if(arr[i]>arr[j])
			{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	 }
		System.out.println("Your sorted array");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}

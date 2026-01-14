package array.cource;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		int sum =0;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter array of:"+i+"Index");
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
		}
		System.out.println("Addition :"+sum);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Print elements in array:"+i+"="+arr[i]);
		}

	}

}

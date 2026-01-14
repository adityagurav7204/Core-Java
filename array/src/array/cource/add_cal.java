package array.cource;

import java.util.Scanner;

public class add_cal {
	
	public static void addarray()
	{
//		int s1[] = new int[4];
//		s1[0] = 11;
//	    s1[1] = 12;
		
		int a[]= {7,3,4,6,2};
		int sum=0;
		//System.out.println(a[2]);   Using index number show array Element
	
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Addition is:"+sum);
	}
		public static void userarrayadd()   // Enter Array by User
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array");  
			int size = sc.nextInt();
			int arr[] = new int [size];
			int sum =0;
			
			for(int i=0; i<arr.length; i++)
			{
				System.out.println("Enter array:"+i);
				arr[i] = sc.nextInt();
				sum = sum+arr[i];
			}
			System.out.println("Addition is:"+sum);
		}
	public static void main(String[] args) {
		addarray();
		userarrayadd();

	}

}

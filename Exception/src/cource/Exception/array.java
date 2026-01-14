package cource.Exception;

public class array {
	
	public void m1()throws ArrayIndexOutOfBoundsException
	{
		int arr[]= {1,2,3,4};
		System.out.println(arr[4]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array a = new array();
		
		try {
			a.m1();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("throws a Array Exception");
		}

	}

}

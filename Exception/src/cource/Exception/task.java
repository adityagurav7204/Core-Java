package cource.Exception;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int arr[] = {1,2,3,4,5};
		
		System.out.println(arr[4]);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("finally Executed");
		}

		System.out.println("Program End");
	}

}

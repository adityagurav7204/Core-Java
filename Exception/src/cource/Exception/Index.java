package cource.Exception;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5};
		
		try
		{
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException I)
		{
			System.out.println("value not present in array");
			System.out.println("Program End");
		}
	}

}

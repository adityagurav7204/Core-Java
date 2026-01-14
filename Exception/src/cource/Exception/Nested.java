package cource.Exception;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			try {
				int a=10,b=0;
				int c= a/b;
				 
				System.out.println(c);
			}
			
			catch(ArithmeticException e) {
			 System.out.println("can't divide by zero");
			}
			
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("String is Null");
		}
	}

}

//we can also add try blocks inside the try block for more Exceptions

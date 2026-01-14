package cource.Exception;

public class throvs {
	
	public void m1()throws ArithmeticException 
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throvs t = new throvs();
		try {
			t.m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("throws a Arithmetic Exception");
		}
	
	}

}

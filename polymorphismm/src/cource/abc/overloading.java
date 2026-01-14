package cource.abc;

public class overloading {
	
	public void A(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of number is:"+c);
	}
	
	public void A(int a,int b,int c)
	{
		System.out.println("first number is:"+a);
		System.out.println("second number is:"+b);
		System.out.println("third number is:"+c);
	}
	public void A(int a)
	{
		System.out.println("the roll number of student is:"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overloading o = new overloading();
		o.A(23);
		o.A(7,7);
		o.A(6,7,8);

	}

}

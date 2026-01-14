package cource.abstraact;

public abstract class parent {
	int a,b,c;
	public void add()
	{
		a=5;
		b=7;
		c=a+b;
		
		System.out.println("Addition is:"+c);
	}
	
	public void sub()
	{
		a=21;
		b=7;
		c=a-b;
		System.out.println("Substraction is:"+c);
	}
	public abstract void mult();
	public abstract void div();
	
}

package oops.cource;

public class block {
	
	
	public void add()
	{
		System.out.println("this is add Methos:");
		int a= 30,b=40;
		int c=a+b;
		System.out.println("Addition is:"+c);
		
	}
	static
	{
		System.out.println("----this is static block----");
		
	}
	public static void main(String[]args)
	{
		System.out.println("----this is main method----");
		block b = new block();
		b.add();
	}

}

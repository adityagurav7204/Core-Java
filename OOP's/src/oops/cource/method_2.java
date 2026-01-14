package oops.cource;

public class method_2 {
	
	int a=40;
	int b=30;
	int c;
	
	public void show()
	{
		c=a+b;
		System.out.println(c);
	}
	public void change_value()
	{
		System.out.println(c-30);
	}

	public static void main(String[] args) {
		
		method_2 a = new method_2();
		a.show();
		a.change_value();

	}

}

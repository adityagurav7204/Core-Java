package oops.cource;

public class parameter_1 {
	
	int a=10;
	int b=20;
	
	public void change_value()
	{
		a=1;
		b=2;
	}
	public void add()
	{
		int c=a+b;
		System.out.println("addition is:"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameter_1 A= new parameter_1();
		A.change_value();
		A.add();
		

	}

}

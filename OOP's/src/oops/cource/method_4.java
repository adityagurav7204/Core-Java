package oops.cource;

public class method_4 {
	int a=10;
	int b=20;
	
	public int add()
	{
		int add=a+b;
		System.out.println("Addition is :"+add);
		return add;
	}
	
	public int mult()
	{
		method_4 A = new method_4();
		int mult= A.add()*4;
		System.out.println("multiplication is:"+mult);
		return mult;
	}
	
	public int div()
	{
		method_4 A = new method_4();
		int div =A.mult()/6;
		System.out.println("division is :"+div);
		return div;
	}

	public static void main(String[] args) {
		
		method_4 A =new method_4();
		A.div();

	}

}

package oops.cource;

public class method_5 {
	
	int a=10;
	int b=20;
	
	public int div()
	{
		int div=b/a;
		System.out.println(div);
		return div;
	}

	public static void main(String[] args) {
		method_5 A=new method_5();
		System.out.println(A.div());

	}

}

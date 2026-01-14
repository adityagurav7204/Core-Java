package oops.cource;

public class parameterized {
	
	int a=30;
	int b=20;
	
//	public void add(int a,int b)
//	{
//		int div=a+b;
//		System.out.println("division is :"+div);
//	}
//	public void sub (int a,int b)
//	{
//		int sub=b-a;
//		System.out.println("substraction is:"+sub);
//	}
//	public void mult(int a,int b)
//	{
//		int mul=a*b;
//		System.out.println("multiplication is:"+mul);
//	}
//	public void show(int a,char b)
//	{
//		System.out.println(this.a);
//		System.out.println(this.b);
//		
//	}
	public void show()
	{
		System.out.println(this.a+5);
		System.out.println(this.b+5);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterized  a =new parameterized();
//		a.add(10,20);
//		a.sub(70,30);
//		a.mult(7, 7);
//		a.show(7, 'a');
		a.show();
		

	}

}

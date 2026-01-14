package oops.cource;

public class object {
	int a=20;
	int b=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     object a=new object();
		
		System.out.println(a.a);
		System.out.println(a.b);
		
		object a1=new object ();
		
		a1.a = a.a+a1.b;
		a.a = a.b-a1.a;
		a1.a = a1.b*a.a;
		a.b = a1.b/a.a;
		
		System.out.println(a1.a);
		System.out.println(a.a);
		System.out.println(a1.a);
		System.out.println(a.b);
		
		
	}

	
}
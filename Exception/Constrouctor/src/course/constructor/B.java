package course.constructor;

public class B {
	
	public static void main(String[]args)
	{
	
	non_Constructor a= new non_Constructor();
	
	System.out.println(a.a);
	System.out.println(a.b);
	
	non_Constructor b = new non_Constructor();
	
	System.out.println(a.b);
	System.out.println(a.b);
	
	}

}

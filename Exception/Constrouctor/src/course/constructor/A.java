package course.constructor;

public class A {
	
	int a;
	int b;
	char c;
	
	A(int a,int b,char c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A(4,7,'a');
		
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		

	}

}

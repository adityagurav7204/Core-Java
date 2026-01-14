package course.constructor;

public class parameterized {
	
	int a= 25;
	int b= 23;
	
	parameterized(int a,int b)
	{
		 this.a=a;  // a=this.a;
		 this.b=b;  // b=this.b;
		System.out.println("Constructor");
	}

}

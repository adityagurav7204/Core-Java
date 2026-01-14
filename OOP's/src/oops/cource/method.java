package oops.cource;

public class method {

	     int a=40;
	     int b=50;
	     int c;
		
		public void add()
		{
			c=a+b;
			System.out.println(c);
		}
		public void sub()
		{
			c=a-b;
			System.out.println(c);
		}
		public void mul()
		{
			c=a*b;
			System.out.println(c);
		}
		public void div()
		{
			c=a/b;
			System.out.println(c);
		}
		public static void main(String args[])
		{
			method s=new method();
			s.add();
			s.sub();
			s.mul();
			s.div();
		}

	}



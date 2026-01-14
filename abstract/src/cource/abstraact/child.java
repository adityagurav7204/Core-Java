package cource.abstraact;

public class child  extends parent{

	@Override
	public void mult() {
		a=7;
		b=7;
		c=a*b;
		
		System.out.println("multiplication is:"+c);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
		a=21;
		b=3;
		c=a/b;
		
		System.out.println("division is:"+c);
	}

}

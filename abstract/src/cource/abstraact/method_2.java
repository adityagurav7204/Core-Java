package cource.abstraact;

public class method_2 implements method {

	int a,b,add,sub,mult;
	@Override
	public void A1() {
		a=10;
		b=10;
		add=a+b;
		System.out.println("addition  is"+add);
	}

	@Override
	
	public void A2() {
		
		a=100;
		b=50;
		sub=a-b;
		System.out.println("substraction is:"+sub);
		
	}

	@Override
	public void A3() {
		a=9;
		b=7;
		mult=a*b;
		System.out.println("multiplication is:"+mult);
		
	}


}

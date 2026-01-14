package cource.abstraact;

public class grandson extends parent2 {
	
	@Override
	public void m5() {
		
		System.out.println("grandson completing m5 dream");
		
	}

	@Override
	public void m6() {
		
		System.out.println("grandson completing m6 dream");
		
	}

	public static void main(String[] args) {
		 
		grandson g = new grandson();
		g.m1();
		g.m2();
		g.m3();
		g.m4();
		g.m5();
		g.m6();

	}

	

}

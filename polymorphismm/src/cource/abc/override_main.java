package cource.abc;

public class override_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		override_1 O = new override_1();
		O.m1();
		O.m2();
*/		
		//O.m3(); compilation problem
		
/*		override_2 A = new override_2();
		A.m1();
		A.m2();
		A.m3();
*/
		override_1 B = new override_2();//its called child class methods overriding parent class methods
		
		B.m1();
		B.m2();
		//B.m3();
		B.m5();
		
	}

}

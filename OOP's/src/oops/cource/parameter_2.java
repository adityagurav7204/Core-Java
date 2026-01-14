/*
 package oops.cource;

public class parameter_2 {
	
	int a=20;
	int b=30;
	
	public void change_value(int a,int b)
	{
		a=1;
		b=2;
	}
	public void add()
	{
		int add= a+b;
		System.out.println("Addition is:"+add);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameter_2 A = new parameter_2();
				A.change_value(7,8);
				A.add();
	}

}
*/

package oops.cource;

public class parameter_2 {
	
	int a=20;
	int b=30;
	
	public void change_value()
	{
		a=1;
		b=2;
	}
	public void add()
	{
		int add= a+b;
		System.out.println("Addition is:"+add);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameter_2 A = new parameter_2();
		A.change_value();
		A.add();
	}
	
}



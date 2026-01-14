package oops.cource;

public class method_3 {	
		int a=10;
		int b=20;
		int add,mul,div;
		
		public int add()
		  {
			  add=a+b;
			  System.out.println("Addition is:"+add);
			  return add;
		  }
		  public void mul()
		  {
			    mul=add*4;
			  System.out.println("multiplication is:"+mul);
		  }
		  public void div()
		  {
			  div=mul/6;
			  System.out.println("division is:"+div);
		  }
	
	public static void main(String[] args) {
		
		method_3 A = new method_3();
		A.add();
		A.mul();
		A.div();
	  

	}

}

package cource.Exception;

public class finallly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a =20,b=0;
			int c=a/b;
			
			System.out.println(c);
		}
		finally{
			System.out.println("finally block executed");
		}
		

	}

}

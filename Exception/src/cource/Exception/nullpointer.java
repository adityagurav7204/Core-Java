package cource.Exception;

public class nullpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = null;
		
		try {
			System.out.println(s.length());
		}
		catch(Throwable e)
		{
//			System.out.println("String is Null");
			
//			e.printStackTrace();
			System.out.println(e);
			System.out.println("program end");
		}

	}

}

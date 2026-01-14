package cource.Exception;

public class StringException {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		
		String s = "Aditya";
		
		try {
			System.out.println(s.charAt(7));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("value not present in string");
			System.out.println("program End");
		}

	}

}

package string.cource;

public class string {
	public void pickChar() {
		
		String a = "aditya";
		
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.indexOf("a"));
		
		char b = a.charAt(3);
		System.out.println(b);
		
		for(int i=0; i<a.length(); i++) 
			{
				char c = a.charAt(i);
				System.out.println(c);
			}

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string s = new string();
		s.pickChar();
	}

}

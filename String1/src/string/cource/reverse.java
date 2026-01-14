package string.cource;

public class reverse {
	
	public static void main(String[] args) {
		String s = "Legendary";
		String s1="";
		int length=s.length();
		
		for(int i=(length-1);i>=0;i--)
		{
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
	}

}

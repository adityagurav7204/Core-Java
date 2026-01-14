package string.cource;

public class countA {
	
	public  static void A()
	{
		String str = "Legendary";
		int space=0;
		
		for(int i=0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (c =='a')
			{
				space++;
			}
		}
		System.out.println("Total a in string:"+space);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A();
	}

}

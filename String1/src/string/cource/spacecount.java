package string.cource;

public class spacecount {
	
	public void countspace()
	{
		String str = "India is my country";
		int space=0;
		
		for(int i=0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (c ==' ')
			{
				space++;
			}
		}
		System.out.println("Total space in string:"+space);
		
	}

	public static void main(String[] args) {
       spacecount a = new spacecount();
         a.countspace();
	}

}

package string.cource;

public class countIi {
	
	public static void I_i()
	{
		String str = "India is my country";
		int space=0;
		
		for(int i=0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (c == 'I' ||c== 'i')
			{
				space++;
			}
		}
		System.out.println("Total I and i in string:"+space);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I_i();
	}

}

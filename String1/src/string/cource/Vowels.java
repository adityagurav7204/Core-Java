package string.cource;

public class Vowels {
	
	public static void Vowels()
	{
		String str = "Legendary";
		int space=0;
		
		for(int i=0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (c =='a' || c=='L' || c=='g' || c=='e') //was error
			{
				space++;
			}
		}
		System.out.println("Total vowels in string:"+space);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowels();
	}

}

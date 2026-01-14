package hackathon.cource;

public class divisible {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=20; i++)
		{
			if(i%4==0)
			{
				System.out.println(sum);	
			}
			
			else if((i%4!=0))
			{
				System.out.println(i);
			}
		}
	}

}

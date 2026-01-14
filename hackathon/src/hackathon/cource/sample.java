package hackathon.cource;

public class sample {
	
	static int sum=0;
	
	public static void main(String[] args) {
	
		for(int i=12; i<=50; i++)
		{
		   if(i%3==0 && i%5==0)
		   {
			   sum=sum+i;
			   System.out.println(sum);
		   }
		}
	
	}

}

package star.cource;

public class pyramid {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			System.out.println(" ");
			for(int j=i; j<=4; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=2; l<=i; l++)
			{
				System.out.print("*");
			}
		}

	}

}

package star.cource;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		for(int i=2; i<=5; i++)
		{
			System.out.println(" ");
			for(int j=2; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=2*i-1; k<=9; k++)
			{
				System.out.print("*");
			}
		}
	}

}

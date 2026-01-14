package star.cource;

public class pyramid_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++)
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

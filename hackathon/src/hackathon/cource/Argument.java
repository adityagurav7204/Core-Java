package hackathon.cource;

public class Argument {
	
	public int diff(int n, int m)
	{
		int no=0;
		int yes=0;
		for(int i=1; i<=m; i++)
		{
			if(i%n==0)
			{
				no= no+i;
			}
			else
			{
				yes=yes+i;
			}
		}
		int diff=no-yes;
		return diff;
	}
	
	public static void main(String[] args) {
		Argument A = new Argument ();
		System.out.println(A.diff(20,5));
	}
} 
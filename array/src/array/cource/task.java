package array.cource;

public class task {

	public static void main(String[] args) {
		int a[] = {2,3,4,6,9,7,8};
		int sum =0;
		int sumodd=0;
		
		for(int i=0; i<a.length; i++)
		{
			if (a[i]%2 == 0)
			{
				sum = sum+a[i];
			}
			else
			{
				sumodd = sumodd+a[i];
			}
		}
		System.out.println("Addition os even number is:"+sum);
		System.out.println("Additiomn of odd number is:"+sumodd);

	}

}

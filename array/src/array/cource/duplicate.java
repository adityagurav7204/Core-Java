package array.cource;

public class duplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4,5,6,6,7,7,4,5,8,9};
		
		System.out.println("duplicate elements in given array:");
		for(int i=0; i< arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}

	}

}

package loops.sgm;

public class Armstrong_Number {
	public static void main(String[] args) {

	int n=153,rem;
	int count=0;
	int n1=0;
	int temp=n;
	
	while(n>0)
	{
		n=n/10;
		count++;  //3
	}
	
	n=temp;
	while(n>0)
	{
		rem=n%10;  //3  //5
		n1=n1+(int)Math.pow(rem,count);  //27 + 721 + 1
		n=n/10;                          //27+125+1
	}
	
	if(n1==temp)
	{
		System.out.println("Armstrong Number");
		
	}
	else 
	{
		System.out.println("Not An Armstrong Number");
	
	}
  }
}

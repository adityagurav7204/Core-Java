package loops.sgm;

public class armstrong_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10000;i++)
		{		
		int n=i,rem;
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
			System.out.println(n1);
			
		}
		}
		
	}

}

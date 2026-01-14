import java.util.*;
class UserInput
{
	public static void main(String args[])
	{
	   float a,b,c;
		float avg;
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter three numbers");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
		avg=(a+b+c)/3;
		System.out.println("average is"+avg);

	}

}
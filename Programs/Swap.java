import java.util.*;
class Swap
{
	public static void main(String[]args)
	{
		int a=23,b=12,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Value before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("Value after Swapping");
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}
}
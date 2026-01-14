import java.util.*;
class Palindrome
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num= sc.nextInt();
    int res=0,rem,temp;
    temp=num;
    while(num>0)
    {
	rem=num%10;
        res=res*10+rem;
        num=num/10;
    }
    if(res==temp)
    {
      System.out.println("Number is palindrome");
    }
    else 
    {
      System.out.println("Number is not palindrome");
    }
     
  }
}
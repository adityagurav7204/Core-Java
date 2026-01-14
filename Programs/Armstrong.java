import java.util.*;
class Armstrong
{
  public static void main(String args[])
  {
    int res=0,cube,rem;
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println("Enter a number: ");   
    int temp=num;

   while(num>0)
   {
        rem=num%10;
        cube=rem*rem*rem;
        res=res+cube;
        num=num/10;
   }
    if(temp==res)
    {
      System.out.println("Armstrong number "+res);
    }
    else
    {
      System.out.println("Not Armstrong number");
    }
  }
}
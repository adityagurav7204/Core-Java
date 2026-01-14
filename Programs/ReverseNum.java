import java.util.*;
class ReverseNum
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    while(num>=1)
    {
      System.out.println(num);
      num--;
    }
    

  }
}
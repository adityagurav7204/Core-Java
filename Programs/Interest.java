import java.util.*;
class Interest
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Amount :");
    int amt=sc.nextInt();
   System.out.println("Enter interest rate :");
    int rate=sc.nextInt();
    System.out.println("Enter time :");
    int time=sc.nextInt();

    int SI=(amt*rate*time)/100;
     System.out.println("Simple Interest is: "+SI);
  }
}
import java.util.*;
class Average
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number :");
    int num1=sc.nextInt();

   System.out.println("Enter 2nd number :");
    int num2=sc.nextInt();

    System.out.println("Enter 3rd number :");
    int num3=sc.nextInt();

    int Avg=(num1+num2+num3)/3;	

     System.out.println("Simple Aversge is: "+Avg);
  }
}
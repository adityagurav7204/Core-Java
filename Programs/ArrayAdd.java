import java.util.*;
class ArrayAdd
{
  public static void main(String args[])
  {
    int A[]=new int[5];
    int B[]=new int[5];
    int C[]=new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter elements for A");
     for(int i=0;i<5;i++)
    {
      A[i]=sc.nextInt();
    }
    System.out.println("enter elements for B");
     for(int i=0;i<5;i++)
    {
      B[i]=sc.nextInt();
    }
    System.out.println("Addition is:");
     for(int i=0;i<5;i++)
    {
       C[i]=A[i]+B[i];
       System.out.println(C[i]);
    }

  }
}
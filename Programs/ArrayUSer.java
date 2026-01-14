import java.util.*;
class ArrayUSer
{
  public static void main(String args[])
  {
    int[] num=new int[7];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter elements");
    for(int i=0;i<7;i++)
    {
      num[i]=sc.nextInt();
    }
     System.out.println("you have entered");
     for(int i=0;i<7;i++)
     {
       System.out.println(num[i]);      
     }
  } 
}
import java.util.*;
class ArrayMax
{
  public static void main(String args[])
  {
    int max;
    int marks[]=new int[5];
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your marks");
    for(int i=0;i<5;i++)
    {
     marks[i]=sc.nextInt();
    }

     max=marks[0];

    for(int i=0;i<5;i++)
    {
      if(marks[i]>max)
      {
        max=marks[i];
      }
    }
      System.out.println("maximum marks are "+max);
  }
}
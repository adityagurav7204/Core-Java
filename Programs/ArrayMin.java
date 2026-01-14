import java.util.*;
class ArrayMin
{
  public static void main(String args[])
  {
    int min;
    int marks[]=new int[5];
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your marks");
    for(int i=0;i<5;i++)
    {
     marks[i]=sc.nextInt();
    }

     min=marks[0];

    for(int i=0;i<5;i++)
    {
      if(marks[i]<min)
      {
        min=marks[i];
      }
    }
      System.out.println("maximum marks are "+min);
  }
}
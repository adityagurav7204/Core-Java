import java.util.*;
class Check
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your marks");
	int marks = sc.nextInt();
	
	if(marks>=90)
	{
	  System.out.println("you have got O grade");
	}
	else if(marks>=60)
	{
	  System.out.println("You have got A Grade");
	}
	else if(marks>=35)
	{
	 System.out.println("You passed in exam");
	}
	else
	{
 	  System.out.println("you failed in exam");
	}
  }
}
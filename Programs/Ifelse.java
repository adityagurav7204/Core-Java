/* conditional statement 
  1)if
 2)if-else
 3)if-elseif-else
*/
import java.util.*;

class Ifelse
{
  public static void main (String args[])
  {
    int a;
    Scanner sc = new Scanner (System.in);
    a=sc.nextInt();
    System.out.println("Enter a number");
    if(a>0)
    {
      System.out.println("You Entered natural number");
    }
    else
     {
 	System.out.println("You entered negative or whole number");
     }
  }
}
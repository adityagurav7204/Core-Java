import java.util.*;
class Switch2
{
 public static void main(String args[])
  {
   int ch,res;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your choice between 1 to 7");
   ch=sc.nextInt();
  switch(ch)
  {
   case 1:
     System.out.println("its Monday");
     break;
   case 2:
     System.out.println("its Tuesday");
     break;
   case 3:
     System.out.println("its Wednsday");
     break;
   case 4:
     System.out.println("its Thursday");
     break;
   case 5:
     System.out.println("its Friday");
     break;
   case 6:
     System.out.println("its Saturday");
     break;
   case 7:
     System.out.println("its Sunday");
     break;
   default:
     System.out.println("Wrong input");
     break;
   }
  }

}
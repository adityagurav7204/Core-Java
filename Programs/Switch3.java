import java.util.*;
class Switch3
{
 public static void main(String args[])
  {
   int ch,res,area;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your choice between 1 to 3");
   ch=sc.nextInt();
  switch(ch)
  {
   case 1:
     System.out.println("Enter length and breadth");
     int l=sc.nextInt();
     int b=sc.nextInt();
     area=l*b;
     System.out.println("area of rectangle is: "+area);
     break;
   case 2:
     System.out.println("Enter a side of square");
     int s=sc.nextInt();
     area=s*s;
     System.out.println("area of square is: "+area);
     break;
   case 3:
     System.out.println("Enter radius");
     int r=sc.nextInt();
     double result =3.14*r*r;
     System.out.println("area of circle is: "+result);
     break;
   }
  }

}
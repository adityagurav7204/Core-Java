import java.util.*;
class Switch
{
  public static void main(String args[])
  {
   int a,b,ch,res;
   Scanner sc = new Scanner(System.in);
   System.out.println("press 1.Add\n2.sub\n3.mult\n4.div");
   System.out.println("Enter your choice");
   ch=sc.nextInt();
  switch(ch)
  {
   case 1:
     System.out.println("Enter two numbers");
     a=sc.nextInt();
     b=sc.nextInt();
     res=a+b; 
     System.out.println("The Anwer is: "+res);
     break;
   case 2:
     System.out.println("Enter two numbers");
     a=sc.nextInt();
     b=sc.nextInt();
     res=a-b; 
     System.out.println("The Anwer is: "+res);
     break;
   case 3:
     System.out.println("Enter two numbers");
     a=sc.nextInt();
     b=sc.nextInt();
     res=a*b; 
     System.out.println("The Anwer is: "+res);
     break;
   case 4:
     System.out.println("Enter two numbers");
     a=sc.nextInt();
     b=sc.nextInt();
     res=a/b; 
     System.out.println("The Anwer is: "+res);
     break;

   }
  }
}
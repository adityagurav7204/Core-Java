import java.util.*;
class Check_units
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter units");
    int units=sc.nextInt();
     
    if(units>=1  && units<=100)
    {
	int ans=units*10;
	System.out.println(ans);
    }
    else if(units>=100 && units<=200)
    {
	int ans=units*15;
	System.out.println(ans);
    }
    else if(units>=200 && units<=300)
    {
	int ans=units*20;
	System.out.println(ans);
    }
    else
    {
	int ans=units*25;
	System.out.println(ans);
    }
    
  }
}
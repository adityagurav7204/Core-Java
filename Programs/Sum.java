class SumDigit
{
  public static void main (String args[])
  {
    int num=234;
    int res=0,rem;
    while(num>0)
    {
 	rem=num%10;
        res=res+rem;
        num=num/10;
    }
    System.out.println("sum of number is: "+res);
  }
}
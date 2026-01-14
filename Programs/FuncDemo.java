class FuncDemo
{
  int sum;
 static int add(int a,int b)
 {
   return a+b;
 }

 void add(int a,int b,int c)
 {
  sum=a+b+c;
  System.out.println("the sum is: "+sum);
 }

  public static void main(String args[])
  {
    int result=add(7,14);
    System.out.println("the result is: "+result);
    FuncDemo obj = new FuncDemo();
    obj.add(4,7,66);
  }
}
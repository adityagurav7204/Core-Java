class Fun
{
  static void greet()
  {
    System.out.println("Hello everyone");
  }
  public void sayhi()
  {
    System.out.println("Hello public");
    greet();
  }
  public static void main(String args[])
  {
    greet();
    Fun obj = new Fun();
    obj.sayhi();
  }

}
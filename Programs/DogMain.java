class Dog
{
  String name;
 public Dog()
 {
  System.out.println("Constructer is created");
 }
 public Dog(String name)
  {
    this.name=name;
    System.out.println("dog name is: "+name);
  }
}
class DogMain
{
   public static void main(String args[])
 {
   Dog obj = new Dog();
   Dog obj1=new Dog("Tiger");
 }

}

package task.single;

public class Dog extends Animal {
     int id;
     String breed;
	public Dog(String name, String species , int id,String breed) {
		super(name, species);
		
		this.id=id;
		this.breed = "abc";
	
	}
	public void display()
	{
		System.out.println("animal information");
		System.out.println(name);
		System.out.println(Species);
		System.out.println(id);
		System.out.println(breed);
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog ("Rocky","male",101,"jerman Shepherd" );
		d.display();
	}
		
	
}
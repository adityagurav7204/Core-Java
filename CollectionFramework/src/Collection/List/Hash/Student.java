package Collection.List.Hash;
import java.util.*;

public class Student{

	private String Branch;
	private int  ID;
	private String Name;
	
	@Override
	public String toString() {
		return "A [Branch=" + Branch + ", id=" + ID + ", Name=" + Name + "]";
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}
	public int getId() {
		return ID;
	}

	public void setId(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList();
		
		Student s1 =new Student();
		
		s1.setBranch("Mechaanical");
		s1.setId(1);
		s1.setName("Nikhil");
		
		System.out.println(s1.getName());
		System.out.println(s1.getId());
		System.out.println(s1.getBranch());
		
		System.out.println("---------------------------------");
		
        Student s2 = new Student();
	
		s2.setBranch("Eliectrical");
		s2.setId(2);
		s2.setName("Shubham");
		
		System.out.println(s2.getName());
		System.out.println(s2.getId());
		System.out.println(s2.getBranch());
	
		System.out.println("---------------------------------");
        Student s3 = new Student();
		
		s3.setBranch("Cumputer Science");
		s3.setId(3);
		s3.setName("Sangram");
		
		
		
		System.out.println(s3.getName());
		System.out.println(s3.getId());
		System.out.println(s3.getBranch());
		
		System.out.println("---------------------------------");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		
		System.out.println("---------------------------------");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(Student o:al)
		{
			System.out.println();
		}
		
		
	}


	
	
}

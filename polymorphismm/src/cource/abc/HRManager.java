package cource.abc;

public class HRManager extends Employee{
	
	public void work()
	{
		System.out.println("i am working as a developer");
	}
	public void addEmployee()
	{
		System.out.println("i am a new employee");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E = new HRManager();
		E.work();
		E.getSalary();
	}

}

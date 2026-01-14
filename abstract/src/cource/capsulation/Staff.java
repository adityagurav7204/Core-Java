package cource.capsulation;

public class Staff {
	
	private String name;
	private int id;
	private String department;
	private String designation;
	
	public void setName(String Name)
	{                                                           
		String  name = Name ;
	}
	public void setRoll(int id)
	{
		this.id= id;
		
	}
	public void setDepartment(String departmnt)
	{
		this.department= department;
	}
	public void setdesignation(String designation)
	{
		this.designation=designation;
	}
		
		public String getName()
		{
			return name;
		}
		public int getid()
		{
			return id;
		}
		public String getDepartment()
		{
			return department;
		}
		public String getDesignation()
		{
			return designation;
		}
	

}

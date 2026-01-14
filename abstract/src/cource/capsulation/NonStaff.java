package cource.capsulation;

public class NonStaff {
	
	private String name;
	private int id;
	private String designation;
	
	public void setName(String Name)
	{                                                           
		String  name = Name ;
	}
	public void setRoll(int id)
	{
		this.id= id;
		
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
		public String getDesignation()
		{
			return designation;
		}

}

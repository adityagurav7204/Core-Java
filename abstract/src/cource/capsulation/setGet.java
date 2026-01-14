package cource.capsulation;

public class setGet {
	
	private String Name;
	private int rollNo;
	private long mobNo;
	private String eMail;
	
	public void setName(String name)
	{
		this.Name=name;
	}
	@Override
	public String toString() {
		return "setGet [Name=" + Name + ", rollNo=" + rollNo + ", mobNo=" + mobNo + ", eMail=" + eMail + "]";
	}
	
	public void setrollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public void setmobNo(long mobNo)
	{
		this.mobNo=mobNo;
	}
	public void seteMail(String eMail)
	{
		this.eMail=eMail;
	}
	
		public String getName()
		{
			return Name;
		}
		public int getrollNo()
		{
			return rollNo;
		}
		public long getmobNo()
		{
			return mobNo;
					
		}
		public String geteMail()
		{
			return eMail;
		}
			

}

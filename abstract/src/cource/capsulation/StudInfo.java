package cource.capsulation;

public class StudInfo {
	
	private String name;
	private int roll;
	private String stream;
	private String mail;
	private long mob;
	
	public void setName(String Name)
	{                                                           
		String  name = Name ;
	}
	public void setRoll(int roll)
	{
		this.roll= roll;
		
	}
	public void setStream(String stream)
	{
		this.stream= stream;
	}
	public void setMail(String mail)
	{
		this.mail=mail;
	}
	public void setMob(long mob)
	{
		this.mob=mob;
	}
		
		public String getName()
		{
			return name;
		}
		public int getRoll()
		{
			return roll;
		}
		public String getStream()
		{
			return stream;
		}
		public String getMail()
		{
			return mail;
		}
		public long getMob()
		{
			return mob;
		}
}

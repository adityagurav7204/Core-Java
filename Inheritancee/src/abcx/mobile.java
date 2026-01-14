package abcx;

public class mobile {
	
	int storage;
	String proccessor;
	String OS;
	String colour;
	int ram;
	
	public mobile()

	{
		storage=128;
		OS= "android";
		colour= "black";
		ram=8;
		
		System.out.println("Storage of phone: "+storage);
		System.out.println("Operating system of mobile :"+OS);
		System.out.println("Colour of mobile :"+colour);
	}

}

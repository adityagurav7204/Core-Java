package abcx;

public class multilevel_mobile {
	//we use multilevel inheritance for add the fearture with previous features
	
	int storage;
	String proccessor;
	String OS;
	String colour;
	int ram;
	
	public multilevel_mobile()

	{
		storage=128;
		OS= "android";
		colour= "black";
		ram=8;
		
		System.out.println("Storage capacity of mobile: "+storage);
		System.out.println("Operating system of mobile: "+OS);
		System.out.println("colour of mobile: "+colour);
	}

}

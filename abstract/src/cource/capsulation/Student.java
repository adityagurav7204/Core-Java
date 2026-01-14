package cource.capsulation;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setGet s = new setGet();
		s.setName("Aditya");
		s.setrollNo(23);
		s.setmobNo(9359527446l);
		s.seteMail("adityamgurav7204@gmail.com");
		
		System.out.println(s.getName());
		System.out.println(s.getrollNo());
		System.out.println(s.getmobNo());
		System.out.println(s.geteMail());
		
		System.out.println(s.toString());
	System.out.println("--------------------------------------------------");
		setGet s1 = new setGet();
		s1.setName("Shubham");
		s1.setrollNo(25);
		s1.setmobNo(8010100802l);
		s1.seteMail("shubhamgurav4422@gmail.com");
		
		System.out.println(s1.getName());
		System.out.println(s1.getrollNo());
		System.out.println(s1.getmobNo());
		System.out.println(s1.geteMail());
		
	   System.out.println(s1.toString());
		
	System.out.println("--------------------------------------------------");
		
		setGet s2 = new setGet();
		s2.setName("Sangram");
		s2.setrollNo(63);
		s2.setmobNo(9766052058l);
		s2.seteMail("sangramdhadam@gmail.com");
		
		System.out.println(s2.getName());
		System.out.println(s2.getrollNo());
		System.out.println(s2.getmobNo());
		System.out.println(s2.geteMail());
		
		System.out.println(s2.toString());
		

	}

}

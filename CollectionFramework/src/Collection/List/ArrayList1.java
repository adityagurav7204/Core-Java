package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;


public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Aditya");
		al.add("Shubham");
		al.add("Sangram");
		al.add("Rohit");
		al.add("Pratik");
		al.add("Karan");
		al.add("Tushar");

		System.out.println(al);

//		System.out.println(al.size());  //cread
//		System.err.println();
//		System.out.println(al.set(0, "Rahul"));  //update
//		System.out.println();
//		al.add(1, "Jitu");
//		System.out.println();
//		al.remove(0);
//		System.out.println();
//	    al.clear();  //clear all Elements
//		System.out.println();
//		
//		al.
//		
//		for(int i=0; i<al.size(); i++)
//		{
//			System.out.println(al.get(i));
//		}
//		
//		System.out.println();
//		al.clone();  //
		
	    int a =	al.indexOf("Rohit");
	    System.out.println(a);
	    
	  Iterator itr = al.iterator();
	  
	  while(itr.hasNext())
	  {
		  Object o = itr.next();
		  System.out.println(o);
	  }
	  
	    

	}

}

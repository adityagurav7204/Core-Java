package Collection.List;

import java.util.Iterator;
import java.util.LinkedList;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1 = new LinkedList();
		
		l1.add("Sangram");
		l1.add(23);
		l1.add('a');
		l1.add("Shubham");
		l1.add("abc");
		
		System.out.println(l1);
		
		System.out.println();
		
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		
		System.out.println();
		
		l1.set(1, "Shubham");  //to print linkedlist
		System.out.println(l1); //to update specific object
		l1.remove(2);			//to remove specific object
		System.out.println(11);
		
		System.out.println();
		
		Iterator itr =l1.iterator();
		
		while(itr.hasNext())
		{
			Object o = itr.next();
            System.out.println(o);
		}
		
		
		

	}
	

}

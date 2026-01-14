package Collection.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList Kabaddi = new LinkedList();
		Kabaddi.add("Dipak");
		Kabaddi.add("Monu");
		Kabaddi.add("Navee");
		
		Stack WomenCricketer = new Stack();
		WomenCricketer.add("Harleen");
		WomenCricketer.add("Mitali");
		WomenCricketer.add("Smriti");
		
		Vector MenCricketer = new Vector();
		MenCricketer.add("Rohit");
		MenCricketer.add("Buttler");
		MenCricketer .add("Simons");
		
		List ListForVisa = new LinkedList();
		ListForVisa.addAll(Kabaddi);		
		ListForVisa.addAll(WomenCricketer);		
		ListForVisa.addAll(MenCricketer);	
		
		System.out.println(ListForVisa);
		
		
	//	Iterator itr = List.iterator();

	}

}

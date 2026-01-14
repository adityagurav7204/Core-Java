package com.collectionn;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>fruit = new ArrayList<>();
		fruit.add("Mango");
		fruit.add("banana");
		fruit.add("Guava");
		fruit.add("Apple");
		fruit.add("Pinapple");
		fruit.add(null);
		
		
		System.out.println("List of fruits is :"+fruit);
	}

}

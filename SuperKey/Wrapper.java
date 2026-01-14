package com.SuperKey;

public class Wrapper {

	public static void main(String[] args) {
		int a = 10;
		// Converting primitive to object (Boxing)
		Integer obj = Integer.valueOf(a);// Explicite unboxing
			Integer autoBox = a;         // Auto-unboxing
			
			// Converting  object  to primitive (Unboxing)
			int b = obj.intValue(); // Explicite unboxing
			int autoUnbox = obj;    // Auto-unboxing
			
			System.out.println("Object :"+obj);
			System.out.println("Primitive :"+b);
			
	}

}

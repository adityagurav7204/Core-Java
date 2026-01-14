package com.Interface13;

public interface Animal {
	public void speak();

}
class Dog implements Animal
{

	@Override
	public void speak() {
		System.out.println("Dog is barking");
		
	}
	
}


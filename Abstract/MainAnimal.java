package com.Abstract;

public class MainAnimal {

	public static void main(String[] args) {
		Animal dg = new Dog();
		dg.eat();
        dg.makeSound();

        Animal ct = new Cat();
        ct.eat();
        ct.makeSound();
	}

}

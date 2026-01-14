package com.couplingg;

class Car {
    CouplingDemo obj = new CouplingDemo();
    
    public void info() {
        obj.display();
    }
}

public class CouplingDemo {
	
    public void display() {
        System.out.println("This is example of tight coupling");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.info();
    }
}

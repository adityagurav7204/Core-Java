package com.Interfacee;

public class Jio implements Sim{

	public static void main(String[] args) {
		Jio sim = new Jio();
		sim.calling();
		sim.data();
		
	}

	@Override
	public void calling() {
		System.out.println("jio providing you free calling for 40 days");
		
	}

	@Override
	public void data() {
		
		System.out.println("jio providing you free 2GB data for 10 days");
		
	}

}

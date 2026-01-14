package com.Interfacee;

public class Airtel implements Sim {

	public static void main(String[] args) {
		Airtel sim = new Airtel();
		sim.calling();
		sim.data();

	}

	@Override
	public void calling() {
		
		System.out.println("Airtel providing free calling for 10 days");
	}

	@Override
	public void data() {
		System.out.println("Airtel providing free 2 GB data");
		
	}

}

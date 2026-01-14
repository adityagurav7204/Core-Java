package com.threading;

public class Mythread extends Thread {
	
	public void run()
	{
		System.out.println("this is my thread created...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread th = new Mythread();
		th.start();
		

	}

}

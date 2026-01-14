package com.threading;

public class Even extends Thread {
	
	public void run()
	{
		for(int i=2; i<=20; i++)
		{
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Even th = new Even();
        th.start();
	}

}

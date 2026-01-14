package multithread.cource;

public class Serial extends Thread {
	
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("serial numbers="+i);
		}
	}

}

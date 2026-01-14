package multithread.cource;

public class Reverse implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=10; i>=1; i--)
		{
			System.out.println("reverse numbers="+i);
		}
	}

}


package multithread.cource;

public class Current extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(Thread.currentThread().getName().equals("Thread-1"))
		{
			for(int i=0; i<=10; i++)
			{
				System.out.println(Thread.currentThread().getName()+"->"+i);
			}
		}
		
	}

	public static void main(String[] args) {
		
		Current t1 = new Current();
		Current t2 = new Current();
		t1.start();
		t2.start();
		
		
	}

	

}

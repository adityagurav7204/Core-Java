package multithread.cource;

class Rev11 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=10; i>=1; i--)
		{
			//System.out.println("reverse numbers="+i);
			
			Thread t = Thread.currentThread();
			String s = t.getName();
			//long s= t.getId();
			System.out.println("id:"+s+" :: "+i);
		}
	}
	
}
public class ThreadRev11 {

	public static void main(String[] args) {
		
		Rev11 rv = new Rev11();
		Thread th11 = new Thread(rv);
		Thread th111 = new Thread(rv);
		
		th11.start();
		th111.start();
		
	}

}

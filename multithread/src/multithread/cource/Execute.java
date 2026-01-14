package multithread.cource;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reverse r = new Reverse();
		Thread t = new Thread(r);
		t.start();
		
		
		Serial s = new Serial();
		s.start();
		
	}

}

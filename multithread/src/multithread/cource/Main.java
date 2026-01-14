package multithread.cource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Run r = new Run();
		Run r1 = new Run();
		Run r2 = new Run();
			r.start();
			r1.start();
			r2.start();
		
	}

}

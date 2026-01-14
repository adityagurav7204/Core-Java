package clg.program;

import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a side:");
		int a = s.nextInt();

		
		int c= a*a;
		System.out.println("area of square is:"+c);
	}

}

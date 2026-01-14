package clg.program;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Length:");
		int l = s.nextInt();
		System.out.println("Enter a breadth:");
		int b = s.nextInt();
		
		int c=l*b;
		System.out.println("Area of rectangle is:"+c);

	}

}

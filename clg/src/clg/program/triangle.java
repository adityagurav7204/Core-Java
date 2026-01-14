package clg.program;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of base:");
		int b = s.nextInt();
		System.out.println("Enter a value of height:");
		int h = s.nextInt();
		
		double a = 0.5*b*h;
		System.out.println("area of triangle is:"+a);
	}

}

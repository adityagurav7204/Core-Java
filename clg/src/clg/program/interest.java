package clg.program;

import java.util.Scanner;

public class interest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the principle amount:");
		double p = s.nextInt();
		
		System.out.println("Enter the interst rate:");
		double r = s.nextInt();
		
		System.out.println("Enter the time period:");
		double t = s.nextInt();
		
		double i =(p*r*t)/100;
		System.out.println("the simple interest is:"+i);
	}
}

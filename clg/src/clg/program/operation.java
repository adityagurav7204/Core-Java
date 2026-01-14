package clg.program;

import java.util.Scanner;

public class operation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = s.nextInt();
		int x =a*a*a;
		System.out.println("cube of given number is:"+x);
		
		System.out.println("Enter a number:");
		int b = s.nextInt();
		int y = b*b;
		System.out.println("Square of given number is:"+y);
		
		
	}

}

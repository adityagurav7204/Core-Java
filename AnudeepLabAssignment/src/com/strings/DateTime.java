package com.strings;

import java.text.SimpleDateFormat;
import java.util.Date;

//Q.2Write a Java program to print the current date and time in the specified format.

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));
		
	    
	}

}

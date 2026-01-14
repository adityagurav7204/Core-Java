package com.sgm.entity;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Library");
		while(true)
		{
		 System.out.println("Press 1 to insert book ");
		 System.out.println("Press 2 to read book ");
		 System.out.println("press 3 to delete book ");
		 System.out.println("press 4 to update book ");
		 System.out.println("press any number to exit ");
		 System.out.println("Enter your choice");
		
		 int a = sc.nextInt();
		
		
		 if(a==1) {
			// insert data into database
			 System.out.println("Please enter BookName,Author,Price");
			 Book book = new Book(sc.next(),sc.next(),sc.nextInt());
			 DaoLayer.insertBook(book);
		 }
		 else if(a==2) {
			// read book
			 System.out.println("Enter id which you want to read");
			 DaoLayer.readbook(sc.nextInt());
			 
		 }
		 else if(a==3) {
			//delete book
			 System.out.println("enter id you want to delete");
			 int n= sc.nextInt();
			boolean b= DaoLayer.deletebook(n);
			 if(b)
			 {
				 System.out.println("Data deleted");
			 }
			 else {
				 System.out.println("Something went wrong");
			 }
		 }
		 else if(a==4) {
			DaoLayer.updatebook();
		 }
		 else {
		 	break;
		 }
		}
			
			
		
			
		}
}

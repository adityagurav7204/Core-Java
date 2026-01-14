package com.collectionn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LastExample2 {
	public static void main(String[] args) {
		List<String> books = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("----Library menu----");
			System.out.println("1. Add Book");
			System.out.println("2. Show Books");
			System.out.println("3. Exit");
			System.out.println("Choose option");

			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			if (choice == 1) {
				System.out.println("Enter book title");
				String title = sc.nextLine();
				books.add(title);
				System.out.println("Book added");
			} else if (choice == 2) {
					System.out.println("\nBooks in library:");
					for (int i = 0; i < books.size(); i++) {
						System.out.println((i + 1) + "," + books.get(i));
					}
					if (books.isEmpty()) {
						System.out.println("No books Available");
					} 
			} else if (choice == 3) {
				System.out.println("Exiting ...GoodBye!");
				break;
			} else {
				System.out.println("Invalid choice");
			}
		}

		sc.close();
	}
}

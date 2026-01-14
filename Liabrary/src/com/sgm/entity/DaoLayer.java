package com.sgm.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DaoLayer {
	static boolean b;

	public static void insertBook(Book book) {
		String q = "insert into books(name,author,price) value(?,?,?)";
		Connection con = ConnectionProvider.createConnection();

		try {

			PreparedStatement ps = con.prepareStatement(q);

			ps.setString(1, book.getBookName());
			ps.setString(2, book.getAuthor());
			ps.setInt(3, book.getPrice());

			ps.execute();
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		System.out.println("Book Inserted");

	}

	public static void readbook(int i) {
		Connection con = ConnectionProvider.createConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from books where id=?");
			ps.setInt(1, i);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String author = rs.getString("author");
				int price = rs.getInt("price");
				Book b = new Book(id, name, author, price);
				System.out.println(b);
			}
			ps.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static boolean deletebook(int i) {
		Connection con = ConnectionProvider.createConnection();
		try {
			PreparedStatement ps = con.prepareStatement("delete from books where id=?");
			ps.setInt(1, i);

			b = ps.execute();
			b = true;
			con.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return b;

	}

	public static void updatebook() {
		Scanner sc = new Scanner(System.in);
		Connection con = ConnectionProvider.createConnection();
		try {
			PreparedStatement ps = con.prepareStatement("update books set price=? where id=?");
			System.out.println("Enter Book ID :");
			int id = sc.nextInt();

			System.out.println("Enter Book Price :");
			int p = sc.nextInt();
			ps.setInt(1, p);
			ps.setInt(2, id);
			ps.execute();
			System.out.println("Record Update Successfully :");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}

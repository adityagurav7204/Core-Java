package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connection1 {

	public static void main(String[] args) {

		String s = "insert into student values (2,'shubham','shamgaon')";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "aditya@7204");
			

			Statement stmt = con.createStatement();
			stmt.execute(s);

			System.out.println("Connection established");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

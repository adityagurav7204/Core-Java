package com.sgm.entity;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	 static Connection con;
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
      	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryManagment","root", "aditya@7204");
			

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
	}
	
}

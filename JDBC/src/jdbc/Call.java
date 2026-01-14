package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Call {

	public static void main(String[] args) {
		
      Fruit f = new Fruit();
      String s ="insert into Fruit values(?,?,?,?)";
      System.out.println("data inserted successfully");
      
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "aditya@7204");
			PreparedStatement pstmt = con.prepareStatement(s);
			
			
			PreparedStatement ps = con.prepareStatement("select * from Fruit where Id=?");
			ps.setInt(1, 21);
			
			f.setId(21);
			f.setName("Mango");
			f.setColour("Yellow");
			f.setTaste("Yummy");
			
			pstmt.setInt(1,f.getId());  
			pstmt.setString(2,f.getName());  
			pstmt.setString(3,f.getColour());  
			pstmt.setString(4,f.getTaste());
			
			pstmt.executeQuery();
			
		} catch (Exception e) {

			e.printStackTrace();
		}



	}

	private static String getTaste() {
		// TODO Auto-generated method stub
		return null;
	}

}

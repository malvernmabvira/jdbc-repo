package com.luve.mysql;

import java.sql.*;

public class MySQL_Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms?useSSL=false", "root", "*****");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from students");
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String surname = rs.getString(3);
				String email = rs.getString(4);
				String country = rs.getString(5);
				
				
				System.out.println(id + " : " + name + " : "
				+ surname + " : " + surname + " : " + country);
				
				
			}
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

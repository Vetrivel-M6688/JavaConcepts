package com.dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBCConnection1 {

	@Test
	public void getDatabase() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");  // 1. Mention the Type
		
		Connection connection1 = DriverManager.getConnection("jdbc:mysql://root@localhost/testdatabase1");
		
		Statement statement1= connection1.createStatement();
		
		ResultSet resultSet1 = statement1.executeQuery("SELECT *FROM persondetails");
		
		while(resultSet1.next()) {
			System.out.println(resultSet1.getInt(1)+" "+resultSet1.getString(2)+" "+resultSet1.getInt(3)
						+" "+resultSet1.getFloat(4)+" "+resultSet1.getInt(5));
		}
	}
}

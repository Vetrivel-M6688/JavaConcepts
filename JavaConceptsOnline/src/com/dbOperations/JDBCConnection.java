package com.dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		// jdbc:mysql://localhost:3306/dbname?serverTimezone=UTC
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/testdatabase");

		Statement statement = connection.createStatement();

		ResultSet result = statement.executeQuery("SELECT * FROM testdatatable");

		while (result.next()) {
			System.out.println("EMP ID: " + result.getString(1) + ">>" + "EMP NAME: " + result.getString(2));
		}

	}

}

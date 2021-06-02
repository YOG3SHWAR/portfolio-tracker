package com.portfolio.utils;

import java.sql.*;
import java.util.ResourceBundle;

public class GetConnection {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;

	public static Connection getMySQLConn() {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		driver = rb.getString("driver");
		url = rb.getString("url");
		username = rb.getString("username");
		password = rb.getString("password");

		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

}
package com.lyh.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/webip";
		String username = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url, username,
				password);
		return connection;
	}

	/**
	 * Connection ,ResultSet ,Statement 都实现了 AutoCloseable 接口 而
	 * PreparedStatement 继承了 Statement ,所以可以直接写父类发生多态,进行关闭资源
	 */
	public static void close(AutoCloseable obj) {
		if (obj != null) {
			try {
				obj.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// public static void close(Connection connection) {
	// if (connection != null) {
	// try {
	// connection.close();
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	//
	// public static void close(ResultSet connection) {
	// if (connection != null) {
	// try {
	// connection.close();
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	//
	// public static void close(Statement connection) {
	// if (connection != null) {
	// try {
	// connection.close();
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// }
	// }
}

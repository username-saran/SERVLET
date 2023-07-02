package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static Connection connection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saran");
        return conn;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(Connect.connection());
	}
}

package com.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updation {
	public static int updation(String uname,String pword) throws ClassNotFoundException, SQLException {
		Connection connection = Connect.connection();
		PreparedStatement stmt = connection.prepareStatement("update people set USERNAME = ? where USERNAME = ?  AND PASSWORD = ?");
		stmt.setString(1, uname);
		stmt.setString(2, uname);
		stmt.setString(3, pword);
		return stmt.executeUpdate();
		
		
	}
}

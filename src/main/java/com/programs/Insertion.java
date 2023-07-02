package com.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertion {
	public static int insertion(String u1,String p1) throws ClassNotFoundException, SQLException {
		Connection connection=  Connect.connection();
		PreparedStatement preparedStatement = connection.prepareStatement("insert into people values (?,?)");
		preparedStatement.setString(1, u1);
		preparedStatement.setString(2, p1);
		return preparedStatement.executeUpdate();
		
	}
}

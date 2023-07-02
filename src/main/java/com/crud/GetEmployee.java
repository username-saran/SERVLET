package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.programs.Connect;

public class GetEmployee {
	public static Employee getEmployeeById(String id) throws ClassNotFoundException, SQLException {
		Connection connection = Connect.connection();
		Employee employee = null;
		PreparedStatement preparedStatement = connection.prepareStatement("select * from employees where EMPLOYEE_ID = ?");
		preparedStatement.setString(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			employee = new Employee(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
		}
		return employee;
	}
}

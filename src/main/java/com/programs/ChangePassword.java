package com.programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/changePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassword() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static int updatePassword(String uname,String opword,String npword) throws ClassNotFoundException, SQLException {
    	Connection connection =  Connect.connection();
    	PreparedStatement preparedStatement = connection.prepareStatement("update people set PASSWORD = ? where USERNAME = ? AND PASSWORD = ?");
    	preparedStatement.setString(1, npword);
    	preparedStatement.setString(2,uname);
    	preparedStatement.setString(3, opword);
    	
		return preparedStatement.executeUpdate();
		
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname = request.getParameter("uname");
		String opword = request.getParameter("opword");
		String npword = request.getParameter("npword");
		String rnpword = request.getParameter("rnpword");
		PrintWriter printWriter = response.getWriter();
		try {
			int count = Updation.updation(uname, opword);
			if(count==1 && npword.equals(rnpword)) {
				int n = updatePassword(uname, opword, rnpword);
				if(n==1) {
					response.sendRedirect("http://localhost:9091/ServletDemo/login.html");
				}
				else {
					printWriter.print("Please Check Username and Password");
				}
			}
			printWriter.print("Please Check Username and Password");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

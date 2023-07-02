package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StudentPrint
 */
@WebServlet("/StudentPrint")
public class StudentPrint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentPrint() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String sid=(String)session.getAttribute("Student_ID");
		String name=(String)session.getAttribute("Student_Name");
		String dob=(String)session.getAttribute("Student_DOB");
		out.print("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "     <meta charset=\"UTF-8\">\r\n"
				+ "     <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "     <title>Document</title>\r\n"
				+ "     <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n"
				+ "     <style>\r\n"
				+ "          body{\r\n"
				+ "               background-image: linear-gradient(rgb(8, 94, 109),lightblue);\r\n"
				+ "               background-position: center;\r\n"
				+ "               background-repeat: no-repeat;\r\n"
				+ "               background-attachment: fixed;\r\n"
				+ "          }\r\n"
				+ "          .container{\r\n"
				+ "               padding: 15px;\r\n"
				+ "               width: 65%;\r\n"
				+ "               border-radius: 15px;\r\n"
				+ "               margin-top: 75px;\r\n"
				+ "               background-color: white;\r\n"
				+ "          }\r\n"
				+ "     </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "     <div class=\"container\">\r\n"
				+ "          <div class=\"row\">\r\n"
				+ "               <div class=\"col\">\r\n");
		if(session!=null) {
			out.print("<center><h1>Hello, Welcome Back</h1></center>\r\n"
					+ "                         <center><h2>Hello "+name+"</h2></center> <br>\r\n"
					+ "                         <center><h2>Your ID is "+sid+"</h2></center> <br>\r\n"
					+ "                         <center><h2>Your Date of Birth is "+dob+"</h2></center> <br>");
		}
		out.print("</div>\r\n"
				+ "          </div>\r\n"
				+ "     </div>\r\n"
				+ "     <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}

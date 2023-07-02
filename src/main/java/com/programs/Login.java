package com.programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		try {
			PrintWriter outPrintWriter = response.getWriter();
			int count = Updation.updation(uname, pword);
			if(count==1) {
				 outPrintWriter.print("<!DOCTYPE html>\r\n"
				 		+ "<html lang=\"en\">\r\n"
				 		+ "<head>\r\n"
				 		+ "     <meta charset=\"UTF-8\">\r\n"
				 		+ "     <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				 		+ "     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				 		+ "     <title>Home</title>\r\n"
				 		+ "     <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n"
				 		+ "     <style>\r\n"
				 		+ "          body{\r\n"
				 		+ "               background-image: linear-gradient(darkgrey,lightblue);\r\n"
				 		+ "               background-position: center;\r\n"
				 		+ "               background-repeat: no-repeat;\r\n"
				 		+ "               background-attachment: fixed;\r\n"
				 		+ "          }\r\n"
				 		+ "          .container{\r\n"
				 		+ "               border-radius: 10px;\r\n"
				 		+ "               width: 90%;\r\n"
				 		+ "               padding: 20px;\r\n"
				 		+ "               margin-top: 20px;\r\n"
				 		+ "               background-color: white;\r\n"
				 		+ "          }\r\n"
				 		+ "          .para{\r\n"
				 		+ "               text-align: justify;\r\n"
				 		+ "          }\r\n"
				 		+ "     </style>\r\n"
				 		+ "</head>\r\n"
				 		+ "<body>\r\n"
				 		+ "     <div class=\"container\">\r\n"
				 		+ "          <div class=\"row\">\r\n"
				 		+ "               <div class=\"col-8 para\">\r\n"
				 		+ "                    <h2>Hello World</h2>\r\n"
				 		+ "                    <h3>Welcome To Home Page</h3>\r\n"
				 		+ "                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Nam velit iusto, deleniti quibusdam omnis, minus vitae, sint optio recusandae delectus architecto unde temporibus molestias! Alias, eius. Molestiae numquam quam asperiores, assumenda maiores repellendus veritatis praesentium iure. Quae repudiandae eaque qui amet, nam quas repellat vel, suscipit necessitatibus distinctio natus perferendis animi. Ipsa dignissimos provident reprehenderit recusandae non facere porro repudiandae architecto odit assumenda, velit impedit distinctio deserunt harum hic molestiae ad expedita veniam consequuntur dolor unde sit voluptatum nisi. Deserunt mollitia, vel minima molestiae voluptas sed excepturi fugiat sunt magnam nobis unde eum neque nulla error, fugit asperiores! Voluptatem magnam excepturi quis exercitationem error alias numquam reprehenderit illum fuga ut aut culpa eius quaerat, eum ab quia dolore nulla nemo dolores quo, quod libero. Totam, in sunt. Consequuntur totam iure ut neque modi culpa, laborum asperiores vero officia doloribus quae debitis! Reprehenderit iste quibusdam tenetur laboriosam itaque nemo vitae porro accusamus deserunt natus. Quis tempore amet aut est natus similique eius odit eaque? Assumenda nesciunt aliquid recusandae exercitationem voluptatibus iusto doloremque a aliquam unde quo repellendus laudantium similique, harum facere magni culpa pariatur sint dolor quidem magnam saepe. Excepturi sed neque eveniet asperiores eum fugit, sapiente ab harum aperiam exercitationem!\r\n"
				 		+ "               </div>\r\n"
				 		+ "\r\n"
				 		+ "               <div class=\"col\">\r\n"
				 		+ "                    <h5>Username : <br>"+uname+"</h5>\r\n"
				 		+ "                    <div class=\"para\">\r\n"
				 		+ "                         \r\n"
				 		+ "                         <br>\r\n"
				 		+ "                         <br>\r\n"
				 		+ "                         Lorem ipsum dolor sit amet consectetur adipisicing elit. Eius, culpa sequi atque placeat animi harum, accusamus laborum alias impedit corrupti aspernatur reiciendis ad ratione obcaecati facere adipisci saepe rem quia corporis sunt! Ducimus repellat magnam maxime voluptate, aliquid mollitia ullam dignissimos! Eos laboriosam vitae dignissimos ipsam aut maiores obcaecati quasi!\r\n"
				 		+ "                    </div>\r\n"
				 		+ "               </div>\r\n"
				 		+ "          </div>\r\n"
				 		+ "          <div class=\"row\">\r\n"
				 		+ "               <h1 align=\"center\">Thank you for login</h1>\r\n"
				 		+ "          </div>\r\n"
				 		+ "     </div>\r\n"
				 		+ "     \r\n"
				 		+ "     <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n"
				 		+ "</body>\r\n"
				 		+ "</html>");
			}
			else {
				outPrintWriter.print("Please Enter Your User Name and Password Correctly");
			}
			
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

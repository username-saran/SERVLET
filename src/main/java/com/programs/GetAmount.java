package com.programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetAmount
 */
@WebServlet("/getAmount")
public class GetAmount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAmount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		long time_difference;
		long days_difference = 0;
		int amt = 0;
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String phn = request.getParameter("phn");
		String checkIN = request.getParameter("checkIN");
		String checkOUT = request.getParameter("checkOUT");
		String acString = request.getParameter("AC");
		String type = request.getParameter("type");
		SimpleDateFormat obj = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date date1 = obj.parse(checkIN);   
            Date date2 = obj.parse(checkOUT);
            time_difference = date2.getTime() - date1.getTime(); 
            days_difference = (time_difference / (1000*60*60*24)) % 365;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(days_difference);
		if(acString.equals("AC")) {
			if(type.equals("Single")) {
				amt = (int) (days_difference*2000);
			}
			else if(type.equals("Double")) {
				amt = (int) (days_difference*4000);
			}
		}
		else if(acString.equals("NON")) {
			if(type.equals("Single")) {
				amt = (int) (days_difference*500);
			}
			else if(type.equals("Double")) {
				amt = (int) (days_difference*1000);
			}
		}
		out.println("________________________________\n");
		out.println("BILL");
		out.println("Your Days: "+days_difference);
		out.println("Amount for your booking: "+amt);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

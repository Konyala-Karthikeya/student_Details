package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAO;
import com.dto.Student;

@WebServlet("/GetAllStds")
public class GetAllStds extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		StudentDAO stdDao = new StudentDAO();		
		List<Student> stdList = stdDao.getAllStudents();
		
		RequestDispatcher rd = request.getRequestDispatcher("TeacHomePage.jsp");
		rd.include(request, response);
		
		out.println("<center>");
		
		if (stdList != null) {
			
			out.println("<table border=2>");
			
			out.println("<tr>");
			out.println("<th>StdId</th>");
			out.println("<th>StdName</th>");
			out.println("<th>Batch</th>");
			out.println("<th>Gender</th>");
			out.println("<th>Email-Id</th>");
			out.println("</tr>");
			
			for (Student std : stdList) {
				out.println("<tr>");
				out.println("<td>" + std.getStdId()   + "</td>");
				out.println("<td>" + std.getStdName() + "</td>");
				out.println("<td>" + std.getBatch()  + "</td>");
				out.println("<td>" + std.getGender()  + "</td>");
				out.println("<td>" + std.getEmailId() + "</td>");
				out.println("</tr>");
			}
			
			out.println("</table>");			
		
		} else {			
			out.println("<h1 style='color:red;'>Unable to Fetch the Student Record(s)!!!</h1>");	
		}
		out.println("</center>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

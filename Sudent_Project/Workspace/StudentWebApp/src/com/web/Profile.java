package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Student;

@WebServlet("/Profile")
public class Profile extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		Student std = (Student) session.getAttribute("std");
		
		//RequestDispatcher rd = request.getRequestDispatcher("EmpHomePage");
		//rd.include(request, response);
		
		//OR
		
		request.getRequestDispatcher("StdHomePage.jsp").include(request, response);
		
		out.println("<table border='2' align='center'>");

		out.println("<tr>");
		out.println("<th>StdId</th>");
		out.println("<th>StdName</th>");
		out.println("<th>Batch</th>");
		out.println("<th>Gender</th>");
		out.println("<th>Email-Id</th>");
		out.println("<th>Password</th>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + std.getStdId()   + "</td>");
		out.println("<td>" + std.getStdName() + "</td>");
		out.println("<td>" + std.getBatch()  + "</td>");
		out.println("<td>" + std.getGender()  + "</td>");
		out.println("<td>" + std.getEmailId() + "</td>");
		out.println("<td>" + std.getPassword()+ "</td>");
		out.println("</tr>");

		out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
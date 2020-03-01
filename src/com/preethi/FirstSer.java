package com.preethi;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstSer extends HttpServlet{
	//doGet, doPost

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("fname");
		String lastname= req.getParameter("lname");
		String fullname= firstname + lastname;
		req.setAttribute("name", fullname);
		RequestDispatcher despacher = req.getRequestDispatcher("ghg.jsp");

	}
}

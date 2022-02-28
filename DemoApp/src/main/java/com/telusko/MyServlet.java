package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws IOException {
		
		PrintWriter out = rep.getWriter();
		out.print("Hi ");
		
		ServletContext ctx = getServletContext();
		// les valeurs du contexte sont partagé entre tte les servlets, Phone..
		String str = ctx.getInitParameter("Phone");
		out.println(str);
		
		
	}
}

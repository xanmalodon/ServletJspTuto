package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		System.out.println("la r�ponse vaut "+ k);// affiche dans la console
		
		PrintWriter out = res.getWriter();
		out.println("la r�ponse vaut "+ k);
	}
}

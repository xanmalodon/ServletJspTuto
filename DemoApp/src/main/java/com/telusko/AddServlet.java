package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));// request est donné par default
		int j = Integer.parseInt(req.getParameter("num2"));// request est donné par default
		
		int k = i + j;
		
		System.out.println("la réponse vaut "+ k);// affiche dans la console
		
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='cyan'>");
		out.println("output "+ k);
		out.println("</body></html>");
		
	}
	
}

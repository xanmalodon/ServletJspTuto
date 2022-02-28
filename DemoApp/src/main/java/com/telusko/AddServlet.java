package com.telusko;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		System.out.println("la réponse vaut "+ k);// affiche dans la console
		
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		
//		PrintWriter out = res.getWriter();
//		out.println("la réponse vaut "+ k);
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		res.sendRedirect("sq"); // URL Rewriting ici, on passe par le navigateur

		
	}
	
}

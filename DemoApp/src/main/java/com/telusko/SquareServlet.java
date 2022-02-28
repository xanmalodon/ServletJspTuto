package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// on utilise generalement k pour maintenir les sessions
		
		HttpSession session = req.getSession(); 
		int k = (int) session.getAttribute("k");
		session.removeAttribute("k");

		PrintWriter out = res.getWriter();
		out.println("Le resulat du carre de la somme vaut "+k*k);
	}
}

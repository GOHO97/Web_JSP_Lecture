package com.ho.js.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSMain")
public class JSMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JSMain() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		response.setCharacterEncoding("euc-kr");
		
		String a = request.getParameter("test");
		
		PrintWriter pw = response.getWriter();
		
		pw.print("<html><head><meta charset=\"euc-kr\">");
		pw.print("<style type=\"text/css\">");
		pw.print("</style>");
		pw.print("</head><body>");
		pw.print("<h1>¤¾¤·</h1>");
		pw.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

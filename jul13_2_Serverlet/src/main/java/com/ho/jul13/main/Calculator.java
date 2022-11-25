package com.ho.jul13.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Calculator() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");
		
		int a = Integer.parseInt(request.getParameter("aaa"));
		int b = Integer.parseInt(request.getParameter("bbb"));
		
		PrintWriter pw = response.getWriter();
		pw.print("<html><head><meta charset=\"euc-kr\"></head><body>");
		pw.print("<table border=\"1\">");
		pw.printf("<tr><td>%d + %d = %d</td></tr>", a, b, a + b);
		pw.printf("<tr><td>%d - %d = %d</td></tr>", a, b, a - b);
		pw.printf("<tr><td>%d * %d = %d</td></tr>", a, b, a * b);
		pw.printf("<tr><td>%d / %d = %d</td></tr>", a, b, a / b);
		pw.print("</table>");
		pw.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

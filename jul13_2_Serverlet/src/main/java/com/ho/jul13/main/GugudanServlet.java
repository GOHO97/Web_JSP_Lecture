package com.ho.jul13.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GugudanServlet")
public class GugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public GugudanServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");
		PrintWriter pw = response.getWriter();
		pw.print("<html><head><meta charset=\"euc-kr\"><style type=\"text/css\">table{float:left;}</style></head><body>");
		for (int dan = 2; dan < 10; dan++) {
			pw.print("<table border=\"1\">");
			pw.printf("<tr><th>%d´Ü</th></tr>", dan);
			for (int i = 1; i < 10; i++) {
				pw.printf("<tr><td>%d X %d = %d</td></tr>",dan, i, dan * i);
			}
			pw.print("</table>");
		}
		pw.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}

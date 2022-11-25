package com.ho.jul13.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Gugudan2")
public class Gugudan2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Gugudan2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setCharacterEncoding("euc-kr");
		int dan = Integer.parseInt(request.getParameter("dan"));
		String color = (request.getParameter("color"));
		String cmtcmt = request.getParameter("cmt");

		PrintWriter pw = response.getWriter();
		pw.printf("<html><head><meta charset=\"euc-kr\"><style type=\"text/css\">table{float:left; color:%s;}</style></head><body>", color);
		pw.printf("<h1>%s</h1>", cmtcmt);
		pw.print("<table border=\"1\">");
		pw.printf("<tr><th>%d´Ü</th></tr>", dan);
		for (int i = 1; i < 10; i++) {
			pw.printf("<tr><td>%d X %d = %d</td></tr>", dan, i, dan * i);
		}
		pw.print("</table>");
		pw.print("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setCharacterEncoding("euc-kr");
		int dan = Integer.parseInt(request.getParameter("dan"));
		String color = (request.getParameter("color"));
		String cmtcmt = request.getParameter("cmt");
		
		PrintWriter pw = response.getWriter();
		pw.printf("<html><head><meta charset=\"euc-kr\"><style type=\"text/css\">table{float:left; color:%s;}</style></head><body>", color);
		pw.printf("<h1>%s</h1>", cmtcmt);
		pw.print("<table border=\"1\">");
		pw.printf("<tr><th>%d´Ü</th></tr>", dan);
		for (int i = 1; i < 10; i++) {
			pw.printf("<tr><td>%d X %d = %d</td></tr>", dan, i, dan * i);
		}
		pw.print("</table>");
		pw.print("</body></html>");
	}

}

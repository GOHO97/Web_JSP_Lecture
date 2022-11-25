package com.ho.inputOutputMain;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/IOMain")

public class IOMain extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");
		response.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pwpw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String addr = request.getParameter("address");
		String[] hobby = request.getParameterValues("hobby");
		String[] ride = request.getParameterValues("ride");
		String i = request.getParameter("introduce");
		i = i.replace("\r\n", "<br>");
		
		PrintWriter pw = response.getWriter();
		pw.print("<html><head><meta charset=\"euc-kr\">");
		pw.print("<style type=\"text/css\">");
		pw.print("</style>");
		pw.print("</head><body>");
		pw.printf("<h1>ID : %s</h1>", id);
		pw.printf("<h1>PW : %s</h1>", pwpw);
		pw.printf("<h1>성별 : %s</h1>", gender);
		pw.printf("<h1>주소 : %s</h1>", addr);
		if (hobby != null) {
			pw.print("<h1>취미 :");
			for (String h : hobby) {
				pw.print(" " + h);
			}
			pw.print("</h1>");
		}
		if (ride != null) {
			pw.print("<h1>");
			for (String r : ride) {
				pw.print(r + " ");
			}
			pw.print("타고 옴</h1>");
		} else {
			pw.print("<h1>집이 강남</h1>");
		}
		pw.print("</body></html>");
	}
}

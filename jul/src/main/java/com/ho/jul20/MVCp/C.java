package com.ho.jul20.MVCp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/C")
public class C extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!request.getParameterNames().hasMoreElements()) { //파라메터명이 없을 때
			request.getRequestDispatcher("V.html").forward(request, response);
		} else {
			M.getM().getBmi(request);
			request.getRequestDispatcher("V2.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

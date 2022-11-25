package com.ho.jul28.first;
// 회사 웹사이트 주소 뒤집어서.프로그램명.주제

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FController")
public class FController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.getRequestDispatcher("jsp/firstV.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

package com.ho.jul0721.mvc2;

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
		request.getRequestDispatcher("v1.jsp").forward(request, response);
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		M.makeData(request);
		M.printData(request);
		request.getRequestDispatcher("v2.jsp").forward(request, response);
	}

}

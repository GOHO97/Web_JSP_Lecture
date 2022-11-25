package com.ho.jul28.C2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ho.jul28.main.M1;

@WebServlet("/C2Controller")
public class C2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C2Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(M1.loginCheck(request)) {
			request.getRequestDispatcher("v3.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("v1.jsp").forward(request, response);
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

package com.ho.jul25.menu4;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/M4Controller")
public class M4Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public M4Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataMaker.make(request);
		request.setAttribute("contentPage", "menu4/jstlf.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

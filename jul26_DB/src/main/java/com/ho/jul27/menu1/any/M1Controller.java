package com.ho.jul27.menu1.any;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/M1Controller")
public class M1Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public M1Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		M1DAO.test(request);
		request.setAttribute("contentPage", "menu1/menu1.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

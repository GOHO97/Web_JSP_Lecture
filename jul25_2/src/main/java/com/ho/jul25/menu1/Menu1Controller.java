package com.ho.jul25.menu1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Menu1Controller")
public class Menu1Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Menu1Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("contentPage", "menu1/input.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calculator.getCalculator().calculate(request);
		request.setAttribute("contentPage", "menu1/output.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

}

package com.ho.jul26.menu2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WController")
public class WController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public WController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("contentPage", "menu2/write.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WmDAO.getWmDAO().write(request);
		WmDAO.getWmDAO().getBoardData(request);
		request.setAttribute("contentPage", "menu2/input.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

}

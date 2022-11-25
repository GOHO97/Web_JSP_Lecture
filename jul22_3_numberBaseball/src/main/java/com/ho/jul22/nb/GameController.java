package com.ho.jul22.nb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GameController")
public class GameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GameController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!request.getParameterNames().hasMoreElements()) {
			Engine.getEngine().reset();
			Engine.getEngine().pickNum();
			request.getRequestDispatcher("input.jsp").forward(request, response);
		} else {
			Engine.getEngine().checkEnd(request);
			Engine.getEngine().play(request);
			request.getRequestDispatcher("input.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

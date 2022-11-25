package com.ho.jul22.rsp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainController")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MainController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!request.getParameterNames().hasMoreElements()) {
			Referee.getRefree().resetScore();
			Referee.getRefree().showScore(request);
			request.getRequestDispatcher("input.jsp").forward(request, response);
		} else {
			Referee.getRefree().thinkCom(request);
			Referee.getRefree().startGame(request);
			Referee.getRefree().judge(request);
			Referee.getRefree().showScore(request);
			request.getRequestDispatcher("output.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

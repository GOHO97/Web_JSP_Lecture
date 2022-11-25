package com.ho.jul25.oddEven;

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
		if(!request.getParameterNames().hasMoreElements()) {
			Engine.getEngine().reset(request);
			request.setAttribute("contentPage", "menu2/input.jsp");
			request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
		} else {
			Engine.getEngine().operateE(request);
			Engine.getEngine().judge(request);
			request.setAttribute("contentPage", "menu2/input.jsp");
			if(Engine.getEngine().getGameCount() == 10) {
				Engine.getEngine().result(request);
				request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
			} else if(Engine.getEngine().getGameCount() < 10){
				request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
			} else {
				Engine.getEngine().reset(request);
				request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
			}
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

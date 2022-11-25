package com.ho.jul26.menu2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BoardContentPageController")
public class BoardContentPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardContentPageController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(WmDAO.getWmDAO().showBoardContent(request)) {
			request.setAttribute("contentPage", "menu2/content.jsp");
		} else {
			WmDAO.getWmDAO().getBoardData(request);
			request.setAttribute("contentPage", "menu2/input.jsp");
		}
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

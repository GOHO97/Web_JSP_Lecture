package com.ho.jul0721.mvc;

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
		Diary.getDiary().getToday(request);
		request.getRequestDispatcher("input.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Diary.getDiary().getToday(request);
			Diary.getDiary().getWeather(request);
			Diary.getDiary().getContent(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("output.jsp").forward(request, response);
	}

}

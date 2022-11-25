package com.ho.aug.anyany;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetHuman2")
public class GetHuman2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetHuman2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setHeader("Content-Type", "application/json;charset=utf-8");
		String human = DAO.getDao().printDB3(request);
		PrintWriter pw = response.getWriter();
		pw.print(human);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

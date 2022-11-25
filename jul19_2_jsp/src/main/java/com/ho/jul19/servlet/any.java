package com.ho.jul19.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/any")
public class any extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public any() {
        super();
    }
    
    public int getCha(int x, int y ) {
    	return x - y;
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");
		int a = 10;
		int b = 20;
		PrintWriter pw = null;
		pw.printf("<h1>%d</h1>", a+b);
		if (a > 5) {
			pw.printf("<h3>%d</h3>", a);
		} else {
			pw.printf("<button>%d</button>", a);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");
		int a = 10;
		int b = 20;
		PrintWriter pw = null;
		pw.printf("<h1>%d</h1>", a+b);
		
		
	}

}

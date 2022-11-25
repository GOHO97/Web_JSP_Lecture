package com.ho0714.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InOut")
public class InOut extends HttpServlet {
	private Random randomnum = new Random();
	
	private static final long serialVersionUID = 1L;
       
    public InOut() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");
		request.setCharacterEncoding("euc-kr");
		int getnum = Integer.parseInt(request.getParameter("randomNum"));
		int getrange = Integer.parseInt(request.getParameter("range"));
		
		randomnum = new Random();
		int giveNum = 0;
		StringBuffer sb = new StringBuffer();
		String num = null;
		for (int i = 0; i < getnum; i++) {
			giveNum = randomnum.nextInt(getrange);
			num = giveNum + ",";
			sb.append(num);
		}
		
		PrintWriter pw = response.getWriter();
		pw.print("<html><head><meta charset=\"euc-kr\"></head><body><table>");
		pw.printf("<tr><td>%s</td></tr>", sb);
		pw.print("</table></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

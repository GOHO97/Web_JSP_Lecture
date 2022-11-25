package com.ho.jul13.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DayFind")
public class DayFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DayFind() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setCharacterEncoding("euc-kr");
		String day = request.getParameter("birthday");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		String work = null;
		try {
			Date day2 = sdf.parse(day);
			sdf = new SimpleDateFormat("E");
			day = sdf.format(day2);
			
			if(day.equals("토")) {
				work = "blue";
			} else if (day.equals("일")) {
				work = "red";
			} else {
				work = "week";
			}
			
			PrintWriter pw = response.getWriter();
			pw.print("<html><head><meta charset=\"euc-kr\"><style type=\"text/css\">#red{color:red;}#blue{color:blue;}#week{color:black;}</style></head><body><table>");
			pw.printf("<tr id=\"%s\"><td>%s요일입니다.</td></tr>", work, day);
			pw.print("</table></body></html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}

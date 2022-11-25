package com.ho.jul13.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BMI")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BMI() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setCharacterEncoding("euc-kr");
		String namename = request.getParameter("name");
		double weightweight = Double.parseDouble(request.getParameter("weight"));
		double heightheight = Double.parseDouble(request.getParameter("height"));
		double heightheight2 = heightheight > 10 ?  heightheight / 100 : heightheight;
		double bmi = weightweight / ((heightheight2 * heightheight2));
		String judge = null;
		
		if (bmi >= 35) {
			judge="고도비만";
		} else if (bmi >= 30) {
			judge="중도비만";
		} else if (bmi >= 25) {
			judge="경도비만";
		} else if (bmi >= 23) {
			judge="과체중";
		} else if (bmi >= 18.5) {
			judge="정상체중";
		} else {
			judge="저체중";
		}
		
		PrintWriter pw = response.getWriter();
		pw.print("<html><head><meta charset=\"euc-kr\"><style type=\"text/css\">.judgeTr{color:red;}</style></head><body><table>");
		pw.printf("<tr><td>이름 : %s</td></tr>", namename);
		pw.printf("<tr><td>키 : %.1fM</td></tr>", heightheight2);
		pw.printf("<tr><td>몸무게 : %.1fkg</td></tr>", weightweight);
		pw.printf("<tr><td>bmi : %.1f</td></tr>", bmi);
		if(bmi >= 30) {
			pw.printf("<tr class=\"judgeTr\"><td>%s입니다.</td></tr>", judge);
		} else {
			pw.printf("<tr><td>%s입니다.</td></tr>", judge);
		}
		pw.print("</table></body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}

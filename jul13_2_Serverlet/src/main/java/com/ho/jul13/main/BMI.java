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
			judge="����";
		} else if (bmi >= 30) {
			judge="�ߵ���";
		} else if (bmi >= 25) {
			judge="�浵��";
		} else if (bmi >= 23) {
			judge="��ü��";
		} else if (bmi >= 18.5) {
			judge="����ü��";
		} else {
			judge="��ü��";
		}
		
		PrintWriter pw = response.getWriter();
		pw.print("<html><head><meta charset=\"euc-kr\"><style type=\"text/css\">.judgeTr{color:red;}</style></head><body><table>");
		pw.printf("<tr><td>�̸� : %s</td></tr>", namename);
		pw.printf("<tr><td>Ű : %.1fM</td></tr>", heightheight2);
		pw.printf("<tr><td>������ : %.1fkg</td></tr>", weightweight);
		pw.printf("<tr><td>bmi : %.1f</td></tr>", bmi);
		if(bmi >= 30) {
			pw.printf("<tr class=\"judgeTr\"><td>%s�Դϴ�.</td></tr>", judge);
		} else {
			pw.printf("<tr><td>%s�Դϴ�.</td></tr>", judge);
		}
		pw.print("</table></body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}

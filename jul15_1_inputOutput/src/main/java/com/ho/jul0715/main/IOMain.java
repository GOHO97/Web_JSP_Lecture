package com.ho.jul0715.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/IOMain")
public class IOMain extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");
		String path = request.getSession().getServletContext().getRealPath("file");
		System.out.println(path);
		MultipartRequest mr = new MultipartRequest(request, path, 10 * 1024 * 1024, "euc-kr", new DefaultFileRenamePolicy());
		
		String no = mr.getParameter("number");
		String[] no2 = no.split("\r\n");
		
		int firstNo = 0;
		int firstNoIndex = 0;
		for (int i = 0; i < no2.length; i++) {
			try {
				firstNo = Integer.parseInt(no2[i]);
				firstNoIndex = i;
				break;
			} catch (Exception e) {
			}
		}

		int a = firstNo;
		int b = firstNo;
		int c = firstNo;
		int d = firstNo;
		int noo = 0;

		for (int i = firstNoIndex + 1; i < no2.length; i++) {
			try {
				noo = Integer.parseInt(no2[i]);
				a += noo;
				b -= noo;
				c *= noo;
				d /= noo;
			} catch (Exception e) {
			}
		}
		String[] what = mr.getParameterValues("equality");
		
		String p = mr.getFilesystemName("bgm");
		
		
		PrintWriter pw = response.getWriter();
		pw.print("<html><head><meta charset=\"euc-kr\">");
		pw.print("<style type=\"text/css\">");
		pw.print("</style>");
		pw.print("</head><body>");
		pw.print("<h1>¤¾¤·</h1>");
		for (String n : what) {
			if (n.equals("+")) {
				pw.printf("<h1>+ : %d</h1>", a);
			} else if (n.equals("-")) {
				pw.printf("<h1>- : %d</h1>", b);
			} else if (n.equals("*")) {
				pw.printf("<h1>* : %d</h1>", c);
			} else {
				pw.printf("<h1>/ : %d</h1>", d);
			}
		}
		if(p != null) {
			p = URLEncoder.encode(p, "euc-kr");
			p = p.replace("+", " ");
			pw.printf("<audio src=\"file/%s\" controls=\"controls\"><audio>", p);
			pw.printf("<h1>ÆÄÀÏ¸í : %s</h1>", p);
		}
		pw.print("</body></html>");
	}
}

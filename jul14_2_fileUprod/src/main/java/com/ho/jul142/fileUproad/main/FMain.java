package com.ho.jul142.fileUproad.main;

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

@WebServlet("/FMain")
public class FMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FMain() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("euc-kr");
		String path = request.getSession().getServletContext().getRealPath("file");
		MultipartRequest mr = new MultipartRequest(
				request,	//���� ��û��ü
				path,		// ������ ���ε�� ����[����][������]
				10 * 1024 * 1024,	//��� ���� �ִ� ������[�� �뷮 ������ Exception]
				"euc-kr", 	//��û ���ڵ� ���
				new DefaultFileRenamePolicy()	//���ϸ� �ߺ� ��å (�ߺ��� ���ϸ� �ڿ� 1, 2, 3 ������)
				);
		
		String t = mr.getParameter("title");
		String p = mr.getFilesystemName("photo");
		p = URLEncoder.encode(p, "euc-kr");
		p = p.replace("+", " ");
		
		String e = mr.getFilesystemName("etc");
		e = URLEncoder.encode(e, "euc-kr");
		e = e.replace("+", " ");
		
		PrintWriter pw = response.getWriter();
		pw.print("<html><head><meta charset=\"euc-kr\"><style type=\"text/css\"></style></head>");
		pw.printf("<body><h1>���� : %s</h1>", t);
		pw.printf("<h1>�������ϸ� : %s</h1>", p);
		pw.printf("<img src=\"file/%s\">", p);
		pw.printf("<h1>�װ� ���ϸ� : %s</h1>", e);
		pw.printf("<img src=\"file/%s\">", e);
		pw.printf("<a href=\"file/%s\">�ٿ�</a>", e);
		pw.print("</body></html>");
	}

}

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
				request,	//기존 요청객체
				path,		// 파일이 업로드될 폴더[서버][절대경로]
				10 * 1024 * 1024,	//허용 파일 최대 사이즈[그 용량 넘으면 Exception]
				"euc-kr", 	//요청 인코딩 방식
				new DefaultFileRenamePolicy()	//파일명 중복 정책 (중복시 파일명 뒤에 1, 2, 3 붙혀줌)
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
		pw.printf("<body><h1>제목 : %s</h1>", t);
		pw.printf("<h1>사진파일명 : %s</h1>", p);
		pw.printf("<img src=\"file/%s\">", p);
		pw.printf("<h1>그거 파일명 : %s</h1>", e);
		pw.printf("<img src=\"file/%s\">", e);
		pw.printf("<a href=\"file/%s\">다운</a>", e);
		pw.print("</body></html>");
	}

}

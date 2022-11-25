package com.ho.jul18.VCServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/VCMServlet")
public class VCMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VCMServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");
		String path = request.getSession().getServletContext().getRealPath("file");
		MultipartRequest mr = new MultipartRequest(request, path, 10485760, "euc-kr", new DefaultFileRenamePolicy());
		
		String getName = mr.getParameter("name");
		int getPrice = Integer.parseInt(mr.getParameter("price"));
		int getWeight = Integer.parseInt(mr.getParameter("weight"));
		String getExpDate = mr.getParameter("expDate");
		String getFile = mr.getFilesystemName("img");
		getFile = URLEncoder.encode(getFile, "euc-kr");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (E)");
		Date getExpDate2;
		Date now = new Date();
		try {
			getExpDate2 = sdf2.parse(getExpDate);
			String getExpDate3 = sdf.format(getExpDate2);
			
			PrintWriter pw = response.getWriter();
			pw.print("<html><head><meta charset=\"euc-kr\"><link rel=\"stylesheet\" href = \"index.css\" ><style type=\"text/css\">"
					+ "#possible{color:blue;} #impossible{color:red;}</style></head><body><table>");
			pw.printf("<tr><td>사진파일명 : %s</td></tr>", getFile);
			pw.printf("<tr><td><img src=\"file/%s\"</td></tr>", getFile);
			pw.printf("<tr><td>이름 : %s</td></tr>", getName);
			pw.printf("<tr><td>가격 : %d원</td></tr>", getPrice);
			pw.printf("<tr><td>중량 : %dg</td></tr>", getWeight);
			pw.printf("<tr><td>g당 가격 : %.1f원</td></tr>", getPrice /(double) getWeight);
			pw.printf("<tr><td>유통기한 : %s</td></tr>", getExpDate3);
			if(getExpDate2.before(now)) {
				pw.printf("<tr><td id=\"impossible\">먹으면 죽음.</td></tr>");
			} else {
				pw.printf("<tr><td id=\"possible\">먹어도 됨.</td></tr>");
			}
			pw.print("</table></body></html>");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}

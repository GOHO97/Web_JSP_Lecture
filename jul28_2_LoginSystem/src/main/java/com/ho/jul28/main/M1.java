package com.ho.jul28.main;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class M1 {
	
	public static boolean loginCheck(HttpServletRequest req) {
		String memberId = (String) req.getSession().getAttribute("member");
		return memberId != null;
		//있으면 true 없으면 false return 된다.
	}
	
	public static void login(HttpServletRequest req, HttpServletResponse res) {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		if (id.equals("asdf") && pw.equals("12345")) {
			req.getSession().setAttribute("member", id);
			req.getSession().setMaxInactiveInterval(10);
			
			Cookie c = new Cookie("lastLoginID", id);
			c.setMaxAge(24*60*60);
			res.addCookie(c);
		} else {
			
		}
	}
}

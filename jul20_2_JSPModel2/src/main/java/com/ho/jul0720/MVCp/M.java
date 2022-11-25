package com.ho.jul0720.MVCp;

import javax.servlet.http.HttpServletRequest;

public class M {

	public static void add(HttpServletRequest req) {
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		int c= a + b;
		req.setAttribute("hab", c);
	}
}

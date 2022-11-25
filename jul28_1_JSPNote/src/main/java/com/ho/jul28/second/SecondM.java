package com.ho.jul28.second;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondM {
	private static final SecondM SECONDM = new SecondM();
	
	public SecondM() {
		// TODO Auto-generated constructor stub
	}
	
	public static SecondM getSecondm() {
		return SECONDM;
	}


	public void makeData(HttpServletRequest req, HttpServletResponse res) {
		
		int a = Integer.parseInt(req.getParameter("a"));
		int b = a + 10;
		
		req.setAttribute("fVVlue", b);
		System.out.println(a);
		System.out.println(b);
		int cc = 30;
		HttpSession hs = req.getSession();
		hs.setMaxInactiveInterval(20); //초 단위
		hs.setAttribute("c", cc);
		// 세션유지시간 : 설정 안 하면 기본 30분
		// 유지시간 동안 요청작업을 한번이라도 하면 갱신
		
		String dd = "40";
		Cookie c = new Cookie("d", dd);
		c.setMaxAge(20);
		// 초 단위 설정, 기본 값 까먹었다고 하심.
		res.addCookie(c);
		
		
	}
	
	public void printData(HttpServletRequest req) {
		
	}

}

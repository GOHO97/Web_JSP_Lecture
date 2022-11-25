package com.ho.jul28.thrid;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ThridM {
	
	private static final ThridM THRID = new ThridM();
	
	public ThridM() {

	}
	
	public static ThridM getThrid() {
		return THRID;
	}


	public void makeData(HttpServletRequest req) {
		
		
	}
	
	public void printData(HttpServletRequest req) {

		
		HttpSession hs = req.getSession();
		int c = (Integer) hs.getAttribute("c");
		System.out.println(c);
		
		Cookie[] cookies = req.getCookies();
		for (Cookie cc : cookies) {
			if(cc.getName().equals("d")) {
				System.out.println(cc.getValue());
			}
		}
	}
}

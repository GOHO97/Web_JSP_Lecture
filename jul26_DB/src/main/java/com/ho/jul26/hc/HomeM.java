package com.ho.jul26.hc;

import javax.servlet.http.HttpServletRequest;

public class HomeM {
	
	private static final HomeM HOMEM = new HomeM();
	
	public HomeM() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static HomeM getHomem() {
		return HOMEM;
	}


	public void creat(HttpServletRequest req) {
		String s = "어서오세요";
		req.setAttribute("s", s);
	}
}

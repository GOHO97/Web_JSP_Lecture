package com.ho.jul25.menu1;

import javax.servlet.http.HttpServletRequest;

public class Calculator {
	private static final Calculator CALCULATOR = new Calculator();
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public static Calculator getCalculator() {
		return CALCULATOR;
	}
	
	public void calculate(HttpServletRequest req) {
		int x = Integer.parseInt(req.getParameter("x"));
		int y = Integer.parseInt(req.getParameter("y"));
		int z = x + y;
		req.setAttribute("z", z);
	}
}

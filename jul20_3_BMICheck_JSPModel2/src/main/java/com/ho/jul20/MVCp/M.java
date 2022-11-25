package com.ho.jul20.MVCp;

import javax.servlet.http.HttpServletRequest;

public class M {
	
	private static final M MM = new M();
	
	private M() {
		
	}
	
	public static M getM() {
		return MM;
	}
	
	public void getBmi(HttpServletRequest req) {
		String name = req.getParameter("name");
		double height = Double.parseDouble(req.getParameter("height"));
		double weight = Double.parseDouble(req.getParameter("weight"));
		
		double bmi = weight / (height * height);
		String status = "저체중";
		
		if(bmi >= 35) {
			status = "고도 비만";
		} else if(bmi >= 30) {
			status = "중도 비만";
		} else if(bmi >= 25) {
			status = "경도 비만";
		} else if(bmi >= 23) {
			status = "과체중";
		} else if(bmi >= 18){
			status = "정상";
		}
		Guest g = new Guest(name, height, weight, bmi, status);
		req.setAttribute("ggggg", g);
	}
}

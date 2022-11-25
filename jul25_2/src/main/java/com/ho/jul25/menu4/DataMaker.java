package com.ho.jul25.menu4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class DataMaker {
	
	public static void make(HttpServletRequest req) {
		int a = 12345;
		req.setAttribute("a", a);
		double b = 0.54234;
		req.setAttribute("b", b);
		
		Date now = new Date();
		req.setAttribute("c", now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		ArrayList<Snack> snacks = new ArrayList<Snack>();
		try {
			snacks.add(new Snack("ÃÊÄÚÆÄÀÌ", 5000, sdf.parse("20220730")));
			snacks.add(new Snack("»©»©·Î", 1000, sdf.parse("20220820")));
			snacks.add(new Snack("»õÄÞ´ÞÄÞ", 500, sdf.parse("20220901")));
			req.setAttribute("snacks", snacks);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String s = "¤»¤»¤»";
		req.setAttribute("s", s);
	}
	
	
	
}
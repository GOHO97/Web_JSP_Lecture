package com.ho.jul0721.mvc2;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class M {
	
	public static void makeData(HttpServletRequest req) {
		System.out.println("¸¸µé°í");
		int dd = 123;
		req.setAttribute("d", dd);
		
		Human h = new Human("ÀåÁØÈñ", 24);
		req.setAttribute("h", h);
		
		ArrayList<Human> hh = new ArrayList<Human>();
		hh.add(new Human("ÀåÁØÈñ", 24));
		hh.add(new Human("±èÁö¹Î", 30));
		hh.add(new Human("À±Áø¿ø", 30));
		hh.add(new Human("¼­¿µ´ö", 29));
		hh.add(new Human("³ª¹®¼ö", 26));
		req.setAttribute("hh", hh);
	}
	
	public static void printData(HttpServletRequest req) {
		try {
			req.setCharacterEncoding("euc-kr");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ãâ·ÂÇÏ°í");
		int a = Integer.parseInt(req.getParameter("a"));
		System.out.println(a);
		String[] c = req.getParameterValues("c");
		if(c != null){
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i]);
			}
		}
		System.out.println("------------");
		int dd = (Integer) req.getAttribute("d");
		System.out.println(dd);
		System.out.println("------------");
		
		Human h = (Human) req.getAttribute("h");
		System.out.println(h.getAge());
		System.out.println(h.getName());
		
		ArrayList<Human> hh = (ArrayList<Human>) req.getAttribute("hh");
		for (int i = 0; i < hh.size(); i++) {
			System.out.println(hh.get(i).getName());
			System.out.println(hh.get(i).getAge());
		}
	}
}

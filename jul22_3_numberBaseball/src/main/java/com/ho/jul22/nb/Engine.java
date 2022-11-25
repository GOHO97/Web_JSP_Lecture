package com.ho.jul22.nb;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class Engine {
	private static final Engine ENGINE = new Engine();
	private Random r;
	private String cn;
	private int gameCount;
	
	public Engine() {
		r = new Random();
	}

	
	
	public String getCn() {
		return cn;
	}



	public void setCn(String cn) {
		this.cn = cn;
	}



	public static Engine getEngine() {
		return ENGINE;
	}



	public void pickNum() {
		int a = r.nextInt(976) + 12;
		String aa = String.format("%03d", a);
		if(aa.charAt(0) == aa.charAt(1) || aa.charAt(1) == aa.charAt(2) || aa.charAt(2) == aa.charAt(0)) {
			pickNum();
		} else {
			setCn(aa);
		}
	}
	
	
	public void checkEnd(HttpServletRequest req) {
		String un = req.getParameter("no"); 
		
		String again = "<a href=\"index.html\">다시하기</a>";
		if(un.equals(cn)) {
			req.setAttribute("comNum", cn);
			req.setAttribute("result", "삼진");
			req.setAttribute("again", again);
		}
	}
	
	public void play(HttpServletRequest req) {
		String un = req.getParameter("no"); 
		gameCount++;
		int ball = 0;
		int strike = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(cn.charAt(i) == un.charAt(j)) {
					if(i == j) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}
		req.setAttribute("gameCount", gameCount);
		req.setAttribute("ball", ball);
		req.setAttribute("strike", strike);
		req.setAttribute("comNum", cn);
	}
	
	public void reset() {
		gameCount = 0;
	}
		
	
}

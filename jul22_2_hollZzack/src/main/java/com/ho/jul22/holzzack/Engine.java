package com.ho.jul22.holzzack;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class Engine {
	private static final Engine ENGINE = new Engine();
	private int gameCount;
	private int win;
	private int lose;
	private int count;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public static Engine getEngine() {
		return ENGINE;
	}
	
	public void operateE(HttpServletRequest req) {
		Random r = new Random();
		int answer = r.nextInt(10) + 1;
		if (answer % 2 == 1) {
			req.setAttribute("answer", "holl");
		} else {
			req.setAttribute("answer", "zzack");
		}
		StringBuffer sb = new StringBuffer();
		String img = "<img src=\"coin.PNG\">";
		for (int i = 1; i < answer; i++) {
			sb.append(img);
		}
		req.setAttribute("img", sb);
	}
	
	public void judge(HttpServletRequest req) {
		String choice = req.getParameter("choice");
		String answer = (String) req.getAttribute("answer");
		
		if(choice.equals(answer)) {
			req.setAttribute("result", "½Â");
			win++;
		} else {
			req.setAttribute("result", "ÆÐ");
			lose++;
		}
		
		gameCount ++;
		
		req.setAttribute("gameCount", gameCount);
		req.setAttribute("win", win);
		req.setAttribute("lose", lose);
	}
	
	public void reset(HttpServletRequest req) {
		gameCount = 0;
		win = 0;
		lose = 0;
		count = 0;
		req.setAttribute("gameCount", gameCount);
		req.setAttribute("win", win);
		req.setAttribute("lose", lose);
		req.setAttribute("count", count);
	}
	
	
}

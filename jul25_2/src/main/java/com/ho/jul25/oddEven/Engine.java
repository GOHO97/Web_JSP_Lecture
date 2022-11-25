package com.ho.jul25.oddEven;

import java.util.ArrayList;
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
	
	
	
	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
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
		String img = "<img src=\"jsp/menu2/coin.PNG\">";
		for (int i = 1; i < answer; i++) {
			sb.append(img);
		}
		req.setAttribute("img", sb);
	}
	
	public void judge(HttpServletRequest req) {
		String choice = req.getParameter("choice");
		String answer = (String) req.getAttribute("answer");
		
		if(choice.equals(answer)) {
			req.setAttribute("result", "승");
			win++;
		} else {
			req.setAttribute("result", "패");
			lose++;
		}
		
		gameCount ++;
		
		req.setAttribute("gameCount", gameCount);
		req.setAttribute("win", win);
		req.setAttribute("lose", lose);
		
		ArrayList<Dog> al = new ArrayList<Dog>();
		
		al.add(new Dog("준희", 5));
		al.add(new Dog("진원", 6));
		al.add(new Dog("영덕", 8));
		al.add(new Dog("하경", 7));
		al.add(new Dog("문수", 3));
		req.setAttribute("dogs", al);
		
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
	
	public void result(HttpServletRequest req) {
		if(win < lose) {
			req.setAttribute("comment", "안타깝네요 ㅠㅠ 도태된 패배자새끼");
		} else {
			req.setAttribute("comment", "오우야 축하드립니다;;");
		}
	}
}

package com.ho.jul22.rsp;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class Referee {
	
	private static final Referee REFREE = new Referee();
	private int draw;
	private int victory;
	private int lose;
	
	public Referee() {
		
	}
	
	public static Referee getRefree() {
		return REFREE;
	}
	
	public void thinkCom(HttpServletRequest req) {
		Random r = new Random();
		int comHand = r.nextInt(3) + 1;
		req.setAttribute("comHand", comHand);
	}
	
	public void startGame(HttpServletRequest req) {
		int userHand = Integer.parseInt(req.getParameter("hand"));
		req.setAttribute("userHand", userHand);
	}
	
	public void judge(HttpServletRequest req) {
		
		int userHand = (int) req.getAttribute("userHand");
		int comHand = (int) req.getAttribute("comHand");
		
		int result = userHand - comHand;
		if(result == 0) {
			req.setAttribute("judge", "�̹��� ��屸��!");
			draw++;
		} else if(result == -1 || result == 2) {
			req.setAttribute("judge", "���� ���� �̰���!");
			lose++;
		} else {
			req.setAttribute("judge", "�� ���� �¸���!");
			victory++;
		}
	}
	
	public void showScore(HttpServletRequest req) {
		Score s = new Score(draw, victory, lose);
		req.setAttribute("score", s);
	}
	
	public void resetScore() {
		draw = 0;
		lose = 0;
		victory = 0;
	}
}

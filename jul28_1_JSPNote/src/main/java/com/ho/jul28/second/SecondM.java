package com.ho.jul28.second;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondM {
	private static final SecondM SECONDM = new SecondM();
	
	public SecondM() {
		// TODO Auto-generated constructor stub
	}
	
	public static SecondM getSecondm() {
		return SECONDM;
	}


	public void makeData(HttpServletRequest req, HttpServletResponse res) {
		
		int a = Integer.parseInt(req.getParameter("a"));
		int b = a + 10;
		
		req.setAttribute("fVVlue", b);
		System.out.println(a);
		System.out.println(b);
		int cc = 30;
		HttpSession hs = req.getSession();
		hs.setMaxInactiveInterval(20); //�� ����
		hs.setAttribute("c", cc);
		// ���������ð� : ���� �� �ϸ� �⺻ 30��
		// �����ð� ���� ��û�۾��� �ѹ��̶� �ϸ� ����
		
		String dd = "40";
		Cookie c = new Cookie("d", dd);
		c.setMaxAge(20);
		// �� ���� ����, �⺻ �� ��Ծ��ٰ� �Ͻ�.
		res.addCookie(c);
		
		
	}
	
	public void printData(HttpServletRequest req) {
		
	}

}

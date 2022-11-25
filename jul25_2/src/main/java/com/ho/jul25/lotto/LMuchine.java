package com.ho.jul25.lotto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class LMuchine {
	private static final LMuchine LMUCHINE = new LMuchine();
	private Random pick;
	
	public LMuchine() {
		pick = new Random();
	}

	public LMuchine(Random pick) {
		super();
		this.pick = pick;
	}

	public Random getPick() {
		return pick;
	}

	public void setPick(Random pick) {
		this.pick = pick;
	}

	public static LMuchine getLmuchine() {
		return LMUCHINE;
	}
	
	public void pickNum(HttpServletRequest req) {
		HashSet<String> ball = new HashSet<String>();
		
		while (true) {
			ball.add(String.format("ball_%d.png", pick.nextInt(45) + 1));
			
			if (ball.size() == 6) {
				break;
			}
		}
		ArrayList<String> ball2 = new ArrayList<String>(ball);
		ball2.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		req.setAttribute("balls", ball2);
	}
}

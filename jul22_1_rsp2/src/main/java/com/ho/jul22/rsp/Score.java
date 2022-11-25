package com.ho.jul22.rsp;

public class Score {
	private int draw;
	private int victory;
	private int lose;
	
	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(int draw, int victory, int lose) {
		super();
		this.draw = draw;
		this.victory = victory;
		this.lose = lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public int getVictory() {
		return victory;
	}

	public void setVictory(int victory) {
		this.victory = victory;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}
	
	
}

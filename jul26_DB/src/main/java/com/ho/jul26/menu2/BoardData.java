package com.ho.jul26.menu2;

import java.util.Date;

public class BoardData {
	private int b_no;
	private String b_title;
	private String b_content;
	private Date b_when;
	
	public BoardData() {
		// TODO Auto-generated constructor stub
	}

	public BoardData(int b_no, String b_title, String b_content, Date b_when) {
		super();
		this.b_no = b_no;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_when = b_when;
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_content() {
		return b_content;
	}

	public void setB_content(String b_content) {
		this.b_content = b_content;
	}

	public Date getB_when() {
		return b_when;
	}

	public void setB_when(Date b_when) {
		this.b_when = b_when;
	}
}

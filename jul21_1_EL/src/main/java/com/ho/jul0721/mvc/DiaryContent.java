package com.ho.jul0721.mvc;

public class DiaryContent {
	private String img;
	private String text;
	private String today;
	private String icon;
	
	public DiaryContent() {
		// TODO Auto-generated constructor stub
	}

	public DiaryContent(String img, String text, String today, String icon) {
		super();
		this.img = img;
		this.text = text;
		this.today = today;
		this.icon = icon;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	

}

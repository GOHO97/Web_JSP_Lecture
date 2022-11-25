package com.ho.jul0721.mvc;


import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class Diary {
	
	private static final Diary DIARY = new Diary();
	
	public Diary() {
		// TODO Auto-generated constructor stub
	}

	public static Diary getDiary() {
		return DIARY;
	}
	
	public void getToday(HttpServletRequest req) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String now2 = sdf.format(now);
		req.setAttribute("today", now2);
	}
	
	public void getWeather(HttpServletRequest req) {
		HttpsURLConnection huc = null;
		
		try {
			String s = "https://api.openweathermap.org/data/2.5/weather?q=seoul&appid=baff8f3c6cbc28a4024e336599de28c4";
			URL u = new URL(s);
			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			JSONArray ja = (JSONArray) jo.get("weather");
			JSONObject wo = (JSONObject) ja.get(0);
			String icon = (String) wo.get("icon");
			String icon2 = String.format("https://openweathermap.org/img/wn/%s@2x.png", icon);
			
			req.setAttribute("icon", icon2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	public void getContent(HttpServletRequest req) throws Exception {
		String path = req.getSession().getServletContext().getRealPath("file");
		MultipartRequest mr = new MultipartRequest(req, path, 10485760, "euc-kr", new DefaultFileRenamePolicy());
		
		String now = (String) req.getAttribute("today");
		
		String icon = (String) req.getAttribute("icon");
		
		String text = mr.getParameter("text");
		text = text.replace("\r\n", "<br>");
		
		String img = mr.getFilesystemName("img");
		img = URLEncoder.encode(img, "euc-kr");
		img = img.replace("+", " ");
		
		DiaryContent dc = new DiaryContent(img, text, now, icon);
		req.setAttribute("dc", dc);
		
	}
}

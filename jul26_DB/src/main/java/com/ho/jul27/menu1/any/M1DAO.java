package com.ho.jul27.menu1.any;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.http.HttpServletRequest;

public class M1DAO {
	
	public static void test(HttpServletRequest req) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = DriverManager.getConnection(addr, "lp2011s", "rudgh6401");
			req.setAttribute("r", "M1연결성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.ho.aug.anyany;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.ho.jul26.DBM2.HoDBManager2;

public class DAO {

	private static final DAO DAO = new DAO();
	
	public DAO() {
		// TODO Auto-generated constructor stub
	}

	public static DAO getDao() {
		return DAO;
	}
	
	public void printDB(HttpServletRequest req) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = HoDBManager2.connect("hoPool");
			String sql = "select * from anything3";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<DTO> dto = new ArrayList<DTO>();
			while(rs.next()) {											
				dto.add(new DTO(rs.getString("a_name"), rs.getString("a_characteristic")));
			}
			req.setAttribute("anythingData", dto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			HoDBManager2.disconnect(con, pstmt, rs);
		}
	}
	
	public String printDB2(HttpServletRequest req) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = HoDBManager2.connect("hoPool");
			String sql = "select * from anything3";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			StringBuffer sb = new StringBuffer();
			sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			sb.append("<anything3>"); //테이블명
			while(rs.next()) {				
				sb.append("<human>");
				sb.append("<a_name>" + rs.getString("a_name") + "</a_name>");
				sb.append("<a_characteristic>" + rs.getString("a_characteristic") + "</a_characteristic>");
				sb.append("</human>");
				
			}
			sb.append("</anything3>");
			return sb.toString();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			HoDBManager2.disconnect(con, pstmt, rs);
		}
	}
	
public String printDB3(HttpServletRequest req) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = HoDBManager2.connect("hoPool");
			
		//	요청할 때 공개적으로 : 요청파라메터
		//	요청할 때 비공개적으로 : 요청헤더 (api 키 같은 걸로 쓰임)
			
			String key = req.getHeader("key");
			if(!key.equals("asdfwefa")) {
				return null;
			}
			
			String sql = "select * from anything3";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			boolean isFirstData = true;
			StringBuffer sb = new StringBuffer();
			
			sb.append("["); //테이블명
			while(rs.next()) {				
				if(isFirstData) {
					isFirstData = false;
				} else {
					sb.append(",");
				}
				sb.append("{");
				sb.append("\"a_name\":\"" + rs.getString("a_name") + "\",");
				sb.append("\"a_characteristic\":\"" + rs.getString("a_characteristic") + "\"");
				sb.append("}");
			}
			sb.append("]");
			return sb.toString();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			HoDBManager2.disconnect(con, pstmt, rs);
		}
	}


}

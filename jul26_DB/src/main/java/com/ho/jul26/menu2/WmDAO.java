package com.ho.jul26.menu2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.ho.jul26.DBM2.HoDBManager2;

public class WmDAO {
	private int allBoardDataCount;
	
	private static final WmDAO WMDAO = new WmDAO();
	
	public WmDAO() {
		// TODO Auto-generated constructor stub
	}

	public static WmDAO getWmDAO() {
		return WMDAO;
	}
	
	public void write(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//������ Ȯ��
			con = HoDBManager2.connect("hoPool");
			req.setCharacterEncoding("euc-kr");
			String title = req.getParameter("title");
			String txt = req.getParameter("txt");
//			txt = txt.replace("\r\n", "<br>");
			
			//sql(�̿ϼ�)
			String sql = "insert into boardWrite values(boardWrite_seq.nextval, ?, ?, sysdate)";
			
			// DB���� �۾��Ѱ���ü
			pstmt = con.prepareStatement(sql);
			
			// ? ä���[1������ ��]
			pstmt.setString(1, title);
			pstmt.setString(2, txt);
			
			// DB ������ ����, ����, ��� ó��
			// R : pstmt.executeQuery();
			// CUD : pstmt.executeUpdate();
			if(pstmt.executeUpdate() == 1) {
				req.setAttribute("result", "�۾��� ����");
				allBoardDataCount++;
				System.out.println(allBoardDataCount);
			} else {
				req.setAttribute("result", "�۾��� ����");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("result", "�۾��� ����");
		}
		HoDBManager2.disconnect(con, pstmt, null);
		
	}
	
	public void getBoardData(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = HoDBManager2.connect("hoPool");
			int dataPerPage = 8;
			int allPageCount = (int) Math.ceil(allBoardDataCount / (double) dataPerPage);
			req.setAttribute("pageCount", allPageCount);
			
			String pageNum = req.getParameter("pageNum");
			int pageNum2 = 0;
			if(pageNum != null) {
				pageNum2 = Integer.parseInt(pageNum);
			} else {
				pageNum2 = 1;
			}
			
			int start = (pageNum2 - 1) * dataPerPage + 1;
			int end = pageNum2 * dataPerPage;
			
			String sql = "select * from(select rownum as rn, b_no, b_title, b_content, b_when from(select rownum, b_no, b_title, b_content, b_when from boardWrite order by b_when desc))where rn >= ? and rn <= ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs = pstmt.executeQuery();
			
			ArrayList<BoardData> bdata = new ArrayList<BoardData>();
			while(rs.next()) {
				bdata.add( new BoardData(rs.getInt("b_no"), rs.getString("b_title"), rs.getString("b_content"), rs.getDate("b_when")));
			}
			req.setAttribute("boardData", bdata);
		} catch (Exception e) {
			e.printStackTrace();
		}
		HoDBManager2.disconnect(con, pstmt, rs);
	}
	
	public void setAllBoardDataCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = HoDBManager2.connect("hoPool");
			
			String sql = "select count(*) from boardWrite";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			allBoardDataCount = rs.getInt("count(*)");
			System.out.println("ó��: " + allBoardDataCount);
		} catch (Exception e) {
		}
		HoDBManager2.disconnect(con, pstmt, rs);
	}
	
	public boolean showBoardContent(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = HoDBManager2.connect("hoPool");
			
			int boardNum = Integer.parseInt(req.getParameter("boardNum"));
			String sql = "select b_no, b_title, b_content, b_when from boardWrite where b_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, boardNum);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				BoardData bd = new BoardData(rs.getInt("b_no"), rs.getString("b_title"), rs.getString("b_content"), rs.getDate("b_when"));
				req.setAttribute("bd", bd);
				return true;
			} else { // �ٸ� ����� �������� �̹� DB �󿡴� ���� ���� Ŭ���� ���
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			HoDBManager2.disconnect(con, pstmt, rs);
		}
	}
	
	public void deleteBoardContent(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = HoDBManager2.connect("hoPool");
			
			int no = Integer.parseInt(req.getParameter("reBoardNum"));
			String sql = "delete from boardWrite where b_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			if(pstmt.executeUpdate() == 1) {
				req.setAttribute("result", "���� ����");
				allBoardDataCount--;
				System.out.println(allBoardDataCount);
			} else {
				req.setAttribute("result", "���� ����");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("result", "���� ����");
		}
		HoDBManager2.disconnect(con, pstmt, null);
	}
	
	public void alterBoardContent(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = HoDBManager2.connect("hoPool");
			req.setCharacterEncoding("euc-kr");
			
			int no = Integer.parseInt(req.getParameter("no"));
			String title = req.getParameter("title");
			String bContent = req.getParameter("bContent");
			
			String sql = "update boardWrite set b_title = ?, b_content = ? where b_no = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, title);
			pstmt.setString(2, bContent);
			pstmt.setInt(3, no);
			
			if(pstmt.executeUpdate() == 1) {
				req.setAttribute("result", "���� ����");
			} else {
				req.setAttribute("result", "���� ����");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("result", "���� ����");
		}
		HoDBManager2.disconnect(con, pstmt, null);
	}
	
}

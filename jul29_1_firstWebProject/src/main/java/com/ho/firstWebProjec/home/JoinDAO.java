package com.ho.firstWebProjec.home;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import com.ho.jul26.DBM2.HoDBManager2;
import com.ho.mgz.nftGalleryMain.NftGalleryDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class JoinDAO {
	private static final JoinDAO JOINDAO = new JoinDAO();
	
	public JoinDAO() {
		// TODO Auto-generated constructor stub
	}

	public static JoinDAO getJoindao() {
		return JOINDAO;
	}
	
	public void join(HttpServletRequest req) {
		String path = req.getSession().getServletContext().getRealPath("img");
		System.out.println(path);
		Connection con = null;
		PreparedStatement pstmt = null;
		
		MultipartRequest mr = null;
		try {
			mr = new MultipartRequest(req, path, 10485760, "euc-kr", new DefaultFileRenamePolicy());
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("result", "���� ���ε� ������ ���� ����.");
			return;
		}
		
		try {
			con = HoDBManager2.connect("hoPool");
			
			String id = mr.getParameter("id");
			String pw = mr.getParameter("pw");
			String name = mr.getParameter("name");
			String email = mr.getParameter("email");
			
			String y = mr.getParameter("y");
			int m = Integer.parseInt(mr.getParameter("m"));
			int d = Integer.parseInt(mr.getParameter("d"));
			String birthday = String.format("%s%02d%02d", y, m, d);
			
			String addr1 = mr.getParameter("addr1");
			String addr2 = mr.getParameter("addr2");
			String addr3 = mr.getParameter("addr3");
			String addr = addr1 + "!" + addr2 + "!" + addr3;
			
			String photo = mr.getFilesystemName("photo");
			photo = URLEncoder.encode(photo, "euc-kr");
			photo = photo.replace("+", " ");
			
			String sql = "insert into member2 values(?, ?, ?, ?, to_date(?, 'YYYYMMDD'), ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, photo);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			pstmt.setString(4, name);
			pstmt.setString(5, birthday);
			pstmt.setString(6, email);
			pstmt.setString(7, addr);
			
			if(pstmt.executeUpdate() == 1) {
				req.setAttribute("result", "���� ����");
			} else {
				req.setAttribute("result", "���� ����");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("result", "DB���� ������ ���� ����");
			File f = new File(path + "/" + mr.getFilesystemName("photo"));
			f.delete();
		} finally {
			HoDBManager2.disconnect(con, pstmt, null);
		}
		
	}
	
	public void login(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = HoDBManager2.connect("hoPool");
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			String sql = "select * from member2 where m_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String dbPW = rs.getString("m_pw");
				if(pw.equals(dbPW)) {
					Member m = new Member(rs.getString("m_photo"), id, pw, rs.getString("m_name"), rs.getDate("m_birthday"), rs.getString("m_email"), rs.getString("m_addr"));
					req.getSession().setAttribute("loginMember", m);
					req.getSession().setMaxInactiveInterval(30 * 60);
				} else {
					req.setAttribute("result", "�߸��� ��й�ȣ�Դϴ�.");
				}
			} else {
				req.setAttribute("result", "���Ե��� ���� ID �Դϴ�.");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("result", "�α��ο� �����Ͽ����ϴ�.[DB����]");
		} finally {
			HoDBManager2.disconnect(con, pstmt, rs);
		}
		
	}
	
	public boolean loginCheck(HttpServletRequest req) {
		Member m = (Member) req.getSession().getAttribute("loginMember");
		if(m != null) {
			req.setAttribute("loginPage", "member/welcome.jsp");
			return true;
		}
		req.setAttribute("loginPage", "member/login.jsp");
		return false;
	}
	
	public void logout(HttpServletRequest req) {
		//���� ���� �׷��� �̰� �ع����� �� �������� �ٸ��� ������ ���� �� �ִ�.
		//req.getSession().setMaxInactiveInterval(-1);
		req.getSession().setAttribute("loginMember", null);
		// �׷��� �̷��� ���ǿ� ����ִ� ��� ������ �����ش�.
	}
	
	public void getInfo(HttpServletRequest req) {
		Member m = (Member) req.getSession().getAttribute("loginMember");
		DateManager.getDate(m.getBirthday(), req);
		
		String[] addr = m.getAddr().split("!");
		req.setAttribute("addr1", addr[0]);
		req.setAttribute("addr2", addr[1]);
		req.setAttribute("addr3", addr[2]);
	}
	
	public void infoModify(HttpServletRequest req) {
		String path = req.getSession().getServletContext().getRealPath("img");
		
		MultipartRequest mr = null;
		try {
			mr = new MultipartRequest(req, path, 10485760, "euc-kr", new DefaultFileRenamePolicy());
		} catch (Exception e) {
			// ���� �ٲٰڴٰ� ���� �����ߴµ� 10M�Ѿ
			// ���� �� �ٲٴ� ��Ȳ���� ���� �ɸ� ���� ����.
			req.setAttribute("result", "���� ���� ����[����]");
			return;
		}
		Member member = (Member) req.getSession().getAttribute("loginMember");
		
		String oldPhoto = member.getPhoto();
		String newPhoto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
		con = HoDBManager2.connect("hoPool");
		
		String id = mr.getParameter("id");
		String pw = mr.getParameter("pw");
		String name = mr.getParameter("name");
		String email = mr.getParameter("email");
		
		String y = mr.getParameter("y");
		int m = Integer.parseInt(mr.getParameter("m"));
		int d = Integer.parseInt(mr.getParameter("d"));
		String birthday = String.format("%s%02d%02d", y, m, d);
		
		String addr1 = mr.getParameter("addr1");
		String addr2 = mr.getParameter("addr2");
		String addr3 = mr.getParameter("addr3");
		String addr = addr1 + "!" + addr2 + "!" + addr3;
		
		newPhoto = mr.getFilesystemName("photo");
		if(newPhoto == null) { //���� �� �ٲ�
			newPhoto = oldPhoto;
		} else {	//���� �ٲ�
			newPhoto = URLEncoder.encode(newPhoto, "euc-kr").replace("+", " ");
		}
		
		String sql = "update member2 set m_photo = ?, m_pw = ?, m_name = ?, m_birthday = to_date(?, 'YYYYMMDD'), m_email = ?, m_addr = ? where m_id = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, newPhoto);
		pstmt.setString(2, pw);
		pstmt.setString(3, name);
		pstmt.setString(4, birthday);
		pstmt.setString(5, email);
		pstmt.setString(6, addr);
		pstmt.setString(7, id);
		
		if (pstmt.executeUpdate() == 1) {
			req.setAttribute("result", "���� ����");
			// ���� ������ ���ο� ������ �ٸ��� ������ ���� �߱⿡ ���� ������ �����־�� ��.
			if(!oldPhoto.equals(newPhoto)) {
				oldPhoto = URLDecoder.decode(oldPhoto, "euc-kr");
				// ��Ĺ�� �ƴ϶� �ڹٰ� ����� �Ŷ� �ѱ�ó���� �Ǿ������� �� �ȴ�.
				new File(path + "/" + oldPhoto).delete();
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Member newMember = new Member(newPhoto, id, pw, name, sdf.parse(birthday), email, addr);
			req.getSession().setAttribute("loginMember", newMember);
			
		} else {
			req.setAttribute("result", "���� ����");
			//���� �� �߸� ���� �� ������ ������ �Ѵ�.
			if(!oldPhoto.equals(newPhoto)) {
				newPhoto = URLDecoder.decode(newPhoto, "euc-kr");
				new File(path + "/" + newPhoto).delete();
			}
		}
		
		} catch (Exception e) {
			req.setAttribute("result", "DB ������ ���� ���� ����");
			
			if(!oldPhoto.equals(newPhoto)) {
				try {
					newPhoto = URLDecoder.decode(newPhoto, "euc-kr");
					new File(path + "/" + newPhoto).delete();
				} catch (UnsupportedEncodingException e1) {
				}
			}
		}
		
		
	}
	
	public void infoDelete(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = HoDBManager2.connect("hoPool");
			Member m = (Member)req.getSession().getAttribute("loginMember");
			
			String sql = "delete from member2 where m_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			
			int count = NftGalleryDAO.getNftgallerydao().setDeletePostingCount(m.getId());
			if(count == -1) {
				req.setAttribute("result", "�Խñ� ��ȸ �Ұ��� ���� Ż�� ����, ��õ� ��Ź�帳�ϴ�.");
				return;
			}
			if(pstmt.executeUpdate() == 1) {
				req.setAttribute("result", "���ݱ��� �̿����ּż� �����մϴ�.");
				
				NftGalleryDAO.getNftgallerydao().setPostingCount(count);
				String path = req.getSession().getServletContext().getRealPath("img");
				String photo = URLDecoder.decode(m.getPhoto(), "euc-kr");
				new File(path + "/" + photo).delete();
			} else {
				req.setAttribute("result", "Ż�� ����, ��õ� ��Ź�帳�ϴ�.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("result", "Ż�� ����, ��õ� ��Ź�帳�ϴ�.");
		} finally {
			HoDBManager2.disconnect(con, pstmt, null);
		}
		
	}
	
}

package com.ho.mgz.nftGalleryMain;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ho.firstWebProjec.home.JoinDAO;
import com.ho.token.generator.hoTokenGenerator;

@WebServlet("/ReplyDeleteController")
public class ReplyDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReplyDeleteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(JoinDAO.getJoindao().loginCheck(request)) {
			NftGalleryDAO.getNftgallerydao().clearSearch(request);
			hoTokenGenerator.generate(request);
			NftGalleryDAO.getNftgallerydao().deletReply(request);
			NftGalleryDAO.getNftgallerydao().selectGallery(request);
			String pageNum = (request.getParameter("pageNum"));
			if(pageNum != null) {
				int pageNum2 = Integer.parseInt(pageNum);
				NftGalleryDAO.getNftgallerydao().showGallery(pageNum2, request);
			} else {
				NftGalleryDAO.getNftgallerydao().showGallery(1, request);
			}
			NftGalleryDAO.getNftgallerydao().showReply(request);
			request.setAttribute("commentPage", "comment.jsp");
			request.setAttribute("contentPage",	"nftGallery/main.jsp");
		} else {
			request.setAttribute("result", "��� ������ �α��� �� �̿����ּ���");
			request.setAttribute("contentPage", "home/home.jsp");
		}
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
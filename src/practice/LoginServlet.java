package practice;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/kkjj/*")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		if(uri.indexOf("login.do")!=-1) {
			String userid=request.getParameter("userid");
			String passwd=request.getParameter("passwd");
			LoginDAO dao=new LoginDAO();
			String name=dao.loginCheck(userid, passwd);
			String message="";
			String page="";
			if(name==null) {
				message="아이디나 비밀번호가 일치하지 않습니다.";
				message=URLEncoder.encode(message, "utf-8");
				page="/practice/loginForm.jsp?message="+message;
			}else {
				message=name+"님 환영합니다.";
				HttpSession session=request.getSession();
				session.setAttribute("userid", userid);
				session.setAttribute("message", message);
				page="/practice/loginsuccess.jsp";
			}
			response.sendRedirect(request.getContextPath()+page);
		}else if(uri.indexOf("logout.do")!=-1) {
			HttpSession session=request.getSession();
			session.invalidate();
			String message=URLEncoder.encode("로그아웃되었습니다.", "utf-8");
			response.sendRedirect(request.getContextPath()+"/practice/loginForm.jsp?message="+message);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

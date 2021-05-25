package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws  ServletException, IOException{
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");
		String name = req.getParameter("user_name");
		String hobby[] = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String content = req.getParameter("content");

		
		out.print("<html><head><title>로그인 정보</title></head><body>");
		out.print("<p> 아이디 : " + id + "</p>" );
		out.print("<p> 비밀번호 : " + pw + "</p>");
		out.print("<p> 이름 : " + name + "</p>");
		out.print("<p> 취미 : ");
		for(int i = 0; i<hobby.length; i++) {
			out.print(hobby[i] + "\t");
		}out.print("</p>");
		out.print("<p> 성별 : " + gender + "</p>");
		out.print("<p> 직업 : " + job + "</p>");
		out.print("<p> 소개 : " + content + "</p>");
		
		
		
	}
}

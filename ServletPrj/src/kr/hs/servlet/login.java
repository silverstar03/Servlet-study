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

		
		out.print("<html><head><title>�α��� ����</title></head><body>");
		out.print("<p> ���̵� : " + id + "</p>" );
		out.print("<p> ��й�ȣ : " + pw + "</p>");
		out.print("<p> �̸� : " + name + "</p>");
		out.print("<p> ��� : ");
		for(int i = 0; i<hobby.length; i++) {
			out.print(hobby[i] + "\t");
		}out.print("</p>");
		out.print("<p> ���� : " + gender + "</p>");
		out.print("<p> ���� : " + job + "</p>");
		out.print("<p> �Ұ� : " + content + "</p>");
		
		
		
	}
}

package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberServlet")
public class memberServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");
		String name = req.getParameter("user_name");
		String age = req.getParameter("user_age");
		
		System.out.println("���̵� : " + id);
		System.out.println("��й�ȣ : " + pw);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);

		String list[] = {id, pw, name, age};
		
		req.setAttribute("result", list);		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("member_result.jsp");
		dispatcher.forward(req, res);
		
	}

}

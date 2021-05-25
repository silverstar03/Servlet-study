package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class login2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");
		
		if(id.equals("kim") && pw.equals("1111")) {
			req.setAttribute("model1", id);
			req.setAttribute("model2", pw);
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("login_result2.jsp");
		dispatcher.forward(req, res);
	}
}

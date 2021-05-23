package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class input extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String result;
		String num = req.getParameter("num");
		int number = Integer.parseInt(num);
		if(number % 2 == 0)
			result = "짝수";
		else result = "홀수";
		
		//request영역에 model이란 변수를 만들어서 result값을 대입한다.
		req.setAttribute("model", result);
		
		//forward 되는 페이지적어주기
		RequestDispatcher dispatcher = req.getRequestDispatcher("input_result.jsp");
		dispatcher.forward(req, res);
		
	}
}

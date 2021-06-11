package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class sum extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String n = req.getParameter("num");
		int num = Integer.parseInt(n);
		
		int sum = 0;
		
		for(int i = 1; i < num; i++) {
			sum += num;
		}
		
		int result[] = {num, sum};
		req.setAttribute("model", result);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("sum_result.jsp");
		dispatcher.forward(req, res);
	}

}

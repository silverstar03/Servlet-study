package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/a")
public class SecondServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		super.init();
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int a = 3;
		if(a % 2 == 0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
	}
}

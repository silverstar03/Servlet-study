package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html><head><title>1���� 10������ �ձ��ϱ�</title></head><body>");
		int a = 0;
		for(int i = 1; i<=10; i++) {
			a += i;
		}
		out.print("<h1>1���� 10������ �� : </h1>" + a);
		out.print("</body></html>");
	}
}

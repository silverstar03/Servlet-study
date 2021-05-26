package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rp")
public class RequestProtocal extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html><head><title>요청방식과 프로토콜</title></head><body>");
		out.print("<p>request URI : " + req.getRequestURI() + "</p>");
		out.print("<p>Server name : " + req.getServerName() + "</p>");
		out.print("<p>Server Port : " + req.getServerPort() + "</p>");
		out.print("<p>client addr : " + req.getRemoteAddr() + "</p>");
		out.print("<p>client Host : " + req.getRemoteHost() + "</p>");
		out.print("<p>client Port : " + req.getRemotePort() + "</p> </body></html>");
	}
}

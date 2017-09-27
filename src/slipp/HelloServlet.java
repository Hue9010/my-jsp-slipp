package slipp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="hello", urlPatterns= {"/hello", "/helloworld"})
public class HelloServlet extends HttpServlet{
	private String name;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		name = req.getParameter("name");
		
		PrintWriter out = res.getWriter();
		out.println("success");
		out.print(name + " Hello World!");
	}
}

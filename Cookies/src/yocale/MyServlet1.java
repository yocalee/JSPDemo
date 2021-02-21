package yocale;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class MyServlet1 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			String name = request.getParameter("username");
			String password = request.getParameter("userPassword");
			pw.print("Hello here: " + name);
			pw.print("  Your password is: " + password);
//			creating two cookies
			Cookie cookie1 = new Cookie("username", name);
			Cookie cookie2 = new Cookie("userPassword", password);
//			adding the cookies to response header
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			pw.print("<a href='welcomehere'>View Details</a>");
			pw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

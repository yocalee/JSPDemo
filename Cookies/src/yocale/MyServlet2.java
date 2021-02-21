package yocale;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcomehere")
public class MyServlet2 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
//			Reading cookies
			Cookie[] cookies = request.getCookies();
//			displaying user name value from cookie
			pw.print("Cookie Name: "  + cookies[0].getValue());
			pw.print("Cookie Password: " + cookies[1].getValue());
			pw.print("<a href='login'>View Details</a>");
			pw.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

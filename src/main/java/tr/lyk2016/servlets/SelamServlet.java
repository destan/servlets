package tr.lyk2016.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/selam")
public class SelamServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		
//		resp.getWriter().write("Selam " + name);
		
		req.setAttribute("user", name);
		req.getRequestDispatcher("selam.jsp").forward(req, resp);
	}
}

package tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mondai5_1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; chareset=UTF-8");

		PrintWriter out=response.getWriter();

		out.println("<html><head><title>enjoy java!</title></head>");
		out.println("<body><h1>I am really enjenjoyingoying studying java!!</h1></body></html>");


	}

}

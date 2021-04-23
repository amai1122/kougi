package tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mondai7_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		out.println("<html><head><title>Mondai7_2</title></head>");
		out.println("<body><h1>入力フォーム</h1></html>");
		out.println("<table>");
			out.println("<tr><td>名前</td><td><input type = \"text\" name=\"name\"/></td></tr>");
			out.println("<tr><td>誕生日</td>");
			out.println("<td><select name=\"month\">");

			//月
			for (int m = 1; m <= 12; m++) {
				out.println("<option value=\"" + m + "\">" + m + "</option>");
			}
			out.println("月</select>");

			//日
			out.println("<select name=\"day\">");
			for (int d = 1; d <= 31; d++) {
				out.println("<option value=\"" + d + "\">" + d + "</option>");
			}
			out.println("日</select></td></tr>");
		out.println("</table");
		out.println("</body>");
		out.println("</html>");
	}

}

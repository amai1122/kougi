package tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFavorite extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("UTF-8");

		String eat= request.getParameter("eat");
		String song= request.getParameter("song");
		String[] lang=request.getParameterValues("lang");


        out.println("<html><head><title>好きなものを出力</title></head>");
        out.println("<body>");
        out.println("私の好きな食べ物は"+ eat +"です。<br>");
        out.println("私の好きな歌は"+ song +"です。<br>");
        for(String lan:lang) {
        	out.println("私の好きな言語は"+ lan +"です。<br>");
        }
        out.println("</body>");
        out.println("</html>");

	}

}

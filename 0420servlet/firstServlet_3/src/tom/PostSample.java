package tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostSample extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) //←doGetをdoPostに変更
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>doPostメソッドのサンプル</title></head>");
        out.println("<body><h1>doPostメソッドで実行しています。</h1></body></html>");
    }
}
package tom;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JspSrvSample1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 文字コードを指定
        request.setCharacterEncoding("UTF-8");

        // 入力データを取得
        String name = request.getParameter("name");
        String furigana = request.getParameter("furigana");
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");

        //追加
        String gender =request.getParameter("gender");
        String bikou =request.getParameter("bikou");
        //

        // JspSrvBeanオブジェクト生成
        JspSrvBean bn = new JspSrvBean();

        // 取得したデータをJspSrvBeanオブジェクトに設定
        bn.setName(name);
        bn.setFurigana(furigana);
        bn.setBirthday(year + "年" + month + "月" + day + "日");
        //追加
        bn.setGender(gender);
        bn.setBikou(bikou);
        //


        // 取得したデータをHttpServletRequestオブジェクトに設定
        request.setAttribute("bn", bn);


        // 次のJSPを設定
        RequestDispatcher rd = request.getRequestDispatcher("/jsp/jspSrvBeanResultSample1.jsp");

        // 次のJSPに遷移
        rd.forward(request, response);
    }
}
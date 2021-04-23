package tom;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchDetailSample extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 定数定義
        final String NEXTPAGE_PATH = "/jsp/searchDetailSample.jsp";

        // 次のJSPのパス格納用変数定義
        String path = "";

        // 文字コードを指定
        request.setCharacterEncoding("UTF-8");

        // 入力データを取得
        String furigana = request.getParameter("furigana");
        String birthday = request.getParameter("birthday");

        // 次のJSPのパスを設定
        path = NEXTPAGE_PATH;

        // MemberInfoBeanオブジェクト生成
        MemberInfoBean mb = new MemberInfoBean();

        // 取得したデータをMemberInfoBeanオブジェクトに設定
        mb.setFurigana(furigana);
        mb.setBirthday(birthday);

        // MemberInfoBeanオブジェクトをrequestにセット
        request.setAttribute("mb", mb);

        // 次のJSPに遷移
        RequestDispatcher rd = request.getRequestDispatcher(path);
        rd.forward(request, response);
    }
}
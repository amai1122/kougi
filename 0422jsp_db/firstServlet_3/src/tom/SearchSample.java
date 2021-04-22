package tom;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchSample extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 定数定義
        final String NEXTPAGE_PATH = "/JSP/searchResultSample.jsp";
        final String ERRORPAGE_PATH = "/JSP/searchErrorSample.jsp";

        // 次のJSPのパス格納用変数定義
        String path = "";

        // 文字コードを指定
        request.setCharacterEncoding("UTF-8");

        // 入力データを取得
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        // 次のJSPのパスを設定
        path = NEXTPAGE_PATH;

        // データベースへの検索処理*****************************************************/
        try {
            SearchSampleDBAccess sdb = new SearchSampleDBAccess();

            List<MemberInfoBean> list = sdb.searchMemberInfo(name, age);

            // listをrequestにセット
            request.setAttribute("memberList", list);


        } catch (Exception e) {
            e.printStackTrace();

            // 例外発生時は、エラー画面のパスを設定
            path = ERRORPAGE_PATH;
        }

        // 次のJSPに遷移
        RequestDispatcher rd = request.getRequestDispatcher(path);
        rd.forward(request, response);
    }
}
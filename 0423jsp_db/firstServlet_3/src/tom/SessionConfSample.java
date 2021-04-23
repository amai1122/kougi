package tom;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionConfSample extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 定数定義
        final String NEXTPAGE_PATH = "/jsp/sessionEndSample.jsp";
        final String BACKPAGE_PATH = "/jsp/sessionInputSample.jsp";

        // 次のJSPのパス格納用変数定義
        String path = "";

        // 戻るボタン押下時処理*****************************************************/
        if (request.getParameter("back") != null) {
            // 次のJSPのパスを設定
            path = BACKPAGE_PATH;
        // 確認ボタン押下時処理*****************************************************/
        } else {
            // 次のJSPのパスを設定
            path = NEXTPAGE_PATH;
        }

        // 次のJSPに遷移
        RequestDispatcher rd = request.getRequestDispatcher(path);
        rd.forward(request, response);
    }
}
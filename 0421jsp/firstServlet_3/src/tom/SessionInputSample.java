package tom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionInputSample extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 定数定義
        final String NEXTPAGE_PATH = "/jsp/sessionConfSample.jsp";
        final String ERRORPAGE_PATH = "/jsp/sessionInputSample.jsp";

        // セッションオブジェクト生成(取得)
        HttpSession session = request.getSession();

        // 文字コードを指定
        request.setCharacterEncoding("UTF-8");

        // 入力データを取得
        String name = request.getParameter("name");
        String furigana = request.getParameter("furigana");
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");

        //練習問題5_1で追加
        //エラーリストを作成
        List<String> errorlist = new ArrayList<String>();
        //空欄の場合、errorとするerrorリストに保存
        if()

        // InputBeanオブジェクト生成
        InputBean bn = new InputBean();

        // 取得したデータをInputBeanオブジェクトに設定
        bn.setName(name);
        bn.setFurigana(furigana);
        bn.setYear(year);
        bn.setMonth(month);
        bn.setDay(day);
        bn.setBirthday(year + "年" + month + "月" + day + "日");

        // InputBeanオブジェクトをsessionにセット
        session.setAttribute("bn", bn);

        // 次のJSPのパスを設定
        //練習問題5_1で追加
        //空欄があった場合、元の画面に行く
        if() {
        	String path = NEXTPAGE_PATH;
        }

        // 次のJSPに遷移
        RequestDispatcher rd = request.getRequestDispatcher(path);
        rd.forward(request, response);
    }
}
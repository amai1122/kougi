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

public class Product_Mondai5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//遷移先定義
		final String NEXTPAGE_PATH = "/jsp/product_end_mondai5.jsp";
		final String ERRORPAGE_PATH = "/jsp/product_mondai5.jsp";
		String path = null;

		// セッションオブジェクト生成(取得)
		HttpSession session = request.getSession();

		// 文字コードを指定
		request.setCharacterEncoding("UTF-8");

		//リクエスト情報取得
		String product_name = request.getParameter("product_name");
		String min_price = request.getParameter("min_price");
		String max_price = request.getParameter("max_price");

		//商品名、定価に空欄があればErrorListに追加
		List<String> errorlist = new ArrayList<String>();
		if (product_name == null || "".equals(product_name)) {
			errorlist.add("「商品名」の検索条件を入力してください");
		}
		if (min_price == null || "".equals(min_price)) {
			errorlist.add("「定価」の検索条件（起点）を入力してください");
		}
		if (max_price == null || "".equals(max_price)) {
			errorlist.add("「定価」の検索条件（終点）を入力してください");
		}

		//入力値をsessionにセット
		Product_In_Bean br = new Product_In_Bean();
		session.setAttribute("br", br);

		//空欄がなければDBAにデータを渡す
		if (errorlist.isEmpty()) {
			//結果のリスト格納
			List<ProductBean> bn = new ArrayList<ProductBean>();

			//DBAccessに値を引数で渡す
			ProductDBAccess dba = new ProductDBAccess();
			bn = dba.productSearch(product_name, min_price, max_price);

			//次の行先をセットする
			path = NEXTPAGE_PATH;
			//読み込めた場合、検索結果をリクエストに渡す
			request.setAttribute("bn", bn);

			for(ProductBean ss:bn) {
			String a = ss.getProduct_id();
			String b = ss.getProduct_name();
			String c = ss.getCategory_id();
			String d = ss.getPrice();
			}


		} else {

			//空欄の場合、エラーリストをリクエストに渡す
			request.setAttribute("errorList", errorlist);
			//エラーの行先をセットする
			path = ERRORPAGE_PATH;
		}
		// 次のJSPに遷移
		RequestDispatcher bn = request.getRequestDispatcher(path);
		bn.forward(request, response);

	}

}

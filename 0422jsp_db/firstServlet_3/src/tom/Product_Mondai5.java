package tom;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Product_Mondai5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//遷移先定義
		final String NEXTPAGE_PATH ="/jsp/product_end_mondai5.jsp";
		final String ERRORPAGE_PATH = "/jsp/product_mondai5.jsp";

		//リクエスト情報取得


		//商品名、定価に空欄があればErrorListに追加



		//空欄がなければDBAにデータを渡す





		//次の行先をセットする

	}

}

package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class JdbcMondaiDBAccess {
	public void insertProductInfo(List<JdbcMondaiBean> list) throws ClassNotFoundException, SQLException {
		// DB接続、SQL発行に必要となるインターフェースの宣言
		Connection conn = null;
		PreparedStatement pstmt = null;
		String inPproductId = null;
		String inProductName = null;
		int inCategoryId = 0;
		int inPrice = 0;

		String sqlStr = null;

		try {
			// JDBCドライバーのロード
			Class.forName("org.mariadb.jdbc.Driver");

			// MariaDB接
			conn = DriverManager.getConnection("jdbc:mariadb://localhost/techfun", "root", "");

			// 自動コミットをオフに設定
			conn.setAutoCommit(false);

			//Listから読込みDBに保存

			for (JdbcMondaiBean mondaiBean : list) {//実行結果の読込

				// リストから値をセット
				inPproductId = mondaiBean.getProductId();
				inProductName = mondaiBean.getProductName();
				inCategoryId = mondaiBean.getCategoryId();
				inPrice = mondaiBean.getPrice();

				// INSERT文の文字列
				sqlStr = "INSERT INTO product("
						+ "product_id,product_name,category_id,price"
						+ ") VALUES ('"
						+ inPproductId + "','" + inProductName + "','"
						+ inCategoryId + "','" + inPrice + "');";

				// プリペアドステートメント生成
				pstmt = conn.prepareStatement(sqlStr);

				// INSERT文実行
				pstmt.executeUpdate();

				// プリペアドステートメントをクローズ
				pstmt.close();

				//				System.out.println(inPproductId + "\t" + inProductName + "\t"
				//						+ inCategoryId + "\t" + inPrice);
			}
			//処理を確定
			conn.commit();

		} catch (SQLException e) {

			try {
				if (conn != null) {
					//ロールバック処理
					conn.rollback();
				}
			} catch (SQLException ex) {
				throw ex;
			}

			throw e;
		} finally {
			if (pstmt != null) {
				// クローズ処理
				pstmt.close();
			}
			if (conn != null) {
				// 接続をクローズ
				conn.close();

			}
		}
	}
}
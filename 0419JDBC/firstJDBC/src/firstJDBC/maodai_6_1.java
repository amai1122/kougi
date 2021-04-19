package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class maodai_6_1 {

	public static void main(String[] args) {

		// DB接続、SQL発行に必要となるインターフェースの宣言
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sqlStr = null;
		try {
			// JDBCドライバーのロード
			Class.forName("org.mariadb.jdbc.Driver");

			// MariaDB接
			conn = DriverManager.getConnection("jdbc:mariadb://localhost/techfun", "root", "");

			// CREATE文の文字列
			sqlStr = "CREATE TABLE jdbc_user_table("
					+ "id INT PRIMARY KEY,"
					+ "name VARCHAR(30)NOT NULL,"
					+ "lang VARCHAR(8)NOT NULL)";
			// プリペアドステートメント生成（CREATE文をプリコンパイル）
			pstmt = conn.prepareStatement(sqlStr);

			// CREATE文実行（employeeテーブル作成）
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// 例外処理はここでは省略しています
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("すでにテーブルが作成されています");

		} finally {
			if (pstmt != null) {
				try {
					// プリペアドステートメントをクローズ
					pstmt.close();
				} catch (SQLException e) {
					// 例外処理はここでは省略しています
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					// 接続をクローズ
					conn.close();

				} catch (SQLException e) {
					// 例外処理はここでは省略しています
					e.printStackTrace();
				}
			}
		}

	}

}

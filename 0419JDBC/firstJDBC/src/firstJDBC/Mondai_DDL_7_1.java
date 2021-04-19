package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mondai_DDL_7_1 {

	public static void main(String[] args) {
		// DB接続、SQL発行に必要となるインターフェースの宣言
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sqlStr = null;
		String sqlStr1 = null;
		String sqlStr2 = null;
		String sqlStr3 = null;
		ResultSet rset = null;

		try {
			// JDBCドライバーのロード
			Class.forName("org.mariadb.jdbc.Driver");

			// MariaDB接
			conn = DriverManager.getConnection("jdbc:mariadb://localhost/techfun", "root", "");

			// 自動コミットをオフに設定
			conn.setAutoCommit(false);

			// CREATE文の文字列ID1
			sqlStr1 = "INSERT INTO jdbc_user_table("
					+ "id ,name ,lang) "
					+ "VALUES("
					+ "'1','山田','日本語' )";

			// プリペアドステートメント生成（CREATE文をプリコンパイル）
			pstmt = conn.prepareStatement(sqlStr1);

			// CREATE文実行
			pstmt.executeUpdate();
			// プリペアドステートメントをクローズ
			pstmt.close();

			// CREATE文の文字列_ID2
			sqlStr2 = "INSERT INTO jdbc_user_table("
					+ "id ,name ,lang) "
					+ "VALUES("
					+ "'2','金','韓国語' )";
			// プリペアドステートメント生成（CREATE文をプリコンパイル）
			pstmt = conn.prepareStatement(sqlStr2);

			// CREATE文実行
			pstmt.executeUpdate();
			// プリペアドステートメントをクローズ
			pstmt.close();

			// CREATE文の文字列_ID3
			sqlStr3 = "INSERT INTO jdbc_user_table("
					+ "id ,name ,lang) "
					+ "VALUES("
					+ "'3','ルイス','ドイツ語' )";
			// プリペアドステートメント生成（CREATE文をプリコンパイル）
			pstmt = conn.prepareStatement(sqlStr3);

			// CREATE文実行
			pstmt.executeUpdate();
			// プリペアドステートメントをクローズ
			pstmt.close();

			// CREATE文の文字列_ID3
			sqlStr3 = "UPDATE jdbc_user_table SET "
					+ "lang = '英語' WHERE id='3'";

			// プリペアドステートメント生成（CREATE文をプリコンパイル）
			pstmt = conn.prepareStatement(sqlStr3);

			// CREATE文実行
			pstmt.executeUpdate();
			// プリペアドステートメントをクローズ
			pstmt.close();

			conn.commit();

			// SQL文の文字列
			sqlStr = "SELECT * FROM jdbc_user_table";

			// プリペアドステートメント生成//接続のオブジェクトを使ってプリペアドステートメント生成
			pstmt = conn.prepareStatement(sqlStr);

			// SQL文実行//プリペアドステートメントを使ってSQLを実行
			rset = pstmt.executeQuery();

			// SQL実行結果表示
			while (rset.next()) {//実行結果の読込
				// コンソール出力
				System.out.println(rset.getString("id") + "\t"
						+ rset.getString("name") + "\t"
						+ rset.getString("lang"));
			}

		} catch (SQLException e) {
			e.printStackTrace();

			try {
				if (conn != null) {
					//ロールバック処理
					conn.rollback();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

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

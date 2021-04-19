package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcSampleDDL {

	public static void main(String[] args) {

		// DB接続、SQL発行に必要となるインターフェースの宣言
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sqlStr = null;

		try {
			// JDBCドライバーのロード
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("JDBCドライバーをロードしました...");

			// MariaDB接続
			conn = DriverManager.getConnection("jdbc:mariadb://localhost/techfun", "root", "");
			System.out.println("データベースに接続しました...");

			// CREATE文の文字列
			sqlStr = "CREATE TABLE employee("
					+ "  empno INT AUTO_INCREMENT PRIMARY KEY"
					+ ", ename VARCHAR(20)"
					+ ", job VARCHAR(9)"
					+ ", mgr INT"
					+ ", hiredate DATE"
					+ ", sal INT"
					+ ", comm INT"
					+ ", deptno INT"
					+ ")";

			// プリペアドステートメント生成（CREATE文をプリコンパイル）
			pstmt = conn.prepareStatement(sqlStr);

			// CREATE文実行（employeeテーブル作成）
			pstmt.executeUpdate();
			System.out.println("employee表を作成しました...");

			// プリペアドステートメントをクローズ
			pstmt.close();

			// INSERT文の文字列
			sqlStr = "INSERT INTO employee VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

			// プリペアドステートメント生成（INSERT文をプリコンパイル）
			pstmt = conn.prepareStatement(sqlStr);

			// パラメータを設定
			pstmt.setInt(1, 0);
			pstmt.setString(2, "CHRISTINE");
			pstmt.setString(3, "PRES");
			pstmt.setInt(4, 18);
			pstmt.setString(5, "1965-01-01");
			pstmt.setInt(6, 52750);
			pstmt.setInt(7, 4220);
			pstmt.setInt(8, 00);

			// INSERT文実行
			pstmt.executeUpdate();
			System.out.println("employee表に値を挿入しました...");

		} catch (ClassNotFoundException e) {
			// 例外処理はここでは省略しています
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("SQLExceptionが発生しました...");

			// エラーメッセージを出力
			System.out.println("エラーメッセージ: " + e.getMessage());

			// エラーコードを出力
			System.out.println("エラーコード: " + e.getErrorCode());

			// 全てのエラーログを出力
			e.printStackTrace();

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
					System.out.println("接続をクローズしました...");
				} catch (SQLException e) {
					// 例外処理はここでは省略しています
					e.printStackTrace();
				}
			}
		}

	}

}

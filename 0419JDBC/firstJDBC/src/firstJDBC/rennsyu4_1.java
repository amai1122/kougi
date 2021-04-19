package firstJDBC;

//「java.sql」パッケージのクラスをインポート
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class rennsyu4_1 {

	public static void main(String[] args) {
		// DB接続、SQL発行に必要となるインターフェースの宣言
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sqlStr = null;

		try {
			// JDBCドライバーのロード
			Class.forName("org.mariadb.jdbc.Driver");

			// MariaDB接続
			conn = DriverManager.getConnection("jdbc:mariadb://localhost/techfun", "root", "");

			// SQL文の文字列
			sqlStr = "SELECT name,prefecture,city,oaddress FROM member";

			// プリペアドステートメント生成//接続のオブジェクトを使ってプリペアドステートメント生成
			pstmt = conn.prepareStatement(sqlStr);

			// SQL文実行//プリペアドステートメントを使ってSQLを実行
			rset = pstmt.executeQuery();

			// SQL実行結果表示
			while (rset.next()) {//実行結果の読込
				// コンソール出力
				System.out.println(rset.getString("name") + "\t"
						+ rset.getString("prefecture") + "\t"
						+ rset.getString("city") + "\t"
						+ rset.getString("oaddress"));
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (rset != null) {
				try {
					// 結果セットをクローズ
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
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					// 接続をクローズ
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}
}

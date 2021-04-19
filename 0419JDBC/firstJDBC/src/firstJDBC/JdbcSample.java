package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSample {
	public static void main(String[] args) {
		// DB接続、SQL発行に必要となるインターフェースの宣言
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sqlStr = null;
		int empno = 0;

		// 新規に登録する従業員名の配列を定義
		String[] newEname = { "NAOKI", "SABURO", "RYOKO" };

		try {
			// JDBCドライバーのロード
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("JDBCドライバーをロードしました...");

			// MariaDB接続
			conn = DriverManager.getConnection("jdbc:mariadb://localhost/techfun", "root", "");
			System.out.println("データベースに接続しました...");

			// 自動コミットをオフに設定
			conn.setAutoCommit(false);

			// INSERT文の文字列
			sqlStr = "INSERT INTO employee (empno, ename, sal, deptno) "
					+ "VALUES (?, ?, ?, ?)";

			// プリペアドステートメント生成（INSERT文をプリコンパイル）
			pstmt = conn.prepareStatement(sqlStr, Statement.RETURN_GENERATED_KEYS);

			for (String name : newEname) {
				// パラメータを設定
				pstmt.setInt(1, 0);
				pstmt.setString(2, name);
				pstmt.setInt(3, 10000);
				pstmt.setInt(4, 10);

				// INSERT文実行
				pstmt.executeUpdate();
				System.out.println("INSERT文を実行しました...");
			}

			// 自動採番キー（empno）の取り出し
			rset = pstmt.getGeneratedKeys();
			rset.next();
			empno = rset.getInt(1);
			System.out.println("empno：" + empno + "のレコードにUPDATE処理を実行する");

			// プリペアドステートメントをクローズ
			pstmt.close();

			// UPDATE文の文字列
			sqlStr = "UPDATE employee SET sal = ?"
					+ " WHERE empno = ?";

			// プリペアドステートメント生成（UPDATE文をプリコンパイル）
			pstmt = conn.prepareStatement(sqlStr);

			// パラメータを設定
			pstmt.setInt(1, 50000);
			pstmt.setInt(2, empno);

			// UPDATE文実行
			pstmt.executeUpdate();
			System.out.println("UPDATE文を実行しました...");

			// トランザクションをコミット
			conn.commit();
			System.out.println("コミットしました...");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

			try {
				// 接続されていた場合、ロールバック
				if (conn != null) {
					conn.rollback();
					System.out.println("ロールバックしました...");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

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
					System.out.println("接続をクローズしました...");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

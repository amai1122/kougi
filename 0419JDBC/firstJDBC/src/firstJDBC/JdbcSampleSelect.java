package firstJDBC;

//「java.sql」パッケージのクラスをインポート
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSampleSelect {

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
            sqlStr = "SELECT product_name, price FROM product";

            // プリペアドステートメント生成
            pstmt = conn.prepareStatement(sqlStr);

            // SQL文実行
            rset = pstmt.executeQuery();

            // SQL実行結果表示
            while (rset.next()) {
                // 列名指定による表示
                System.out.println(rset.getString("product_name") + "\t" + rset.getInt("price"));
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

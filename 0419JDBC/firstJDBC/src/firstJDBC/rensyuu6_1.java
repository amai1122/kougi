package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class rensyuu6_1 {

	public static void main(String[] args) {
		// DB接続、SQL発行に必要となるインターフェースの宣言
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sqlStr = null;
		//リストのインスタンス化
		List<MemberBean> sqlRist = new ArrayList<MemberBean>();

		//納品予定ファイルを読み込み
		try {
			// JDBCドライバーのロード
			Class.forName("org.mariadb.jdbc.Driver");

			// MariaDB接続
			conn = DriverManager.getConnection("jdbc:mariadb://localhost/techfun", "root", "");

			// SQL文の文字列
			sqlStr = "SELECT name, prefecture, city, oaddress FROM member";

			// プリペアドステートメント生成
			pstmt = conn.prepareStatement(sqlStr);

			// SQL文実行
			rset = pstmt.executeQuery();

			// SQL実行結果格納
			while (rset.next()) {//実行結果の読込

				MemberBean bean1 = new MemberBean();//beanのインスタンス化

				bean1.setName(rset.getString("name"));
				bean1.setPrefecture(rset.getString("prefecture"));
				bean1.setCity(rset.getString("city"));
				bean1.setOaddress(rset.getString("oaddress"));

				//baenをリストにSET
				sqlRist.add(bean1);

			}
			for (MemberBean sqlBaen : sqlRist) {

				System.out.println(
						sqlBaen.getName() + "\t" + sqlBaen.getPrefecture() + "\t" + sqlBaen.getCity() + "\t"
								+ sqlBaen.getOaddress());
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

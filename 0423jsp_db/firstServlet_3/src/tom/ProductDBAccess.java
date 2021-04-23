package tom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDBAccess {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sqlStr = null;
	List<ProductBean> list = new ArrayList<ProductBean>();

	protected List<ProductBean> productSearch(String product_name, String min_price, String max_price) {

		try {
			// JDBCドライバーのロード
			Class.forName("org.mariadb.jdbc.Driver");

			// MariaDB接続
			con = DriverManager.getConnection("jdbc:mariadb://localhost/techfun", "root", "");

			// SQL文の文字列
			sqlStr = "SELECT * FROM product WHELE price > ? AND price < ? LIKE ?";

			// プリペアドステートメント生成
			pstmt = con.prepareStatement(sqlStr);
			//パラメータ設定

			pstmt.setInt(1, Integer.valueOf(min_price));
			pstmt.setInt(2, Integer.valueOf(max_price));
			pstmt.setString(3, "%" + product_name + "%");

			// SQL文実行
			rs = pstmt.executeQuery();

			//結果をリストに設定する
			while (rs.next()) {
				ProductBean bn = new ProductBean();

				bn.setProduct_id(rs.getString(1));
				bn.setProduct_name(rs.getString(2));
				bn.setCategory_id(rs.getString(3));
				bn.setPrice(rs.getString(4));

				list.add(bn);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}
}

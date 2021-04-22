package tom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SearchSampleDBAccess {

    protected List<MemberInfoBean> searchMemberInfo(String name, String age) throws Exception {

        // データベースへの検索処理*****************************************************/
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sqlStr = null;
        List<MemberInfoBean> list = new ArrayList<MemberInfoBean>();

        try {
            // JDBCドライバーのロード
            Class.forName("org.mariadb.jdbc.Driver");

            // MariaDB接続
            con = DriverManager.getConnection("jdbc:mariadb://localhost/techfun", "root", "");

            // SQL文の文字列
            sqlStr ="SELECT * FROM member_info WHERE name LIKE ?";

            // 年齢が入力されていた場合
            String birthday = null;
            if (!age.equals("")) {
                LocalDate ld = LocalDate.now();
                int year = ld.getYear() - Integer.parseInt(age) - 1;
                int month = ld.getMonthValue();
                int day = ld.getDayOfMonth();

                birthday = String.format("%04d%02d%02d", year, month, day);

                sqlStr += " AND birthday > ?";
            }

            // プリペアドステートメント生成
            pstmt = con.prepareStatement(sqlStr);

            // パラメータを設定
            pstmt.setString(1, "%" + name + "%");
            if (!age.equals("")) {
                pstmt.setString(2, birthday);
            }

            // SQL文実行
            rs =pstmt.executeQuery();

            // 取得データをListにセット
            while (rs.next()) {
                MemberInfoBean bn = new MemberInfoBean();
                bn.setName(rs.getString(2));
                bn.setFurigana(rs.getString(3));
                String[] birthdaySpl = rs.getString(4).split("-");
                bn.setYear(birthdaySpl[0]);
                bn.setMonth(birthdaySpl[1]);
                bn.setDay(birthdaySpl[2]);

                list.add(bn);
            }

        } finally {

            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }
}
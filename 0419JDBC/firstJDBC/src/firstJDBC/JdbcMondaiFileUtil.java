package firstJDBC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JdbcMondaiFileUtil {
	public List<JdbcMondaiBean> readProductFile(String filePath) throws IOException {

        // ファイルから読み込んだデータを格納するリストを定義
        List<JdbcMondaiBean> list = null;

        BufferedReader br = null;

        try {
            // ファイルの読み込み準備
            br = new BufferedReader(new FileReader(filePath));

            // リストを生成
            list = new ArrayList<JdbcMondaiBean>();

            // 読み込んだデータ格納用変数定義
            String str = "";

            // ファイルデータの読み込み
            while ((str = br.readLine()) != null) {

                // 読み込んだ文字列をカンマで分割
                String[] st = str.split(",");

                // JdbcMondaiBeanオブジェクト生成
                JdbcMondaiBean bean = new JdbcMondaiBean();
                // カンマで分割した値をJdbcMondaiBeanオブジェクトにセット
                bean.setProductId(st[0]);
                bean.setProductName(st[1]);
                bean.setCategoryId(Integer.parseInt(st[2]));
                bean.setPrice(Integer.parseInt(st[3]));
                // JdbcMondaiBeanオブジェクトをリストに格納
                list.add(bean);
            }

        } finally {
            if (br != null) {
                try {
                    // クローズ処理
                    br.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return list;
    }

}

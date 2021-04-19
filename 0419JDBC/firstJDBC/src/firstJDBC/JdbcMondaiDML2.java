package firstJDBC;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class JdbcMondaiDML2 {

	public static void main(String[] args) {

		// 読み込むファイルのパスを定義
		final String fPath = "C:\\temp\\productinfo.txt";

		// ファイルから読み込んだデータを格納するリストを定義
		List<JdbcMondaiBean> list = null;

		// JdbcMondaiFileUtilをインスタンス化
		JdbcMondaiFileUtil fileUtil = new JdbcMondaiFileUtil();

		try {
			System.out.println("ファイル読み込み処理を開始します。");

			// ファイルの読み込み
			list = fileUtil.readProductFile(fPath);

			// JdbcMondaiDBAccessをインスタンス化
			JdbcMondaiDBAccess dbAccess = new JdbcMondaiDBAccess();

			System.out.println("DB登録処理を開始します。");

			// DB登録処理
			dbAccess.insertProductInfo(list);

			System.out.println("処理が正常終了しました。");

		} catch (IOException e) {
			System.out.println("ファイルの読み込みに失敗しました。");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバーのロードに失敗しました。");
		} catch (SQLException e) {
			System.out.println("DB登録処理でエラーが発生しました。");
		} catch (Exception e) {
			System.out.println("予期せぬエラーが発生しました。");
		}

	}
}
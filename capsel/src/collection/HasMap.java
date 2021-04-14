package collection;

import java.util.HashMap;
import java.util.Map;

public class HasMap {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("大阪府", "大阪市");
		map.put("兵庫県", "神戸市");
		map.put("滋賀県", "大津市");

		// 兵庫県をキーとした場合の値を取得する
		String val = map.get("兵庫県");
		System.out.println("val = " + val);

		// キーに存在しない場合は null が取得される
		val = map.get("東京都");
		System.out.println("val = " + val);

	}

}

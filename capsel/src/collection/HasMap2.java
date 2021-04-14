package collection;

import java.util.HashMap;
import java.util.Map;

public class HasMap2 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("大阪府", "大阪市");
		map.put("兵庫県", "神戸市");
		map.put("滋賀県", "大津市");

		// keySetメソッドを利用してキーを全件取得する
		for (String key : map.keySet()) {
			System.out.println(key);
		}

		// valuesメソッドを利用して値を全件取得する
		for (String value : map.values()) {
			System.out.println(value);
		}
	}

}

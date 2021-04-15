package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Mondai8_1 {

	public static void main(String[] args) {
		System.out.println("「!」+Enterで終了");

		Map<String, String> map = new HashMap<String, String>();
		map.put("りんご", "apple");
		map.put("バナナ", "banana");
		map.put("なし", "pear");
		map.put("もも", "peach");

		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String key = "";

			while (!key.equals("!")) {
				System.out.println("この後に入力＞");
				key = br.readLine();//コンソールの入力

				if (key.equals("!")) {
					break;
				}
				//Mapにあるなら
				if (map.containsKey(key)) {
					System.out.println(key + "を英語で表現すると・・" + map.get(key) + "です。");
				} else {
					System.out.println(key + "を英語で表現すると・・わかりません");
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

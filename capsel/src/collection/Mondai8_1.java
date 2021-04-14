package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Mondai8_1 {

	public static void main(String[] args) {

		BufferedReader br = null;

		Map<String, String> map = new HashMap<String, String>();
		map.put("りんご", "apple");
		map.put("バナナ", "banana");
		map.put("なし", "pear");
		map.put("もも", "peach");

		System.out.println(" 「!」＋ Enterで終了");

		try {
			br = new BufferedReader(new InputStreamReader(System.in));//入力ストリーム
			String str = "";

			while (!str.equals("!")) {

				System.out.println("この後に入力 >");

				str = br.readLine();//コンソール読み込み

				// 入力したキーワードで検索
				String val = map.get(str);

				if (!str.equals("!")) {
//					if (val != null) {
					if(map.containsKey(str)) {
						System.out.println(str + "を英語で表現すると・・" + val + "です。");
					} else {
						System.out.println(str + "を英語で表現すると・・わかりません。");
					}
				}
			}
		} catch (IOException e) {
			// 例外内容を表示します
			e.printStackTrace();

		} finally {
			if (br != null) {
				try {
					// ストリームをクローズします
					br.close();

				} catch (IOException e) {
					// 例外内容を表示します
					e.printStackTrace();
				}
			}
		}

	}

}

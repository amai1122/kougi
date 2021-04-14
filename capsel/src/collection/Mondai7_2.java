package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Mondai7_2 {

	public static void main(String[] args) {
		System.out.println(" 「!」＋ Enterで終了");
		BufferedReader br = null;

		try {
			List<String> list = new ArrayList<String>();// ArrayListクラスのインスタンス化

			br = new BufferedReader(new InputStreamReader(System.in));//入力ストリーム
			String str = "";

			int i = 0;
			while (i < 4) {//４回まで入力

				System.out.println("この後に入力 >");

				str = br.readLine();

				if (str.equals("!")) {//！を入力で終了
					break;
				}

				// 入力した値をリストに格納
				list.add(str);

				i++;

			}
			for (String str2 : list) {
				System.out.println(str2);
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

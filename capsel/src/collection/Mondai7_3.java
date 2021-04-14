package collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mondai7_3 {
	public static void main(String[] args) {
		BufferedReader br = null;

		List<String> list = new ArrayList<String>();// ArrayListクラスのインスタンス化

		try {
			// ファイルを指定して読み込むストリームを生成します
			br = new BufferedReader(new FileReader("C:\\temp\\list_test.txt"));

			String str = null;

			// ファイルには複数行文字が記述されてる場合もあるので繰り返し処理
			while ((str = br.readLine()) != null) {
				// 読み込んだファイルの内容をリストに追加
				list.add(str);
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

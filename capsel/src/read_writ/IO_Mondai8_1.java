package read_writ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_Mondai8_1 {

	public static void main(String[] args) {

		System.out.println(" 「!」＋ Enterで終了");
		BufferedReader br = null;

		try {
			String[] Cin = new String[4];

			br = new BufferedReader(new InputStreamReader(System.in));//入力ストリーム
			String str = "";

			int i = 0;
			while (i < Cin.length) {//４回まで入力


				System.out.println("この後に入力 >");

				str = br.readLine();

				if (str.equals("!")) {//！を入力で終了
					break;
				}

				// 入力した値を配列に格納
				Cin[i] = str;

				i++;
			}
			i = 0;
			while (i < Cin.length) {
				if (Cin[i] != null) {
					System.out.println(Cin[i]);
				}
				i++;
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

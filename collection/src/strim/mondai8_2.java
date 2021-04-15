package strim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mondai8_2 {

	public static void main(String[] args) {

		System.out.println("「!」+Enterで終了");

		BufferedReader br = null;//バッファを定義

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
			int i = 0;
			String[] fruit = new String[4];

			//配列の分ループ
			while (i < fruit.length) {
				System.out.println("この後に入力＞");
				str = br.readLine();
				if (str.equals("!")) {
					break;
				}
				fruit[i] = str;

				i++;
			}

			for (i = fruit.length - 1; -4 <= i - fruit.length; i--) {
				if (fruit[i] != null) {
					System.out.println(fruit[i]);

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
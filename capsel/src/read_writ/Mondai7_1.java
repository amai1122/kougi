package read_writ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mondai7_1 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			//ストリームの生成
			br = new BufferedReader(new FileReader("C:\\temp\\mondaitemp1.txt"));

			bw = new BufferedWriter(new FileWriter("C:\\temp\\mondaikekka1.txt"));

			String str = null;

			while ((str = br.readLine()) != null) {//1行づつ読み込んで行がなくなるまで繰り返す
				// 読み込んだファイルの内容をファイルに書き込みします
				bw.write(str);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {//バッファに何も無ければ閉じる
				try {
					br.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bw != null) {
                try {
                    // 書き込みストリームをクローズします
                    bw.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
		}
	}

}

package read_writ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOtest2 {

	public static void main(String[] args) {

        // 開始のメッセージを出力します
        System.out.println("ファイルtemp1.txtからバッファに読み込む");

        BufferedReader br = null;

        try {
            // ファイルを指定して読み込むストリームを生成します
            br = new BufferedReader(new FileReader("C:\\temp\\temp1.txt"));

            String str = null;

            // ファイルには複数行文字が記述されてる場合もあるので繰り返し処理
            while ((str = br.readLine()) != null) {
                // 読み込んだファイルの内容を一行ずつ表示します
                System.out.println(str);
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

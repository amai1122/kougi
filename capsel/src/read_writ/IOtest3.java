package read_writ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOtest3 {

	public static void main(String[] args) {
        System.out.println("キーボードから入力した内容をtemp2.txtに書き込みます");

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // コンソールからの入力を取得
            br = new BufferedReader(new InputStreamReader(System.in));

            String str = "";
            System.out.println("この後に入力 > ");
            str = br.readLine();

            // 書き込みストリームを生成します。
         // FileWriter() の引数に true を記述することでファイルへの追加書き込みとなります
            bw = new BufferedWriter(new FileWriter("C:\\temp\\temp2.txt",true));
            // ファイルに書き込みします
            bw.write(str);

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (br != null) {
                try {
                    // 読み込みストリームをクローズします
                    br.close();

                } catch(IOException e) {
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

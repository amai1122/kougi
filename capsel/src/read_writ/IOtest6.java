package read_writ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOtest6 {

	public static void main(String[] args) {
        System.out.println(" 「!」＋ Enterで終了");

        // 入力ストリームを生成します
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // tryのあとの()にストリームオブジェクトの変数を記述します
        try (br) {

            String str = "";

            // ! をコンソールで入力するまで、入力待機状態を繰り返します
            while (!str.equals("!")) {

                System.out.println("この後に入力 >");

                // 入力した値を読み込み、str変数に代入しています
                str = br.readLine();

                // 入力した値をコンソールに表示します
                System.out.println("入力した値は「" + str + "」です。");
            }

        } catch (IOException e) {
            // 例外内容を表示します
            e.printStackTrace();
        }
    }

}

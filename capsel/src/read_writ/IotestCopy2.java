package read_writ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IotestCopy2 {

	public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;
        Path inputPath = Paths.get("C:\\temp\\temp1.txt");
        Path outputPath = Paths.get("C:\\temp\\temp21.txt");

        try {
            // ファイルを指定して読み込むストリームを生成します
            br = Files.newBufferedReader(inputPath);
            // 書き込みストリームを生成します
            bw = Files.newBufferedWriter(outputPath);

            String str = null;

            // ファイルには複数行文字が記述されてる場合もあるので繰り返し処理
            while ((str = br.readLine()) != null) {
                // 読み込んだファイルの内容をファイルに書き込みします
                bw.write(str);
                bw.newLine();
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
            if (bw != null) {
                try {
                    // ストリームをクローズします
                    bw.close();

                } catch (IOException e) {
                    // 例外内容を表示します
                    e.printStackTrace();
                }
            }
        }
    }

}

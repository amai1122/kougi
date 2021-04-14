package read_writ;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOtestPath {

	public static void main(String[] args) throws IOException {
		int a = 2;
		int b = 1;
		int c = 2;

		Path pathA = Paths.get("C:/temp/sample" + a + ".txt");
		Path pathB = Paths.get("C:/temp", "sample" + b + ".txt");
		Path pathC = Paths.get("C:", "temp", "sample" + c + ".txt");

		if (pathA.equals(pathB) && pathA.equals(pathC)) {
			System.out.println("pathAとpathBとpathCは同値です。");
		} else {
			System.out.println("pathAとpathBとpathCは同値ではありません。");
		}

		// 出力結果「pathAとpathBとpathCは同値です。」

	}

}

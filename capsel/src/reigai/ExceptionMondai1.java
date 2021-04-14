package reigai;

public class ExceptionMondai1 {

	public static void main(String[] args) {

		try {

			// コマンドライン引数で引き渡された値をint型に変換
			int num = Integer.parseInt(args[0]);
			if(num >=1000) {
				throw new MyErrException1();
			}
			// 10倍に計算
			int kekka = num * 10;

			// 10倍した結果を出力
			System.out.println(num + "の10倍は、" + kekka + "です。");

		} catch (NumberFormatException e) {
            // 例外発生時のメッセージ出力
            System.out.println("数字を入力してください。");

		} catch (MyErrException1 e) {
			System.out.println("1000未満の数字を入力してください");
		}
	}

}

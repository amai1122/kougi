package reigai;

public class Calc {
	public String getBaisu(String str) throws NumberFormatException, MyErrException2 {
		// 引数で渡された値をint型に変換
		int num = Integer.parseInt(str);

		/*  ここに追記（1000以上だったら、MyErrException2例外をthrow文で発生) */
		if (num >= 1000) {
			throw new MyErrException2();
		}

		// 引数で渡された値を10倍にして戻す
		return String.valueOf(num * 10);

	}
}

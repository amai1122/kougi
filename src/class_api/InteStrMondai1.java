package class_api;

public class InteStrMondai1 {

	public static void main(String[] args) {

		// 問題1 int型の250を内部に持つIntegerクラスのオブジェクトを生成し、
		// Integer型の参照変数tempIに代入しましょう。

		Integer tempI = Integer.valueOf(250);
		System.out.println("問題1：" + tempI);

		// 問題2 IntegerクラスのparseIntメソッドを使用して、
		// String型の"20"をint型に変換しましょう。

		int i = Integer.parseInt("20");
		System.out.println("問題2：" + i);

		// 問題3 IntegerクラスのparseIntメソッドを使用して、
		// 16進数表記のFFをint型（10進数）に変換しましょう。

		int j = Integer.parseInt("FF", 16);
		System.out.println("問題3：" + j);

		// 問題4 StringクラスのvalueOfメソッドを使用して、
		// int型の250をString型に変換しましょう。
		int k = 250;
		String tenpS = String.valueOf(k);
		System.out.println("問題4：" + tenpS);

		// 問題5 Stringクラスのequalsメソッドを使用して、
		// 2つの文字列がイコールか否かを判定しましょう。
		String tempS1 = "おはよう";
		String tempS2 = "おはよう";
		if (tempS1.equals(tempS2)) {
			System.out.println("問題5：同じです。");

		} else {
			System.out.println("問題5：違います。");
		}

		tempS2 = "こんにちは";
		if (tempS1.equals(tempS2)) {
			System.out.println("問題5：同じです。");

		} else {
			System.out.println("問題5：違います。");
		}

		// 問題6 StringクラスのindexOfメソッドを使用して、
		// 文字列の中に「@」が含まれているか判定しましょう。
		String mail = "test@test.co.jp";
		if (-1 != mail.indexOf('@')) {
			System.out.println("問題6：@があります。");

		} else {
			System.out.println("問題6：@がありません。");
		}

		mail = "testtest.co.jp";
		if (-1 != mail.indexOf('@')) {
			System.out.println("問題6：@があります。");

		} else {
			System.out.println("問題6：@がありません。");
		}

		// 問題7 Stringクラスのsubstringメソッドを使用して、
		// 文字列から月の値を抜き出しましょう。
		String thedate = "2010-06-11";
		String month = thedate.substring(5, 7);
		System.out.println("問題7：" + month + "月");

		// 問題8 Stringクラスのsplitメソッドを使用して、
		// 「aa」を区切り文字として分割しましょう。
		String animal = "わんaaにゃーaaこけこっこーaaブヒaaモーaヒヒーン";
		String[] splAnimal = animal.split("aa");

		System.out.println("問題8：");

		for (String str : splAnimal) {
			System.out.println(str);
		}

	}

}

package class_api;

public class InteStrMondai1 {

	public static void main(String[] args) {

		// 問題1 int型の250を内部に持つIntegerクラスのオブジェクトを生成し、
		// Integer型の参照変数tempIに代入しましょう。

		Integer tempI = Integer.valueOf(250);
		System.out.println("問題1：" + tempI);

		// 問題2 IntegerクラスのparseIntメソッドを使用して、
		// String型の"20"をint型に変換しましょう。
		
		tempI= Integer.parseInt("20");
		System.out.println("問題2：" + tempI);
		
		// 問題3 IntegerクラスのparseIntメソッドを使用して、
		// 16進数表記のFFをint型（10進数）に変換しましょう。
		
		tempI＝Integer.parseInt
		System.out.println("問題3：" + tempI);
		
		// 問題4 StringクラスのvalueOfメソッドを使用して、
		// int型の250をString型に変換しましょう。

		System.out.println("問題4：" + tempI);

		// 問題5 Stringクラスのequalsメソッドを使用して、
		// 2つの文字列がイコールか否かを判定しましょう。

		System.out.println("問題5：" + tempI);

		// 問題6 StringクラスのindexOfメソッドを使用して、
		// 文字列の中に「@」が含まれているか判定しましょう。

		System.out.println("問題6：" + tempI);

		// 問題7 Stringクラスのsubstringメソッドを使用して、
		// 文字列から月の値を抜き出しましょう。

		System.out.println("問題7：" + tempI);

		// 問題8 Stringクラスのsplitメソッドを使用して、
		// 「aa」を区切り文字として分割しましょう。

		System.out.println("問題8：" + tempI);

	}

}

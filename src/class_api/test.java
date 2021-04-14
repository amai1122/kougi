package class_api;

public class test {

	public static void main(String[] args) {
		String i = "10";
		int x = 10;
		String myS = "aiueo";

		if (Integer.valueOf(i) == x) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (i == String.valueOf(x)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("５の結果：" + myS.indexOf('C'));


		String myS2 = new String("ABCDEF");

		//文字の長さを取得
		myS2.length();

		//文字（左）を文字（右）に変更する
		myS2.replace('8','b');

		//文字を右の値から検索する
		myS2.startsWith("BC",(1));

		//文字列を値（インデックス）より後ろの文字を取り出す
		myS2.substring(2);

		//文字列を値（インデックス）より後ろの文字を値２の文字数まで取り出す
		//値１はインデックス、値２は文字数なので注意
		myS2.substring(2,4);
		//文字列の両端のスペースを排除する
		myS2.trim();



	}

}

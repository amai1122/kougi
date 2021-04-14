package collection;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// ArrayListクラスのインスタンス化
		List<String> list = new ArrayList<String>();

		// .addメソッドでリストに項目を追加します
		list.add("あ");
		list.add("い");
		list.add("あ");

		// 追加したデータの取得には 拡張for文を使用します
		for (String str : list) {
			// 要素の取得
			System.out.println(str);
		}
	}
}

package collection;

import java.util.ArrayList;
import java.util.List;

public class Mondai7_1 {

	public static void main(String[] args) {


		List<String> list=new ArrayList<String>();// ArrayListクラスのインスタンス化

		list.add("りんご");
		list.add("バナナ");
		list.add("なし");
		list.add("もも");


		// 追加したデータの取得には 拡張for文を使用します// 要素の取得
		for (String str : list) {

			System.out.println(str);
		}
	}

}

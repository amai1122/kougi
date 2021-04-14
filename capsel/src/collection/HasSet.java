package collection;

import java.util.HashSet;
import java.util.Set;

public class HasSet {

	public static void main(String[] args) {
        // HashSetクラスのインスタンス化
        // 左側の型が Set 型である事に注目してください
        Set<String> set = new HashSet<String>();

        // setに項目を追加します
        set.add("あ");
        set.add("い");
        set.add("あ");

        // 追加したデータの取得には 拡張for文 を使用します
        for (String str : set) {
            // 要素の取得
            System.out.println(str);
        }
    }

}

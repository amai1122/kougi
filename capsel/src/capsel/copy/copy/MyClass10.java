package capsel.copy.copy;


public class MyClass10 {

}public static void main(String[] args){
    // 同一パッケージ内のクラスをインスタンス化
    MyClass9 my = new MyClass9();

    // public修飾子付き変数aは、アクセス可
    int x = my.a;

    // protected修飾子付き変数bは、アクセス可
    int y = my.b;

    // 修飾子なし変数cは、アクセス可
    int z = my.c;

    // エラー：private修飾子付き変数dは、アクセス不可
    int w = my.d;
}

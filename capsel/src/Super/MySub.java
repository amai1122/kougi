package Super;

public class MySub extends MySuper {

    // 親クラス「MySuper」クラスのフィールドxとメソッドgetXは、
    // 記述がなくても、定義されています

    // フィールドyの定義
    int y = 20;

    // メソッドgetYの定義
    int getY(){
        return y;
    }
}
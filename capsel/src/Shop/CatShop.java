package Shop;

import CatPac.Cat;

public class CatShop {

    public static void main(String[] args) {
        Cat myCat = new Cat();//コンストラクタ
        CatShop.buyCat(myCat);	//インスタンス化

        myCat = new Cat("アメリカンショートヘアー","オス", 0);//コンストラクタ引数あり
        CatShop.buyCat(myCat);//インスタンス化
    }

    static void buyCat(Cat tCat) {
        System.out.println(tCat.getSyurui()
                + "の"
                + tCat.getSeibetsu()
                + "、"
                + tCat.getToshi() + "歳を買いました。");
    }
}

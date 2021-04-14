package java_Beans;

import java.util.ArrayList;
import java.util.List;

public class Sample_Beans_main {

	public static void main(String[] args) {
        // 個人情報を保持するリストオブジェクト
        List<Sample_Beans> infoList = new ArrayList<Sample_Beans>();

        // 佐藤さんの個人情報を格納するBeanオブジェクトを作成し、リストオブジェクトに追加
        Sample_Beans bean = new Sample_Beans();
        bean.setName("佐藤");
        bean.setFurigana("サトウ");
        bean.setAge(19);
        infoList.add(bean);

        // 伊藤さんの個人情報を格納するBeanオブジェクトを作成し、リストオブジェクトに追加
        bean = new Sample_Beans();
        bean.setName("伊藤");
        bean.setFurigana("イトウ");
        bean.setAge(30);
        infoList.add(bean);

        // 鈴木さんの個人情報を格納するBeanオブジェクトを作成し、リストオブジェクトに追加
        bean = new Sample_Beans();
        bean.setName("鈴木");
        bean.setFurigana("スズキ");
        bean.setAge(25);
        infoList.add(bean);

        // 各個人情報をコンソールに出力
        for (Sample_Beans bn : infoList) {
            System.out.println("名前 : " + bn.getName());
            System.out.println("フリガナ : " + bn.getFurigana());
            System.out.println("年齢 : " + bn.getAge());
            System.out.println("");
        }
    }

}

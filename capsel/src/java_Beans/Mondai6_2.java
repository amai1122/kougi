package java_Beans;

import java.util.ArrayList;
import java.util.List;

public class Mondai6_2 {

	public static void main(String[] args) {
		List<InfoBean> infoList = new ArrayList<InfoBean>();//リストのインスタンス化

		//setterで入力
		InfoBean bean1 = new InfoBean();//インスタンス化
		bean1.setName("佐藤");
		bean1.setAddress("東京都練馬区");
		bean1.setJob("Javaプログラマ");
		bean1.setAge(19);
		infoList.add(bean1);//リストにjavabeansの型で追加

		InfoBean bean2 = new InfoBean();
		bean2.setName("伊藤");
		bean2.setAddress("東京都千代田区");
		bean2.setJob("PHPプログラマ");
		bean2.setAge(30);
		infoList.add(bean2);

		InfoBean bean3 = new InfoBean();
		bean3.setName("鈴木");
		bean3.setAddress("東京都墨田区");
		bean3.setJob("Javaプログラマ");
		bean3.setAge(25);
		infoList.add(bean3);

		InfoBean bean4 = new InfoBean();
		bean4.setName("山崎");
		bean4.setAddress("東京都千代田");
		bean4.setJob("Javaプログラマ");
		bean4.setAge(20);
		infoList.add(bean4);

		// 各個人情報をコンソールに出力(漏えい)
		//リストにあるだけループ
		for (InfoBean bn : infoList) {
			System.out.println(bn.getName() + "\t" + bn.getAddress() + "\t" + bn.getJob() + "\t" + bn.getAge());
		}
	}
}

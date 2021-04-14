package java_Beans;

import java.util.ArrayList;
import java.util.List;

public class Mondai6_1 {
	public static void main(String[] args) {

		List<InfoBean> infoList = new ArrayList<InfoBean>();

		InfoBean bean = new InfoBean();//インスタンス化

		//setterで入力
		bean.setName("山崎");
		bean.setAddress("東京都千代田区");
		bean.setJob("Javaプログラマ");
		bean.setAge(20);
		infoList.add(bean);

		// 各個人情報をコンソールに出力(漏えい)
		for (InfoBean bn : infoList) {
			System.out.println(bn.getName());
			System.out.println(bn.getAddress());
			System.out.println(bn.getJob());
			System.out.println(bn.getAge());
		}
	}

}

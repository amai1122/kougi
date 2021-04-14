package java_Beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Monda_7_1 {

	public static void main(String[] args) {
		List<InfoBean> infoList = new ArrayList<InfoBean>();//リストのインスタンス化

		BufferedReader br = null;

		try {
			// ファイルを指定して読み込むストリームを生成します
			br = new BufferedReader(new FileReader("C:\\temp\\mondaibean.txt"));

			String str = null;

			// ファイルには複数行文字が記述されてる場合もあるので繰り返し処理(一行ずつ読み込み)
			while ((str = br.readLine()) != null) {
				InfoBean bean1 = new InfoBean();//インスタンス化
				//１行を","で分割
				String[] splbeen = str.split(",");
				//InfoBeanに格納
				bean1.setName(splbeen[0]);
				bean1.setAddress(splbeen[1]);
				bean1.setJob(splbeen[2]);
				bean1.setAge(Integer.parseInt(splbeen[3]));//intに変換
				infoList.add(bean1);//リストにjavabeansの型で追加
			}

			// 各個人情報をコンソールに出力
			//リストにあるだけループ
			for (InfoBean bn : infoList) {
				System.out.println(bn.getName() + "\t" + bn.getAddress() + "\t" + bn.getJob() + "\t" + bn.getAge());
			}

		} catch (IOException e) {
			// 例外内容を表示します
			e.printStackTrace();

		} finally {
			if (br != null) {
				try {
					// ストリームをクローズします
					br.close();

				} catch (IOException e) {
					// 例外内容を表示します
					e.printStackTrace();
				}
			}
		}

		//setterで入力

	}

}

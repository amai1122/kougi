package java_beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class mondai7_1 {

	public static void main(String[] args) {
		//テキストファイルの読み込み
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("C:\\temp\\mondaibean.txt"));

			String str = null;

			List<InfoBean> lis = new ArrayList<InfoBean>();

			//読み込んだテキストを,で区切ってjavaBeanに格納

			while ((str = br.readLine()) != null) {

				String[] bean = null;
				bean = str.split(",");//,で区切って配列に入れる
				InfoBean bn = new InfoBean();

				bn.setName(bean[0]);
				bn.setAddress(bean[1]);
				bn.setJob(bean[2]);
				bn.setAge(Integer.valueOf(bean[3]));
				//JabaBean型でリストに格納
				lis.add(bn);
			}
			//Listの内容をコンソールに出力
			for (InfoBean set : lis) {
				System.out.println(set.getName() + "\t" + set.getAddress() + "\t" + set.getJob() + "\t" + set.getAge());
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}

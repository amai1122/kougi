package PetPac;

public class Pet implements PetInterface {

	private String syurui;
	private String seibetsu;
	private int toshi;

	public Pet() {

		syurui = "なぞの生物"; 		//ペットの種類
		seibetsu = "性別不明"; 		//ペットの性別
		toshi = 0; 					//ペットの年
	}

	public void eat() {
		System.out.println("ごはんを食べました。");
	}

	public void play() {
		System.out.println("遊びました");
	}

	public Pet(String syrui, String seibetsu, int toshi) {

		this.syurui = syrui; 		//ペットの種類
		this.seibetsu = seibetsu; 	//ペットの性別
		this.toshi = toshi; 		//ペットの年
	}

	public String getSyurui() {

		return syurui;
	}

	public String getSeibetsu() {

		return seibetsu;
	}

	public int getToshi() {

		return toshi;
	}
}

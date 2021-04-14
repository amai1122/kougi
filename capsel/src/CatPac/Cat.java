package CatPac;

public class Cat extends PetPac.Pet {

	//	private String syurui;
	//	private String seibetsu;
	//	private int toshi;

	public Cat() {
		super("スコティッシュフォールド", "メス", 0);
		//		syurui = "スコティッシュフォールド"; 	//猫の種類
		//		seibetsu = "メス";					//猫の性別
		//		toshi = 0; 							//猫の年

	}

	public Cat(String tSyrui, String tSeibetsu, int tToshi) {
		super(tSyrui, tSeibetsu, tToshi);
		//		syurui = tSyrui; 						//猫の種類
		//		seibetsu = tSeibetsu; 				//猫の性別
		//		toshi = tToshi;						//猫の年
	}
	public void eat() {
		System.out.println("大好きな魚を食べました。");
	}
	public void play() {
		System.out.println("ねずみのおもちゃで遊びました。");
	}


	//	public String getSyurui() {

	//		return syurui;
	//	}

	//	public String getSeibetsu() {

	//		return seibetsu;
	//	}

	//	public int getToshi() {

	//		return toshi;
	//	}

}

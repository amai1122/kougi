package DogPac;

public class Dog extends PetPac.Pet {

	//	private String syurui;
	//	private String seibetsu;
	//	private int toshi;

	public Dog() {
		super("トイプードル", "メス", 0);
		//		syurui = "トイプードル";
		//		seibetsu = "メス";
		//		toshi = 0;

	}

	public Dog(String tSyuru, String tSeibetsu, int tToshi) {
		super(tSyuru, tSeibetsu, tToshi);
		//		syurui = tSyuru;
		//		seibetsu = tSeibetsu;
		//		toshi = tToshi;
	}
	public void eat() {
		System.out.println("大好きな肉を食べました。");
	}
	public void play() {
		System.out.println("公園で走って遊びました。");
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

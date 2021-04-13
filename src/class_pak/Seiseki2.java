package class_pak;

public class Seiseki2 {
	String name;
	int kokugo;
	int sugaku;
	int eigo;

	public Seiseki2(String tName, int tKokugo, int tSugaku, int tEigo) {
		name = tName;
		kokugo = tKokugo;
		sugaku = tSugaku;
		eigo = tEigo;
	}

	String getName() {
		return name;
	}

	int getGoukei() {
		int goukei = kokugo + sugaku + eigo;
		return goukei;
	}
}

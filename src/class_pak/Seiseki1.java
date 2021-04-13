package class_pak;

public class Seiseki1 {
	String name;
	int kokugo;
	int sugaku;
	int eigo;

	Seiseki1() {
		name = "山田";
		kokugo = 100;
		sugaku = 100;
		eigo = 100;
	}

	String getName() {
		return name;
	}

	void printGoukei() {
		int sum=kokugo + sugaku +eigo;
		System.out.println("合計は、"+ sum+"点です。" );
	}
}

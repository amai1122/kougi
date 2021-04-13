package class_pak;

public class ClassMondai2 {

	public static void main(String[] args) {

		Seiseki2 se = new Seiseki2("山田", 80, 90, 100);

		String name = se.getName();
		int goukei = se.getGoukei();

		System.out.println(name + "さんの合計は、" + goukei + "です。");

	}

}

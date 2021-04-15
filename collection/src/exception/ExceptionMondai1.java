package exception;

public class ExceptionMondai1 {

	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(args[0]);

			if (num >= 1000) {
				throw new MyErrException1();
			}
			int kekka = num * 10;

			System.out.println(num + "の10倍は、" + kekka + "です。");

		} catch (NumberFormatException e) {
			System.out.println("数字を入力してください");
		} catch (MyErrException1 e) {
			System.out.println("1000未満の数字を入力してください");
		}

	}

}

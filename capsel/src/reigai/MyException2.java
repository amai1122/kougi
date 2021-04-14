package reigai;

public class MyException2 {

	public static void main(String[] args) {
		int a = 0;
		try {
			if (a == 0) {
				// 意図的に ArithmeticException 例外を発生させます
				throw new ArithmeticException();

			}
		}
		catch(ArithmeticException e){

			System.out.println("MyErrException発生");

		}

	}

}

package exception;

public class Calc {
	public String getBaisu(String str) throws MyErrException2, NumberFormatException {
		int num = Integer.parseInt(str);

		if (num >= 1000) {
			throw new MyErrException2();
		}

		return String.valueOf(num * 10);
	}

}

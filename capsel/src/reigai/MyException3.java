package reigai;

public class MyException3 {

	public static void main(String[] args) {
		int a = 0;

        if (a == 0) {
            // 例外処理は省略できない。
            try {
                throw new MyErrException();

            } catch (MyErrException e) {
                System.out.println("MyErrException発生");
            }
        }

	}
	void myTest() throws ArithmeticException {
	    int a, b, c;
	    a=3;
	    b=0;

	    // ArithmeticException例外が発生
	    c = a / b;
	}

}

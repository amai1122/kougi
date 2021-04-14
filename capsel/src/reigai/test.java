package reigai;

public class test {

	void myTest() throws ArithmeticException, NumberFormatException {
	    int a, b, c, d;
	    a=3;
	    b=0;

	    // NumberFormatException例外の発生の可能性あり
	    d = Integer.parseInt(args[0]);

	    // ArithmeticException例外が発生
	    c = a / b * d;
	}

}

package reigai;

public class MyExceptionSample {

	public static void main(String[] args) {
        // 0除算のためエラー
        try{
        	int x = 5 / 0;
        	System.out.println(x);
        }catch(ArithmeticException e){

        	System.out.println("0除算のためエラー");
        	return;
        }finally {
        	System.out.println("計算終了");
        }
        System.out.println("正常終了");
    }


}

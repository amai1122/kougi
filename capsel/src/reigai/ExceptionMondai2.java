package reigai;

public class ExceptionMondai2 {
    // 引数で渡された値を10倍計算するメソッド
    public static void main(String[] args) {
        String str = "";

        Calc calc = new Calc();

        try {
            str = args[0] + "の10倍は、" + calc.getBaisu(args[0]) + "です。";

        } catch (NumberFormatException e) {
            str = "数字を入力してください";

        } catch (MyErrException2 e) {
            str = "1000未満の数字を入力してください";
        }
        System.out.println(str);
    }
}

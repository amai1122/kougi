package capsel.copy;

public class MyClass9 {
	// 他のパッケージからもアクセスできるクラス

	    // 他のパッケージのクラスからもアクセスできるフィールド
	    public int a;

	    // MyClass9内、同じパッケージ、サブクラスのみアクセス可能なフィールド
	    protected int b;

	    // MyClass9内、同じパッケージ内でアクセス可能なフィールド
	    int c;

	    // MyClass9内でしか使えないフィールド
	    private int d;

	    public void testAccess() {
	        // 全てのフィールドは、MyClass9からアクセス可能
	        a = 0;
	        b = 0;
	        c = 0;
	        d = 0;
	    }

}

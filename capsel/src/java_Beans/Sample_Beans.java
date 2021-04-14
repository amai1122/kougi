package java_Beans;

public class Sample_Beans {
	    // 名前
	    private String name;
	    // フリガナ
	    private String furigana;
	    // 年齢
	    private int age;

	    /**
	     * 名前を取得するメソッド
	     */
	    public String getName() {
	        return name;
	    }

	    /**
	     * 名前を設定するメソッド
	     */
	    public void setName(String name) {
	        this.name = name;
	    }

	    /**
	     * フリガナを取得するメソッド
	     */
	    public String getFurigana() {
	        return furigana;
	    }

	    /**
	     * フリガナを設定するメソッド
	     */
	    public void setFurigana(String furigana) {
	        this.furigana = furigana;
	    }

	    /**
	     * 年齢を取得するメソッド
	     */
	    public int getAge() {
	        return age;
	    }

	    /**
	     * 年齢を設定するメソッド
	     */
	    public void setAge(int age) {
	        this.age = age;
	    }

	}

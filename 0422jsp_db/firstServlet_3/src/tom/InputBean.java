package tom;

import java.io.Serializable;

public class InputBean implements Serializable {

    // serialVersionUIDを指定
    private static final long serialVersionUID = 1L;

    private String name;
    private String furigana;
    private String year;
    private String month;
    private String day;
    private String birthday;

    //練習問題5-2で追加
    private String gender;
    private String bikou;

    public InputBean() {
        name = "";
        furigana = "";
        year = "";
        month = "";
        day = "";
        birthday = "";

      //練習問題5-2で追加
        gender="";
        bikou="";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFurigana() {
        return furigana;
    }
    public void setFurigana(String furigana) {
        this.furigana = furigana;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBikou() {
		return bikou;
	}

	public void setBikou(String bikou) {
		this.bikou = bikou;
	}

}
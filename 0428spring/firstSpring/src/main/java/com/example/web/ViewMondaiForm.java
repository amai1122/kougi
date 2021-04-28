package com.example.web;

public class ViewMondaiForm {

    private String name;
    private String age;
    private String experience;
    private String[] favoriteCountry;
    private String remarksText;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String[] getFavoriteCountry() {
        return favoriteCountry;
    }

    public void setFavoriteCountry(String[] favoriteCountry) {
        this.favoriteCountry = favoriteCountry;
    }

	public String getRemarksText() {
		return remarksText;
	}

	public void setRemarksText(String remarksText) {
		this.remarksText = remarksText;
	}

}
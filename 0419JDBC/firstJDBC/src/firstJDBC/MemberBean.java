package firstJDBC;

public class MemberBean {
	private String name;
	private String prefecture;
	private String city;
	private String oaddress;
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return prefecture
	 */
	public String getPrefecture() {
		return prefecture;
	}
	/**
	 * @param prefecture セットする prefecture
	 */
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	/**
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city セットする city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return oaddress
	 */
	public String getOaddress() {
		return oaddress;
	}
	/**
	 * @param oaddress セットする oaddress
	 */
	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}

}

package java_Beans;

public class InfoBean {
	// 名前
    private String name;
    // 住所
    private String address;
    // 仕事
    private String job;
    // 年齢
    private int age;
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
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address セットする address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param string セットする job
	 */
	public void setJob(String string) {
		this.job = string;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

}

package java_beans;

public class mondai6_1 {

	public static void main(String[] args) {
		InfoBean bean = new InfoBean();

		bean.setName("山崎");
		bean.setAddress("東京都千代田区");
		bean.setJob("javaプログラマ");
		bean.setAge(20);

		System.out.println(bean.getName());
		System.out.println(bean.getAddress());
		System.out.println(bean.getJob());
		System.out.println(bean.getAge());

	}

}

package class_api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mondai8_2 {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();

		ldt = ldt.plusYears(5);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu年MM月月dd日");
		System.out.println("5年後の今日は、" + dtf.format(ldt) + "です。");
	}
}
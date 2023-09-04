import java.time.LocalDate;
import java.time.temporal.*;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		// 2023-08-22

		LocalDate d2 = LocalDate.of(2012, 02, 13);
		System.out.println(d2);
		// 2012-02-13

		LocalDate d3 = LocalDate.parse("2018-05-19");
		System.out.println(d3);
		// 2018-05-19

		System.out.println(d1.plusDays(1));
		// 2023-08-23

		System.out.println(d1.minus(1, ChronoUnit.MONTHS));
		// 2023-07-22

		System.out.println(d2.getDayOfWeek());// Monday
		System.out.println(d3.getDayOfMonth());// 19
		System.out.println(d2.isLeapYear());// true

	}

}

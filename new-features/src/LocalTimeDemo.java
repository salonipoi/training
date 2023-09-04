import java.time.temporal.*;
import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);

		LocalTime t2 = LocalTime.of(06, 30);
		System.out.println(t2);

		LocalTime t3 = LocalTime.parse("09:15");
		System.out.println(t3);

		System.out.println(t2.plus(1, ChronoUnit.HOURS));
		System.out.println(t3.getHour());

		System.out.println(LocalTime.MAX);

	}

}

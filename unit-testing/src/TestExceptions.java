import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class TestExceptions {

	@Test
	public void testDivision() {
		assertThrows(ArithmeticException.class, () -> {int x = 10 / 2;});
	}

	@Test
	public void testParsing() {
		assertThrows(NumberFormatException.class, () -> Integer.parseInt("One"));

	}
}

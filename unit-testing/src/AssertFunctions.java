import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertFunctions {

	@Test
	public void testAssert() {
		String s1 = "JUNIT";
		String s2 = "JUNIT";
//		assertEquals(s1, s2);
//		assertSame(s1, s2);
//		assertNotSame(s1, s2);
//		assertNotNull(s2);
//		assertNull(s1);

		int n1 = 10;
		int n2 = 20;
		// assertTrue(n1 > n2);

		assertFalse(n1 > n2);

	}
}

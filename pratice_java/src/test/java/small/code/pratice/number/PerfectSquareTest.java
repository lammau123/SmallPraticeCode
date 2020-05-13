package small.code.pratice.number;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PerfectSquareTest {
	@Test
	void testPerfectSquare() {
		assertTrue(new PerfectSquare().isPerfectSquare(2147483647) == false);
		assertTrue(new PerfectSquare().isPerfectSquare(100) == true);
		assertTrue(new PerfectSquare().isPerfectSquare(16) == true);
		assertTrue(new PerfectSquare().isPerfectSquare(8) == false);
	}
}

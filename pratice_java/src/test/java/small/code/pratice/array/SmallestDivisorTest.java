package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SmallestDivisorTest {
	@Test
	void testSmallestDivisor() {
		assertTrue(new SmallestDivisor().smallestDivisor(new int[] {1,2,5,9}, 6) == 5);
	}
}

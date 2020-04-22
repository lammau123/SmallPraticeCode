package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MinStartValueTest {
	@Test
	void testMinStartValue() {
		assertTrue(new MinStartValue().minStartValue(new int[] {-3,2,-3,4,2}) == 5);
		assertTrue(new MinStartValue().minStartValue(new int[] {1,2}) == 1);
		assertTrue(new MinStartValue().minStartValue(new int[] {1,-2,-3}) == 5);
	}
}

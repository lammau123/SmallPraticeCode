package small.code.pratice.list;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import small.code.pratice.range.RangeBitwiseAnd;

public class RangeBitwiseAndTest {
	@Test
	void testRangeBitwiseAnd() {
		assertTrue(new RangeBitwiseAnd().rangeBitwiseAnd(2147483646,2147483647) == 2147483646);
		assertTrue(new RangeBitwiseAnd().rangeBitwiseAnd(5,7) == 4);
		assertTrue(new RangeBitwiseAnd().rangeBitwiseAnd(0,1) == 0);
	}
}

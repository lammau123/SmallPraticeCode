package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MaxUncrossedLinesTest {
	@Test
	void testMaxUncrossedLines() {
		assertTrue(new MaxUncrossedLines().maxUncrossedLines(new int[] {1,3,7,1,7,5}, new int[] {1,9,2,5,1}) == 2);
		assertTrue(new MaxUncrossedLines().maxUncrossedLines(new int[] {3,3,3,1}, new int[] {2,2,3,3}) == 2);
		assertTrue(new MaxUncrossedLines().maxUncrossedLines(new int[] {1,4,2}, new int[] {1,2,4}) == 2);
		assertTrue(new MaxUncrossedLines().maxUncrossedLines(new int[] {2,5,1,2,5}, new int[] {10,5,2,1,5,2}) == 3);
	}
}

package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ConstrainedSubsetSumTest {
	@Test
	void testConstrainedSubsetSum() {
		assertTrue(new ConstrainedSubsetSum().constrainedSubsetSum(new int[] {-1, -2, -3, 10}, 2) == 10);
		assertTrue(new ConstrainedSubsetSum().constrainedSubsetSum(new int[] {10,2 ,-1, 1}, 3) == 10);
		assertTrue(new ConstrainedSubsetSum().constrainedSubsetSum(new int[] {10,2, 1}, 1) == 10);
		assertTrue(new ConstrainedSubsetSum().constrainedSubsetSum(new int[] {10,-2,-10,-5,0}, 2) == 23);
		assertTrue(new ConstrainedSubsetSum().constrainedSubsetSum(new int[] {10,-2,-10,-5,20}, 2) == 23);
		assertTrue(new ConstrainedSubsetSum().constrainedSubsetSum(new int[] {-1, -2, -3}, 2) == -3);
		assertTrue(new ConstrainedSubsetSum().constrainedSubsetSum(new int[] {10, 10, 10, 10}, 2) == 10);
	}
}

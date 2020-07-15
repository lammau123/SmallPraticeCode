package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MinSumOfLengthsTest {
	@Test
	void testminSumOfLengths() {
		assertTrue(new MinSumOfLengths().minSumOfLengths(new int[] {1,2,2,3,2,6,7,2,1,4,8}, 5) == 4);
		assertTrue(new MinSumOfLengths().minSumOfLengths(new int[] {3,2,2,4,3}, 3) == 2);
		assertTrue(new MinSumOfLengths().minSumOfLengths(new int[] {7,3,4,7}, 7) == 2);
		assertTrue(new MinSumOfLengths().minSumOfLengths(new int[] {4,3,2,6,2,3,4}, 6) == -1);
		assertTrue(new MinSumOfLengths().minSumOfLengths(new int[] {5,5,4,4,5}, 3) == -1);
		assertTrue(new MinSumOfLengths().minSumOfLengths(new int[] {3,1,1,1,5,1,2,1}, 3) == 3);
	}
}

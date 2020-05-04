package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LongestSubarrayTest {
	@Test
	void testLongestSubarray() {
		assertTrue(new LongestSubarray().longestSubarray(new int[] {4,8,5,1,7,9}, 6) == 3);
		assertTrue(new LongestSubarray().longestSubarray(new int[] {8,2,4,7}, 4) == 2);
		assertTrue(new LongestSubarray().longestSubarray(new int[] {10,1,2,4,7,2}, 5) == 4);
		assertTrue(new LongestSubarray().longestSubarray(new int[] {4,2,2,2,4,4,2,2}, 0) == 3);
	}
}

package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SubarraySumTest {
	@Test
	void testSubarraySum() {
		assertTrue(new SubarraySum().subarraySum(new int[] {2,2,2}, 2) == 3);
		assertTrue(new SubarraySum().subarraySum(new int[] {1,1,1,1}, 2) == 3);
		assertTrue(new SubarraySum().subarraySum(new int[] {0,0,0,0,0,0,0,0,0,0}, 0) == 55);
		assertTrue(new SubarraySum().subarraySum(new int[] {1,2,1,2,1}, 3) == 4);
		assertTrue(new SubarraySum().subarraySum(new int[] {1,2,3}, 3) == 2);
	}
}

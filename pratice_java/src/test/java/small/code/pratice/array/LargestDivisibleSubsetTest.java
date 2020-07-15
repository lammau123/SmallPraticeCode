package small.code.pratice.array;

import org.junit.jupiter.api.Test;

public class LargestDivisibleSubsetTest {
	@Test
	void testLargestDivisibleSubset() {
		new LargestDivisibleSubset().largestDivisibleSubset(new int[] {2,3,8,9,27});
		new LargestDivisibleSubset().largestDivisibleSubset(new int[] {4,8,10,240});
		new LargestDivisibleSubset().largestDivisibleSubset(new int[] {2,3});
		new LargestDivisibleSubset().largestDivisibleSubset(new int[] {});
		new LargestDivisibleSubset().largestDivisibleSubset(new int[] {1,2,3});
		new LargestDivisibleSubset().largestDivisibleSubset(new int[] {1,2,4,8});
	}
}

package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MinPathSumTest {
	@Test
	void testMinPathSum() {
		assertTrue(new MinPathSum().minPathSum(new int[] [] {{1,3,1}, {1,5,1}, {4,2,1}}) == 7);
	}
}

package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class KthSmallestTest {
	@Test
	void testKthSmallest() {
		
		assertTrue(new KthSmallest().kthSmallest(new int[][] {{1,10,10},{1,4,5},{2,3,6}}, 7) == 9);
		assertTrue(new KthSmallest().kthSmallest(new int[][] {{1,3,11},{2,4,6}}, 9) == 17);
		assertTrue(new KthSmallest().kthSmallest(new int[][] {{1,3,11},{2,4,6}}, 5) == 7);
	}
}

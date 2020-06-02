package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MinReorderTest {
	@Test
	void testMinReorder() {		
		assertTrue(new MinReorder().minReorder(10, new int[] []{{0,1},{2,1},{3,2},{0,4},{5,1},{2,6},{5,7},{3,8},{8,9}}) == 6);
		assertTrue(new MinReorder().minReorder(6, new int[] []{{0,1},{1,3},{2,3},{4,0},{4,5}}) == 3);
		assertTrue(new MinReorder().minReorder(5, new int[] []{{1,0},{1,2},{3,2},{3,4}}) == 2);
		assertTrue(new MinReorder().minReorder(3, new int[] []{{1,0},{2,0}}) == 0);
	}
}
